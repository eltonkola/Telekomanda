# Telekomanda

<p align="center">
  <img src="https://github.com/eltonkola/Telekomanda/raw/main/fires/ikona.png" width="200" alt="Telekomanda App Icon">
</p>

Telekomanda is a desktop application that provides a user interface to control Android devices (including Android TV and phones emulating TV behavior) using ADB (Android Debug Bridge) commands. It's particularly useful for developers testing Android TV applications on physical devices or emulators connected via ADB Wi-Fi, offering a convenient on-screen remote.

This is a Kotlin Multiplatform project targeting Desktop.

## Screenshots

| Main Remote                                                                                             | Device Scan                                                                                             | More Controls                                                                                             |
| :----------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------: |
| <img src="https://github.com/eltonkola/Telekomanda/raw/main/fires/screenshot_1.png" width="200" alt="Main Remote UI"> | <img src="https://github.com/eltonkola/Telekomanda/raw/main/fires/screenshot_2.png" width="200" alt="Device Scan UI"> | <img src="https://github.com/eltonkola/Telekomanda/raw/main/fires/screenshot_3.png" width="200" alt="More Controls UI"> |
*(Add alt text to your images for accessibility)*

## Features

*   Scan and discover ADB-enabled devices on your network.
*   Connect to Android devices via ADB.
*   Simulate common remote control actions (D-Pad, Home, Back, Volume, Power, etc.).
*   Access a comprehensive list of secondary/advanced remote commands with search functionality.
*   Responsive UI with light/dark theme support (manual selection).

## Prerequisites

*   **ADB (Android Debug Bridge):** Must be installed and accessible in your system's PATH.
*   **Java Development Kit (JDK):** Version 17 or newer recommended.
*   **Android Device:**
    *   Developer Options enabled.
    *   USB Debugging enabled.
    *   For Wi-Fi connection: ADB over Wi-Fi enabled (e.g., `adb tcpip 5555` then `adb connect <device_ip>:5555`).

## Installation

**1. From Source (for developers):**
   *   Clone this repository: `git clone https://github.com/eltonkola/Telekomanda.git`
   *   Navigate to the project directory: `cd Telekomanda`
   *   Run the application: `./gradlew :composeApp:run` (or `gradlew.bat :composeApp:run` on Windows)

**2. Using Pre-built Releases (Recommended for users):**
   *   Go to the [Releases page](https://github.com/eltonkola/Telekomanda/releases).
   *   Download the appropriate package for your OS.
   *   **Windows:** Unzip and run `Telekomanda.exe` from the extracted folder.
   *   *(Add instructions for other OSes if you package for them)*

## Usage

1.  Ensure your Android device is connected via ADB.
2.  Launch Telekomanda.
3.  Use the "Scan" button in the left panel to discover devices.
4.  Select your device from the list to connect.
5.  Use the on-screen remote. Switch tabs for Media, Numeric, or App-specific commands.

## Resources

*   App icon components from: [IconDuck](https://iconduck.com/) and [Compose Cupertino Icons](https://composeicons.com/) (or specify the exact library if it's from there).

## Contributing

Contributions, issues, and feature requests are welcome!

## License

This project is licensed under the [Apache-2.0 License](LICENSE).
