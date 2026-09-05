# Star Blaster - Complete Setup Instructions

## 🚀 Quick Start

### 1. Clone & Open
```bash
git clone https://github.com/sayandas16990-beep/StarBlaster.git
cd StarBlaster
```

Open in Android Studio (File > Open > Select project folder)

### 2. Add App Icon

**Option A: Auto-Generate (Recommended)**
1. Right-click `app/src/main/res` in Android Studio
2. Select `New > Image Asset`
3. Upload a **512×512px PNG** (or use star emoji graphic)
4. Choose `Launcher Icons`
5. Click `Generate`

**Option B: Manual**
1. Get a **192×192px PNG** icon
2. Save as: `app/src/main/res/mipmap/ic_launcher.png`

### 3. Build & Test

```bash
# Build debug APK
./gradlew assembleDebug

# Install to device/emulator
./gradlew installDebug

# Or run directly
./gradlew run
```

### 4. Test Gameplay
- Tap stars to score points
- Press Space to pause (on emulator)
- Try to beat your high score
- Verify localStorage persistence

---

## 📱 Building for Play Store

### Step 1: Create Release Keystore

```bash
keytool -genkey -v -keystore release-key.jks \
  -keyalg RSA -keysize 2048 -validity 10000 \
  -alias star_blaster
```

When prompted:
- **Keystore password:** Your secure password
- **Key password:** Same as keystore
- **First name:** Star Blaster
- **Surname:** Game
- **Organization:** Your name
- **Organization unit:** Games
- **City:** Your city
- **State:** Your state
- **Country:** US

**Keep `release-key.jks` safe! Don't commit to Git.**

### Step 2: Configure Signing

Create `keystore.properties` in project root (NOT in Git):

```properties
storeFile=../release-key.jks
storePassword=your_keystore_password_here
keyAlias=star_blaster
keyPassword=your_key_password_here
```

### Step 3: Update build.gradle.kts

Update `app/build.gradle.kts` signing config:

```kotlin
android {
    // ... existing config ...
    
    signingConfigs {
        create("release") {
            val keystorePropertiesFile = rootProject.file("keystore.properties")
            val keystoreProperties = java.util.Properties().apply {
                load(keystorePropertiesFile.inputStream())
            }
            storeFile = file(keystoreProperties["storeFile"] as String)
            storePassword = keystoreProperties["storePassword"] as String
            keyAlias = keystoreProperties["keyAlias"] as String
            keyPassword = keystoreProperties["keyPassword"] as String
        }
    }

    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("release")
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}
```

### Step 4: Build Release Bundle

```bash
# Build App Bundle (preferred for Play Store)
./gradlew bundleRelease

# Output: app/build/outputs/bundle/release/app-release.aab

# OR build APK
./gradlew assembleRelease

# Output: app/build/outputs/apk/release/app-release.apk
```

### Step 5: Verify Signing

```bash
keytool -printcert -jarfile app/build/outputs/apk/release/app-release.apk
```

---

## 📤 Upload to Play Store

### Prerequisites:
1. Google Play Developer Account ($25 one-time)
2. Signed APK/Bundle ready
3. Marketing assets prepared (see MARKETING_ASSETS.md)

### Upload Process:

1. **Go to [Google Play Console](https://play.google.com/console)**
2. **Click "Create app"**
3. **Fill in app details:**
   - Name: Star Blaster
   - Default language: English
   - App type: Game
   - Category: Casual
   - Free/Paid: Free

4. **Navigate to "Release" section:**
   - Select "Production"
   - Click "Create new release"

5. **Upload your bundle/APK:**
   - `app/build/outputs/bundle/release/app-release.aab`

6. **Fill in Release Notes:**
   - "Initial release - Star Blaster arcade game"

7. **Go to "Store presence":**
   - Short description: "Catch stars before time runs out!"
   - Full description: (from MARKETING_ASSETS.md)
   - Add screenshots (see MARKETING_ASSETS.md for sizes)
   - Feature graphic: 1024×500px

8. **Content rating:**
   - Click "Content rating"
   - Fill questionnaire
   - Accept rating (usually ESRB: Everyone)

9. **Pricing & distribution:**
   - Price: Free
   - Select target countries
   - Accept policies

10. **Review & submit:**
    - Check all info
    - Click "Review release"
    - Click "Confirm release to Production"

---

## 📋 Version Updates

Each Play Store update requires:

```kotlin
// In app/build.gradle.kts
versionCode = 2  // Increment by 1
versionName = "1.1.0"  // Semantic versioning
```

Then rebuild:
```bash
./gradlew bundleRelease
```

Upload new bundle to Play Console's Production release.

---

## 🐛 Troubleshooting

### Build Fails
```bash
# Clean and rebuild
./gradlew clean build
```

### Keystore Issues
```bash
# List keystore contents
keytool -list -v -keystore release-key.jks
```

### App Crashes on Device
1. Check logcat: `adb logcat | grep E`
2. Verify HTML asset path
3. Enable WebView debugging in MainActivity

### Play Store Rejection
- Check content rating
- Verify privacy policy URL
- Ensure minimum API 24+
- Test on Android 8+ devices

---

## 📞 Support

- Android Docs: https://developer.android.com
- Google Play Docs: https://developer.android.com/google-play
- WebView Guide: https://developer.android.com/guide/webapps/webview

---

**Your app is ready! Good luck! 🚀⭐**
