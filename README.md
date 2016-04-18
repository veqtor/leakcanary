# LeakCanary NO-OP Extended

[![Release](https://jitpack.io/v/veqtor/leakcanary-android-no-op-extended.svg)](https://jitpack.io/#Veqtor/leakcanary-android-no-op-extended)

This is only an extended no-op lib, for use if you do not wish to have separate Application class implementations for debug and release, for information on LeakCanary see: [LeakCanary github](https://github.com/square/leakcanary/)

![screenshot.png](assets/screenshot.png)

## Getting started

In your `build.gradle`:

```gradle
 dependencies {
   debugCompile 'com.squareup.leakcanary:leakcanary-android:1.4-beta2'
   releaseCompile 'com.github.Veqtor:leakcanary-android-no-op-extended:1.5.5'
   testCompile 'com.github.Veqtor:leakcanary-android-no-op-extended:1.5.5'
 }
```

In your `Application` class:

```java
public class ExampleApplication extends Application {

  @Override public void onCreate() {
    super.onCreate();
    LeakCanary.install(this);
  }
}
```

**You're good to go!** LeakCanary will automatically show a notification when an activity memory leak is detected in your debug build.

Questions? Check out [the FAQ](https://github.com/square/leakcanary/wiki/FAQ)!

![icon_512.png](assets/icon_512.png)

## License

    Copyright 2015 Square, Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
