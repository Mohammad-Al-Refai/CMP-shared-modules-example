package mo.refaai.example

//import MultipleAppsInOne.IosLibKotlinBridge
import com.example.ioslib.IosLibKotlinBridge

@OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)
object XYZ {
    fun x(){
        println("Calling getHelloFromLocalLib from IosLibKotlinBridge via Kotlin/Native...")
        IosLibKotlinBridge.getHelloFromLocalLibWithName(name = "Mohammad")
    }
}
