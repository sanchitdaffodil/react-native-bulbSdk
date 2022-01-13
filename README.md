# bulbsdk

wrapper for bulb sdk

## Installation

```sh
npm install bulbsdk
```
### For Android

##### 2) Open AndroidManifest.xml from the android folder and add the following lines:

---

- In the manifest tag

```sh
xmlns:tools="http://schemas.android.com/tools"
```

- In the application tag

```sh
tools:replace="android:theme,android:allowBackup"
```

- In the activity tag

```sh
android:exported="true"
```

##### Sample AndroidManifest.xml:

```sh
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    package="com.bulbdemo">

    <uses-permission android:name="android.permission.INTERNET" />

    <application
      android:name=".MainApplication"
      android:label="@string/app_name"
      android:icon="@mipmap/ic_launcher"
      android:roundIcon="@mipmap/ic_launcher_round"
      android:allowBackup="false"
      tools:replace="android:theme,android:allowBackup"
      android:theme="@style/AppTheme">
      <activity
        android:name=".MainActivity"
        android:label="@string/app_name"
        android:configChanges="keyboard|keyboardHidden|orientation|screenSize|uiMode"
        android:launchMode="singleTask"
        android:windowSoftInputMode="adjustResize"
        android:exported="true">
        <intent-filter>
            <action android:name="android.intent.action.MAIN" />
            <category android:name="android.intent.category.LAUNCHER" />
        </intent-filter>
      </activity>
    </application>
</manifest>
```

- In the project level build.gradle file add this under dependancies

```sh
implementation 'com.bulbshare:app:1.5.1'
```

- In the project level build.gradle file add this under android

```sh
packagingOptions.pickFirst("lib/*/libc++_shared.so")
```

##### Sample build.gradle:

```sh
android {
    ndkVersion rootProject.ext.ndkVersion
    compileSdkVersion 31

    defaultConfig {
        applicationId "com.bulbdemo"
        minSdkVersion 23
        targetSdkVersion 31
        versionCode 1
        versionName "1.0"
    }
    packagingOptions.pickFirst("lib/*/libc++_shared.so")

    ... 
}

dependencies {
    implementation fileTree(dir: "libs", include: ["*.jar"])
    //noinspection GradleDynamicVersion
    implementation "com.facebook.react:react-native:+"  // From node_modules
    implementation 'com.bulbshare:app:1.5.1'
    implementation "androidx.swiperefreshlayout:swiperefreshlayout:1.0.0"
    ......
}
```

## Usage

```js
import { authenticate, open, callBriefIntro, callFeedScreen, callBriefSurvey, callCreateBulbShare, callMyProfile  } from "bulbsdk";

// ...

const result = await authenticate("useremail", "password");


// ... After the successful authentication use these methods
open();
callBriefIntro(briefRef);
callFeedScreen();
callBriefSurvey(briefRef)
callCreateBulbShare(briefRef);
callMyProfile();
```

## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MIT
