package mo.refaai.shared.services

actual class GreetingService {
   actual fun sayHello(name: String): String{
        return "Hello, $name!"
    }
}