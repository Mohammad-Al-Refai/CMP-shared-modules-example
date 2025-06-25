### This is a Kotlin Multiplatform project targeting multiple Android, iOS projects with shared code.

- `/app1` & `/app2` are compose multiplatform modules.
- `/iosApp` & `/iosApp2` are ios projects that use the shared framework from `/app1` & `/app2`.
- `/shared` is the common resources & data & ui between `/app1` & `/app2` and they both use it.
- `/IosLib` is an SPM package that contain shared swift code that can be consumed by `/iosApp` & `/iosApp2` also generate code form Objective-C headers to feed `/shared/iosMain` to use it in kotlin


### Project architecture


![Screenshot 2025-06-25 at 6 58 02 AM](https://github.com/user-attachments/assets/d2197cea-5a22-4406-972c-6b7a7b396988)
