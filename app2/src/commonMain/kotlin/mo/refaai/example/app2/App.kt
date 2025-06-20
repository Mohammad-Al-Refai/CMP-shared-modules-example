package mo.refaai.example.app2

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import mo.refaai.shared.data.ToolItem
import mo.refaai.shared.data.ToolsData
import mo.refaai.shared.resources.SharedResources
import mo.refaai.shared.ui.theme.HSpacing
import mo.refaai.shared.ui.theme.SharedTheme
import mo.refaai.shared.ui.theme.VSpacing
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview


@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun App() {
    val selectedItem = remember { mutableStateOf<ToolItem?>(null) }
    val dialogVisible = remember { mutableStateOf(false) }

    SharedTheme {
        Scaffold(modifier = Modifier.fillMaxSize(), topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(SharedResources.Strings.hitman),
                        fontWeight = FontWeight.Bold
                    )
                },
            )
        }) { innerPadding ->
            DetailsDialog(
                data = selectedItem.value,
                visible = dialogVisible.value,
                onDismissRequest = {
                    dialogVisible.value = false
                    selectedItem.value = null
                })
            Column(
                modifier = Modifier.fillMaxSize()
                    .padding(
                        top = innerPadding.calculateTopPadding(),
                        bottom = innerPadding.calculateBottomPadding(),
                        start = HSpacing.M.value,
                        end = HSpacing.M.value
                    ),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                LazyVerticalGrid(columns = GridCells.Fixed(2), modifier = Modifier.fillMaxSize()) {
                    items(ToolsData.size) { index ->
                        val data = ToolsData[index]
                        Card(
                            modifier = Modifier.fillMaxWidth()
                                .padding(top = VSpacing.M.value, end = HSpacing.M.value).clickable {
                                    selectedItem.value = data
                                    dialogVisible.value = true
                                }
                        ) {
                            Column(
                                modifier = Modifier.fillMaxSize().padding(
                                    vertical = VSpacing.M.value,
                                    horizontal = HSpacing.M.value
                                )
                            ) {
                                Image(
                                    painter = painterResource(data.imageResource),
                                    contentScale = ContentScale.Fit,
                                    contentDescription = null
                                )
                                Text(
                                    text = stringResource(data.title),
                                    fontSize = MaterialTheme.typography.titleLarge.fontSize,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.error
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
internal fun DetailsDialog(data: ToolItem?, onDismissRequest: () -> Unit, visible: Boolean) {
    if (!visible || data == null) return

    Dialog(
        onDismissRequest = onDismissRequest, properties = DialogProperties(
            usePlatformDefaultWidth = true,
            dismissOnBackPress = true,
            dismissOnClickOutside = true
        )
    ) {
        Card(
            modifier = Modifier
                .padding(top = VSpacing.M.value, end = HSpacing.M.value)
        ) {
            Column(
                modifier = Modifier.padding(
                    vertical = VSpacing.M.value,
                    horizontal = HSpacing.M.value
                )
            ) {
                Image(
                    painter = painterResource(data.imageResource),
                    contentScale = ContentScale.Fit,
                    contentDescription = null
                )
                Text(
                    text = stringResource(data.title),
                    fontSize = MaterialTheme.typography.titleLarge.fontSize,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.error
                )
                Text(
                    text = stringResource(data.description),
                    fontSize = MaterialTheme.typography.titleSmall.fontSize,
                    fontWeight = FontWeight.Bold
                )
                Button(onClick = onDismissRequest, modifier = Modifier.fillMaxWidth()) {
                    Text(stringResource(SharedResources.Strings.close))
                }
            }
        }
    }
}