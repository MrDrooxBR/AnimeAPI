# Usagi API Wrapper

To use, You need add jitpack repository(Sorry, i don't have a Maven Repository) 
<br>

### Gradle

<br>

```gradle
repositories {
     maven { 
        url 'https://jitpack.io' 
     }
}
```

<br>

### Maven
<br>

```xml
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>
```

And add the dependecy....<br>
<br>

### Gradle 
<br>

```gradle
dependencies {
    implementation 'com.github.ShadowB64:UsagiAPISimple:7724995560'
}
```

<br>
### Maven

```xml
 <dependency>
	 <groupId>com.github.ShadowB64</groupId>
	 <artifactId>UsagiAPISimple</artifactId>
	 <version>7724995560</version>
</dependency>
```

How to use this package ? <br>

```kotlin
fun main() { 
    println(UsagiAPIClient().kiss())
}
```
