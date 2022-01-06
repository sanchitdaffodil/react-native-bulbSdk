import Foundation
import UIKit
import BulbshareSDK
@objc(Bulbsdk)
class Bulbsdk: NSObject {
    @objc(multiply:withB:)
    func multiply(a: Float, b: Float) -> Void {
        let sharedinst = BulbshareClient.shared(config: BSSDKConfig())
        let obj = BSAuthenticationInput.init(email: "swati.agarwal@unthinkable.co", password: "sdktest903$")
                sharedinst.authenticate(input: obj)
        
        
        //resolve(a*b)
    }
}
