This is A Kotlin Multiplatform project targeting Android, iOS.

- `/app1` & `/app2` are compose multiplatform modules.
- `/iosApp` & `/iosApp2` are ios projects that use the shared framework from `/app1` & `/app2`.
- `/shared` is the common resources & data & ui between `/app1` & `/app2` and they both use it.
- `/IosLib` is an SPM package that contain shared swift code that can be consumed by `/iosApp` & `/iosApp2` also generate code form Objective-C headers to feed `/shared/iosMain` to use it in kotlin


### Project architecture

![image](https://github.com/user-attachments/assets/bdc63ef0-fadd-40d6-9577-4c1a7dc2f5e9)
