# Star Blaster - Android App Repository

**Convert your HTML5 game to an Android Play Store app in minutes!**

## 📱 Features

✅ Fast-paced arcade gameplay  
✅ Score tracking & persistence  
✅ Pause/resume functionality  
✅ Beautiful gradient UI  
✅ Touch-optimized controls  
✅ Runs offline  
✅ WebView-based (easy updates)  

## 🚀 Quick Start

### 1. Clone Repository
```bash
git clone https://github.com/sayandas16990-beep/StarBlaster.git
cd StarBlaster
```

### 2. Open in Android Studio
- File > Open > Select project folder
- Wait for Gradle sync

### 3. Add App Icon (Optional but Recommended)
- Right-click `app/src/main/res`
- New > Image Asset
- Upload 512×512px PNG
- Click Generate

### 4. Run on Device/Emulator
```bash
./gradlew run
```

## 📋 Documentation

- **[SETUP.md](SETUP.md)** - Complete setup & build instructions
- **[PLAY_STORE_GUIDE.md](PLAY_STORE_GUIDE.md)** - Play Store submission guide
- **[MARKETING_ASSETS.md](MARKETING_ASSETS.md)** - Screenshots, icons & marketing copy

## 🎮 Gameplay

- **Objective:** Tap stars before time runs out
- **Scoring:** 10 points per star
- **Duration:** 30 seconds per round
- **Difficulty:** Increases as you play
- **Controls:**
  - Tap/Click stars to score
  - Space key to pause/resume
  - R key to restart

## 🛠️ Tech Stack

- **Language:** Kotlin
- **UI:** Android WebView + HTML5
- **Min API:** 24 (Android 7.0)
- **Target API:** 34 (Android 14)
- **Build:** Gradle 8.1+

## 📊 Project Structure

```
app/
├── src/main/
│   ├── java/com/starblaster/game/
│   │   ├── MainActivity.kt
│   │   └── WebViewDebugHelper.kt
│   ├── assets/
│   │   └── index.html (Game HTML)
│   ├── res/
│   │   ├── layout/
│   │   ├── values/
│   │   └── mipmap/ (Icons)
│   └── AndroidManifest.xml
├── build.gradle.kts
└── proguard-rules.pro
```

## 🔧 Build Commands

```bash
# Debug APK
./gradlew assembleDebug

# Release Bundle (for Play Store)
./gradlew bundleRelease

# Release APK
./gradlew assembleRelease

# Install & run
./gradlew run

# Clean build
./gradlew clean build
```

## 📤 Play Store Submission

1. Create Google Play Developer Account ($25)
2. Follow [PLAY_STORE_GUIDE.md](PLAY_STORE_GUIDE.md)
3. Prepare marketing assets ([MARKETING_ASSETS.md](MARKETING_ASSETS.md))
4. Build release bundle
5. Upload to Play Console
6. Submit for review (~2-4 hours)

## 🎨 Customization

### Change App Name
Edit `app/src/main/res/values/strings.xml`:
```xml
<string name="app_name">Your App Name</string>
```

### Update Game Code
Edit `app/src/main/assets/index.html`

### Change Colors
Edit `app/src/main/res/values/colors.xml`

## 📞 Requirements

- Android Studio 2023.1+
- Java 11+
- Kotlin 1.9+
- Gradle 8.1+
- Android SDK 34

## 📈 Next Steps

1. ✅ Build & test locally
2. ✅ Add app icon
3. ✅ Create keystore for signing
4. ✅ Build release bundle
5. ✅ Prepare marketing assets
6. ✅ Submit to Play Store
7. ✅ Monitor reviews & ratings
8. ✅ Plan updates

## 📝 Version History

- **v1.0.0** (2026-09-05) - Initial release

## 📄 License

MIT License - Feel free to modify and distribute

## 👨‍💻 Author

Your Name - [GitHub](https://github.com/sayandas16990-beep)

---

**Ready to launch? Start with [SETUP.md](SETUP.md)! 🚀⭐**
