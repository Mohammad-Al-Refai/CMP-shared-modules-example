package mo.refaai.example

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import mo.refaai.shared.data.ToolsData
import mo.refaai.shared.resources.SharedResources
import mo.refaai.shared.ui.components.HitmanImage
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
            HitmanImage()
            Box(
                modifier = Modifier.padding(
                    top = innerPadding.calculateTopPadding() + VSpacing.XL3.value,
                    bottom = innerPadding.calculateBottomPadding(),
                    start = HSpacing.M.value,
                    end = HSpacing.M.value
                ).fillMaxSize()
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    LazyColumn(modifier = Modifier.fillMaxSize()) {
                        items(ToolsData.size) { index ->
                            val data = ToolsData[index]
                            Card(
                                modifier = Modifier.fillMaxWidth().padding(top = VSpacing.M.value)
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
                                    Text(
                                        text = stringResource(data.description),
                                        fontSize = MaterialTheme.typography.titleSmall.fontSize,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}