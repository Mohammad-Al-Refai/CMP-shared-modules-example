package mo.refaai.shared.data


import mo.refaai.shared.resources.SharedResources
import multipleappsinone.shared.generated.resources.Res
import multipleappsinone.shared.generated.resources.aboutBriefcase
import multipleappsinone.shared.generated.resources.aboutLockpick
import multipleappsinone.shared.generated.resources.aboutRubberDucky
import multipleappsinone.shared.generated.resources.aboutSilverballer
import multipleappsinone.shared.generated.resources.briefcase
import multipleappsinone.shared.generated.resources.duck
import multipleappsinone.shared.generated.resources.lockpick
import multipleappsinone.shared.generated.resources.rubberDucky
import multipleappsinone.shared.generated.resources.silverballer
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource

data class ToolItem(
    val title: StringResource,
    val description: StringResource,
    val imageResource: DrawableResource
)

val ToolsData = arrayOf(
    ToolItem(
        title = Res.string.silverballer,
        description =  Res.string.aboutSilverballer,
        imageResource =  Res.drawable.silverballer
    ), ToolItem(
        title =  Res.string.lockpick,
        description =  Res.string.aboutLockpick,
        imageResource =  Res.drawable.lockpick
    ), ToolItem(
        title =  Res.string.briefcase,
        description =  Res.string.aboutBriefcase,
        imageResource =  Res.drawable.briefcase
    ), ToolItem(
        title =  Res.string.rubberDucky,
        description =  Res.string.aboutRubberDucky,
        imageResource =  Res.drawable.duck
    )
)