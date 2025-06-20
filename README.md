This is A Kotlin Multiplatform project targeting Android, iOS.

- `/app1` & `/app2` are compose multiplatform modules.
- `/iosApp` & `/iosApp2` are ios projects that use the shared framework from `/app1` & `/app2`.
- `/shared` is the common resources & data & ui between `/app1` & `/app2` and they both use it.
