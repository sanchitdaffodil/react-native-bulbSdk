
Pod::Spec.new do |spec|

 

  spec.name         = "BulbshareSDK"
  spec.version      = "0.1.1"
  spec.summary      = "this is the details of BulbshareSDK."

 
  spec.description  = "this is the summary of sdk which can be used in the app"

  spec.homepage     = "https://bitbucket.org/swatidaffodilsw/ios-sdk/"

spec.license      = { :type => "BulbshareSDK", :file => "BS_LICENSE" }

  spec.author             = { "Swati Agarwal" => "swati.agarwal@daffodilsw.com" }
  spec.platform     = :ios, "12.1"
  spec.source       = { :git => "https://swatidaffodilsw@bitbucket.org/daffodilsoftware/bulbshare-ios-sdk.git", :tag => "#{spec.version}" }

  # when use pod spec lint, use this vendor framework path
  spec.ios.vendored_frameworks = 'BulbshareSDK/BulbshareSDK.xcframework'
  # when use pod lib lint, use this vendor framework path
  # spec.ios.vendored_frameworks = 'BulbshareSDK.xcframework'
  spec.static_framework = true
  spec.requires_arc = true


  # ――― Resources ―――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――― #
  #
  #  A list of resources included with the Pod. These are copied into the
  #  target bundle with a build phase script. Anything else will be cleaned.
  #  You can preserve files from being cleaned, please don't preserve
  #  non-essential files like tests, examples and documentation.
  #

  # spec.resource  = "icon.png"
  # spec.resources = "Resources/*.png"

  # spec.preserve_paths = "FilesToSave", "MoreFilesToSave"


  # ――― Project Linking ―――――――――――――――――――――――――――――――――――――――――――――――――――――――――― #
  #
  #  Link your library with frameworks, or libraries. Libraries do not include
  #  the lib prefix of their name.
  #

  # spec.framework  = "SomeFramework"
  #spec.frameworks = "SDWebImage","SwiftLint"

  # spec.library   = "iconv"
  # spec.libraries = "iconv", "xml2"


  # ――― Project Settings ――――――――――――――――――――――――――――――――――――――――――――――――――――――――― #
  #
  #  If your library depends on compiler flags you can set them in the xcconfig hash
  #  where they will only apply to your library. If you depend on other Podspecs
  #  you can include multiple dependencies to ensure it works.

  # spec.requires_arc = true

  # spec.xcconfig = { "HEADER_SEARCH_PATHS" => "$(SDKROOT)/usr/include/libxml2" }
  # spec.dependency "JSONKit", "~> 1.4"

end


