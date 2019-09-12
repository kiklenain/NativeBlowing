
# react-native-native-blowing

## Getting started

`$ npm install react-native-native-blowing --save`

### Mostly automatic installation

`$ react-native link react-native-native-blowing`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-native-blowing` and add `RNNativeBlowing.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNNativeBlowing.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNNativeBlowingPackage;` to the imports at the top of the file
  - Add `new RNNativeBlowingPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-native-blowing'
  	project(':react-native-native-blowing').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-native-blowing/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-native-blowing')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNNativeBlowing.sln` in `node_modules/react-native-native-blowing/windows/RNNativeBlowing.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Native.Blowing.RNNativeBlowing;` to the usings at the top of the file
  - Add `new RNNativeBlowingPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNNativeBlowing from 'react-native-native-blowing';

// TODO: What to do with the module?
RNNativeBlowing;
```
  