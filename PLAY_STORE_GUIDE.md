# Star Blaster - Android App

## Project Structure

```
app/
├── src/main/
│   ├── java/com/starblaster/game/
│   │   ├── MainActivity.kt          # WebView activity
│   │   └── WebViewDebugHelper.kt    # Debug utilities
│   ├── assets/
│   │   └── index.html               # Game HTML/CSS/JS
│   ├── res/
│   │   ├── layout/
│   │   │   └── activity_main.xml    # UI layout
│   │   ├── values/
│   │   │   ├── strings.xml
│   │   │   ├── colors.xml
│   │   │   └── themes.xml
│   │   ├── mipmap/
│   │   │   └── ic_launcher.png      # ⚠️ ADD YOUR ICON HERE (192x192)
│   │   └── xml/
│   │       ├── backup_rules.xml
│   │       └── data_extraction_rules.xml
│   └── AndroidManifest.xml
├── build.gradle.kts
└── proguard-rules.pro
```

## App Icon Setup ✨

### 1. Generate Icons

Create a **192×192px** PNG for your app icon and save as:
```
app/src/main/res/mipmap/ic_launcher.png
```

**OR use Android Studio's built-in tool:**
1. Right-click `app/src/main/res` → New → Image Asset
2. Select your icon image (512×512px recommended)
3. Configure size and legacy support
4. Click Generate

### 2. App Configuration

All metadata is in `app/src/main/res/values/strings.xml`:
- App name: `⭐ Star Blaster`
- Description: Already set

## Build Release APK

### Using Gradle:
```bash
# Build release bundle (preferred for Play Store)
./gradlew bundleRelease

# Build release APK
./gradlew assembleRelease
```

### Signing Configuration

Create `keystore.properties` in project root:
```properties
storeFile=path/to/release-key.jks
storePassword=your_store_password
keyAlias=your_key_alias
keyPassword=your_key_password
```

Update `app/build.gradle.kts` signing block:
```kotlin
signingConfigs {
    create("release") {
        storeFile = file(keystorePropertiesFile["storeFile"] as String)
        storePassword = keystorePropertiesFile["storePassword"] as String
        keyAlias = keystorePropertiesFile["keyAlias"] as String
        keyPassword = keystorePropertiesFile["keyPassword"] as String
    }
}
```

## Play Store Submission Checklist

- [ ] App icon added (192×192px PNG)
- [ ] Version code incremented
- [ ] Release APK/Bundle built and signed
- [ ] Privacy Policy URL prepared
- [ ] 2-4 screenshots captured (1080×1920px)
- [ ] Short description (80 chars max)
- [ ] Full description (4000 chars max)
- [ ] Category: Games
- [ ] Content rating questionnaire completed
- [ ] Price set (Free recommended)
- [ ] Target countries selected

## Testing

### Debug Install:
```bash
./gradlew installDebug
```

### Emulator:
1. Open Android Emulator
2. Run `./gradlew installDebug`
3. Or drag APK into emulator

## Version Management

Update in `app/build.gradle.kts`:
```kotlin
versionCode = 1    // Increment for each release
versionName = "1.0.0"  // Semantic versioning
```

## Play Store Links

1. [Google Play Console](https://play.google.com/console)
2. Create app → Upload bundle → Fill metadata → Submit

---

**Ready to submit? Head to [Google Play Console](https://play.google.com/console)!**
