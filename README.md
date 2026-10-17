# Galaxy S10 — окремий тестовий APK

Це **окрема копія**. Основний Podofo-проєкт не змінюється.

- Портретний та горизонтальний режими з адаптивною версткою.
- Classic / Sport / Music / Minimal, DEMO-дані та сенсорне керування.
- Без реального OBD2, CAN та MediaSession. Не використовуйте як штатні прилади.
- applicationId: `com.golfcockpit.s10test`, тому можна встановити поруч із основним додатком.
- minSdk 29 (Android 10+). Якщо на S10 старіший Android, треба знизити minSdk після перевірки версії.

## Збірка через GitHub

Створіть **окремий** репозиторій `GolfCockpit-S10-Test`, завантажте вміст цієї папки в корінь, включно з `.github/workflows/android-apk.yml`. У вкладці Actions запустіть Build Android APK, завантажте артефакт `GolfCockpit-GalaxyS10-TEST-debug-apk` і встановіть `app-debug.apk`. GitHub-збірка ще не запускалась.

## Швидка перевірка без APK

Відкрийте `app/src/main/assets/index.html` у браузері телефону (локально). Це HTML-прототип, Android-функції не підключені.
