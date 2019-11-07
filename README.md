# react-native-device-security

## Getting started

`$ npm install react-native-device-security --save`

### Mostly automatic installation

`$ react-native link react-native-device-security`

### Manual installation

#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`

2. Go to `node_modules` ➜ `react-native-device-security` and add `DeviceSecurity.xcodeproj`

3. In XCode, in the project navigator, select your project. Add `libDeviceSecurity.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`

4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`

- Add `import com.reactlibrary.DeviceSecurityPackage;` to the imports at the top of the file

- Add `new DeviceSecurityPackage()` to the list returned by the `getPackages()` method

2. Append the following lines to `android/settings.gradle`:

```

include ':react-native-device-security'

project(':react-native-device-security').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-device-security/android')

```

3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:

```

compile project(':react-native-device-security')

```

## Usage

```javascript
import DeviceSecurity from "react-native-device-security";

DeviceSecurity.isAdbEnabled().then(enabled => {
  // ...
});
// you can call all functions in below table
```

| Method          | Return Type       | iOS | Android |
| --------------- | ----------------- | :-: | :-----: |
| isAdbEnabled () | `Promise<string>` | ❌  |   ✅    |
| isRooted ()     | `Promise<string>` | ❌  |   ✅    |
