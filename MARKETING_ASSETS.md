# Star Blaster - Marketing Assets & Screenshots Guide

## 📱 Screenshots for Play Store

You need **2-4 screenshots** at **1080×1920px** (portrait).

### Recommended Screenshot Sequence:

#### Screenshot 1: Gameplay in Action
- Show the game with stars being clicked
- Display score: 250, Time: 15
- Include pause button visible
- Add caption: "Catch stars & score points!"

#### Screenshot 2: Game Features
- Show start screen with title
- Display best score
- Include caption: "Challenge yourself with increasing difficulty"

#### Screenshot 3: High Score Screen
- Show game over screen with final score
- Display best score achievement
- Include caption: "Beat your personal record"

#### Screenshot 4: (Optional) Controls
- Show pause menu or game stats
- Include caption: "Tap to play, Space to pause"

### How to Capture Screenshots:

**On Android Device/Emulator:**
```bash
# Via adb
adb shell screencap -p /sdcard/screenshot.png
adb pull /sdcard/screenshot.png ./

# Or use Android Studio
# Device Menu > Screenshot
```

**On Emulator:**
- Press `Ctrl+S` (Windows/Linux) or `Cmd+S` (Mac)
- Screenshot saved to emulator folder

### Design Tips:
- Add subtle text overlays (white text with black shadow)
- Use design tools: Figma, Canva, or Adobe XD
- Keep game elements clearly visible
- Ensure text is readable at small sizes

---

## 🎨 App Icon Requirements

### Icon Sizes Needed:
```
mipmap-ldpi/     (36×36px)  - Low density
mipmap-mdpi/     (48×48px)  - Medium density
mipmap-hdpi/     (72×72px)  - High density
mipmap-xhdpi/    (96×96px)  - Extra high density
mipmap-xxhdpi/   (144×144px) - Extra extra high density
mipmap-xxxhdpi/  (192×192px) - Extra extra extra high density
```

### Automatic Icon Generation (Recommended):

**Using Android Studio:**
1. Right-click `app/src/main/res`
2. Select `New > Image Asset`
3. Upload a **512×512px** PNG
4. Choose "Launcher Icons"
5. Select "Legacy" for compatibility
6. Click `Generate`

**OR Use Online Tools:**
- [Android Asset Studio](https://romannurik.github.io/AndroidAssetStudio/icons-launcher.html)
- [AppIcon.co](https://appicon.co/)
- [MakeAppIcon.com](https://makeappicon.com/)

### Icon Design Best Practices:
- Simple, recognizable design
- Bold colors (use app's gradient: #5b2cff → #00c6ff)
- Avoid text in icon
- Center content with safe padding
- Test at small sizes (48px preview)

---

## 📝 Play Store Listing Copy

### App Name (50 chars max):
```
⭐ Star Blaster
```

### Short Description (80 chars max):
```
Catch stars before time runs out! Fast-paced arcade fun.
```

### Full Description (4000 chars max):
```
⭐ Star Blaster - The Ultimate Arcade Experience

Get ready to catch the stars! Star Blaster is a fast-paced, addictive arcade 
game that tests your reflexes and quick thinking.

🎮 GAMEPLAY
• Tap or click the stars as they appear
• Earn 10 points for each star caught
• Watch out - the game gets harder as you play!
• 30-second rounds of pure action

✨ FEATURES
• Increasing difficulty levels
• Track your personal best score
• Pause and resume anytime
• Beautiful gradient UI
• Smooth, responsive controls
• Works offline

🏆 COMPETE
• Compete with your own high scores
• Challenge friends to beat your record
• Unlimited gameplay opportunities

⚡ PERFECT FOR
• Quick gaming sessions during breaks
• Training your reflexes
• Relaxing arcade fun
• Competitive score chasing

DOWNLOAD NOW and see how high you can score! Can you master the stars?
```

### Promotional Text (80 chars max):
```
Tap fast, score big! Can you catch all the stars?
```

---

## 🔗 Play Store Metadata

### Category:
- **Games > Casual**

### Content Rating:
- **ESRB:** Everyone
- **IARC:** 3+ years
- No violence, no adult content

### Pricing:
- **Free** (with optional ads later)
- Or **$0.99 - $4.99** if paid

### Target Regions:
- Recommended: Worldwide
- Or: US, UK, Europe, India, Asia

### Language:
- Primary: English
- Additional: Spanish, French, German (optional)

---

## 📊 Privacy Policy Template

Create a simple privacy policy (required for Play Store):

```html
<!DOCTYPE html>
<html>
<head><title>Privacy Policy - Star Blaster</title></head>
<body>
<h1>Privacy Policy - Star Blaster</h1>

<p><strong>Last Updated:</strong> [DATE]</p>

<h2>Overview</h2>
<p>Star Blaster does not collect, use, or share any personal data. 
The app operates entirely offline and stores only your local high score 
on your device.</p>

<h2>Data Collection</h2>
<p>We do NOT collect:</p>
<ul>
  <li>Personal information</li>
  <li>Device identifiers</li>
  <li>Location data</li>
  <li>Usage analytics</li>
  <li>Cookies or tracking</li>
</ul>

<h2>Local Storage</h2>
<p>Your high score is stored locally on your device using browser storage. 
It is never transmitted to our servers or third parties.</p>

<h2>Contact</h2>
<p>Email: [your-email@example.com]</p>
</body>
</html>
```

**Host this on a free service:**
- GitHub Pages
- Vercel
- Netlify

---

## ✅ Pre-Launch Checklist

- [ ] Screenshots captured (1080×1920px, at least 2)
- [ ] App icon generated (192×192px minimum)
- [ ] Icon added to `app/src/main/res/mipmap/`
- [ ] Short description written
- [ ] Full description written
- [ ] Privacy policy URL prepared
- [ ] Content rating submitted
- [ ] Category selected (Games > Casual)
- [ ] Version code updated
- [ ] Release APK signed and tested
- [ ] Bundle generated (`bundleRelease`)
- [ ] Tested on Android 8+ devices

---

## 🚀 Final Steps

1. **Create Play Store Account** → https://play.google.com/console
2. **Register Developer Account** ($25 one-time fee)
3. **Create New App**
4. **Upload Assets:**
   - Screenshots (PNG, JPEG)
   - Icon (already in app)
   - Feature graphic (1024×500px)
   - APK/Bundle
5. **Fill Metadata** (use copy above)
6. **Set Price** (Free recommended)
7. **Submit for Review** (~2-4 hours)
8. **Monitor Reviews** after launch

---

## 📈 Post-Launch Marketing

- Share on social media
- Embed on personal website
- Cross-promote with other apps
- Encourage user reviews
- Plan regular updates

**Good luck launching Star Blaster! 🚀⭐**
