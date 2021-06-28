If you want to use this wrapper, first, you'll need JitPack, you can see how to install JitPack [here](https://jitpack.io)

Then, add UsagiAPI as a dependency

### Gradle:
<br>

```gradle
dependencies {
    implementation("com.github.ShadowB64:UsagiAPI:b1440b3858")
}
```

### Maven
<br>

```xml
 <dependency>
	 <groupId>com.github.ShadowB64</groupId>
	 <artifactId>UsagiAPI</artifactId>
	 <version>b1440b3858</version>
</dependency>
```

## How can I use this wrapper?
### Here is a simple example on how to get a kiss gif:
<br>

```kotlin
fun main() { 
    println(UsagiAPI.kiss())
}
```

## What are the endpoints that I can use?
```
.bite()
.bowdown()
.dance()
.feed()
.hug()
.kiss()
.pat()
.poke()
.slap()
.tickle()
.wasted()
```
