# ArthaTrack Android starter

This is a starter Android project for a bilingual (English/Bengali) personal finance app.

## Current prototype
- Android native Kotlin app
- English/Bengali language toggle (saved on device)
- Green-and-white starter dashboard
- Placeholder sections for accounts, investments, transactions, backup/sync, and security

## Important: not a complete finance app yet
This starter does **not** yet implement Google sign-in, persistent financial records, cloud sync, Firebase rules, encrypted backup/import, biometric lock, or the real account/investment/transaction screens. Do not store real financial data in this prototype.

## Build APK from a phone using GitHub Actions
1. Create a GitHub account and a new repository named `ArthaTrack`.
2. Upload the contents of this project ZIP to the repository (the files inside the folder, not the ZIP itself).
3. Open the repository's **Actions** tab and enable Actions if prompted.
4. Select **Build Android APK** and tap **Run workflow** (or push to `main`).
5. Open the completed workflow run, go to **Artifacts**, and download `ArthaTrack-debug-apk`.
6. Extract the ZIP and install `app-debug.apk`. Android may ask you to allow installs from that source.

The first cloud build may fail if Gradle/Android SDK setup changes. If so, share the error log and it can be corrected.

## Next implementation stages
1. Room database for accounts, investments, categories, and transactions.
2. Transfer-aware calculations so account-to-account transfers are not counted as income/expense.
3. Firebase Authentication (Google sign-in) and Firestore with strict per-user rules.
4. Encrypted local database / sensitive-field handling and app lock using Android BiometricPrompt.
5. Password-encrypted AES-GCM backup export/import using Android's Storage Access Framework.
6. Automated tests, dependency updates, security review, and release signing.

Never commit Google service configuration files or signing secrets to a public repository. Configure them securely before enabling cloud sync.
