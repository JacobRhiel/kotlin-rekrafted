# Kotlin Rekrafted
> ###### Note: This is an actively developed repository please use the most recent stable version

###### This library provides the most recent: 1.3.70 version of kotlin-stblib, kotlin-reflection, and [Kotlin](https://ore.spongepowered.org/linkout?remoteUrl=https%3A%2F%2Fkotlinlang.org%2F) specific extensions for the sponge-api version 7.1.0.

# License
###### Licensed under the [MIT License](https://ore.spongepowered.org/linkout?remoteUrl=http%3A%2F%2Fopensource.org%2Flicenses%2FMIT)

# Depending on Kotlin-Rekrafted
Follow the instructions below to depend on kotlin.
* [Gradle](https://ore.spongepowered.org/linkout?remoteUrl=https%3A%2F%2Fkotlinlang.org%2Fdocs%2Freference%2Fusing-gradle.html)
* [Maven](https://ore.spongepowered.org/linkout?remoteUrl=https%3A%2F%2Fkotlinlang.org%2Fdocs%2Freference%2Fusing-maven.html)

# Depending on Kotlin-Rekrafted - Plugin

In order to make sure your plugin both requires and loads after Kotlin-Rekrafted, add this to your @Plugin annotation:

```kotlin 
@[Plugin(dependencies = arrayOf(Dependency(id = "spotlin", 
                                           optional = false, 
                                           version = "0.1.3")))]
class PluginClass
```

You will also need to add this to your mcmod.info file:

```kotlin
{
    "requiredMods": [
        "kotlin-rekrafted@1.0.0"
    ]
}
```

#### Special thanks to [pxlpowered/spotlin](https://ore.spongepowered.org/pxlpowered/Spotlin) for the layout.
