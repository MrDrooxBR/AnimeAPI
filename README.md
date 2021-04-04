If you want to use this wrapper, first of all, you'll need JitPack, you can see how to install JitPack [here](https://jitpack.io)

Then, add UsagiAPISimple as a dependency

### Gradle:
<br>

```gradle
dependencies {
    implementation 'com.github.ShadowB64:UsagiAPISimple:7724995560'
}
```

### Maven
<br>

```xml
 <dependency>
	 <groupId>com.github.ShadowB64</groupId>
	 <artifactId>UsagiAPISimple</artifactId>
	 <version>7724995560</version>
</dependency>
```

## How can I use this wrapper?
### Here is a simple example on how to get a kiss gif:
<br>
```kotlin
fun main() { 
    println(UsagiAPIClient().kiss())
}
```

## What are the endpoints that I can use?
```
.dance()
.feed()
.hug()
.kiss()
.pat()
.poke()
.slap()
.tickle()
```
