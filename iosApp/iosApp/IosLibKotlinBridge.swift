import Foundation
import IosLib

@objcMembers
public class IosLibKotlinBridge: NSObject {

    @objc public static func getHelloFromLocalLib(name: String) -> String {
        let testClassInstance = TestClass() // Instantiate TestClass from IosLib
        return testClassInstance.sayHello(name: name)
    }
}
