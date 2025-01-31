This is the FTCLib library that has Pedro integration. You can use it by importing `com.pedropathing:ftclib:{VERSION}`, where `{VERSION}` is the version below:

[![Latest Pedro Version](https://img.shields.io/badge/dynamic/xml?url=https%3A%2F%2Fpedro-pathing.github.io%2Fmaven.pedropathing.com%2Fcom%2Fpedropathing%2Fftclib%2Fmaven-metadata.xml&query=%2Fmetadata%2Fversioning%2Flatest&style=for-the-badge&label=Build&labelColor=111111&color=7b39ab)](https://github.com/Pedro-Pathing/)

You will need to have the same pedro version as the pedro-ftclib version above along with ftclib in your `dependencies{}` block in your `build.dependencies.gradle`. Assume the version is `1.0.7`:

```groovy
 implementation 'com.pedropathing:pedro:1.0.7'
 implementation 'com.pedropathing:ftclib:1.0.7'
 implementation 'org.ftclib.ftclib:core:2.1.1'
```
