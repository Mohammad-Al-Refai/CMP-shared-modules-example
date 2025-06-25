package mo.refaai.shared.services

import com.example.ioslib.TestClass

@OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)
actual class GreetingService {
    private val iosLib = TestClass()

    actual fun sayHello(name: String): String {
        return iosLib.sayHelloWithName(name = name)
    }
}
