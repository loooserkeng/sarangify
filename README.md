# SARANGIFY

SARANGIFY is a dark-first Android music player. It searches YouTube Music, streams tracks, and keeps playback, playlists, and listening history available in one app.

Source code and releases: [github.com/saranghaeyong/sarangify](https://github.com/saranghaeyong/sarangify).

## Features

- Background playback with a persistent queue, media controls, and Android Auto support
- Search for songs, albums, artists, videos, and playlists
- Cache tracks for offline playback
- Save favorites, bookmark artists and albums, and manage local playlists
- Fetch, display, and edit timed or unsynchronized lyrics
- Playback history, sleep timer, skip silence, and loudness normalization
- YouTube and YouTube Music playlist, track, and artist links
- English, Spanish, German, French, Italian, Russian, and Turkish translations

## Technology

- Kotlin and Jetpack Compose with Material 3
- AndroidX Media3 playback and MediaSession integration
- Room for local database storage
- Ktor-based networking, including the YouTube Music integration
- Gradle Kotlin DSL, Android Gradle Plugin, and Java 17 bytecode targets

## Build

Requirements: JDK compatible with the checked-in Gradle wrapper and Android Gradle Plugin, plus Android SDK platform API 37 (minor API level 2) configured for the project. The app supports Android 7.0 (API 24) and later.

```sh
./gradlew assembleDebug
```

The debug APK is produced under `app/build/outputs/apk/debug/`. No SARANGIFY release distribution URL is configured yet.

## External services

Music search, metadata, and stream resolution depend on YouTube Music services through the project's existing Innertube integration; availability and behavior can change independently of SARANGIFY. Lyrics may use Kugou. The About screen checks releases from the SARANGIFY GitHub repository.

## Attribution and trademarks

SARANGIFY retains the original GPL-3.0 license and required notices in [LICENSE](LICENSE) and applicable source files. Those notices remain unchanged by the rebrand. YouTube, YouTube Music, Google, and all other marks belong to their respective owners. SARANGIFY is not affiliated with or endorsed by YouTube, Google, or Spotify.