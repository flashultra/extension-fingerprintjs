# extension-fingerprintjs
This library is externs for a FingerprintJS ( https://github.com/fingerprintjs/fingerprintjs-android ).

To use it you need to :

**1. Add these lines to your build.gradle (main)**
```
allprojects {
	repositories {
		jcenter()
		mavenCentral()
		google()
		maven { url 'https://maven.fpregistry.io/releases' }
		maven { url 'https://jitpack.io' }
	}
}
```
**2. Add these lines to your build.gradle (app)**
```
android {
	 ........
	 ........
	
	compileOptions {
		sourceCompatibility 1.8
		targetCompatibility 1.8
	}
}
```
