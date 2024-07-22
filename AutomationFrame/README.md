# Automation Framework

## Description
This is an automation framework for web and mobile applications using Java, Selenium, TestNG, and Appium.

## Structure
The project is divided into the following main components:
- Web controllers, pages, and utilities
- Mobile controllers, pages, and utilities

## Setup
1. **Java SDK:**
   - Download and install [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
   - Configure the environment variable `JAVA_HOME`.

2. **Maven:**
   - Download and install [Maven](https://maven.apache.org/download.cgi).
   - Configure the environment variable `MAVEN_HOME`.

3. **Selenium WebDriver:**
   - Download the corresponding driver (Chrome, Firefox, etc.) and add the path to the environment variable `PATH`.

4. **Appium:**
   - Install Node.js and npm from [Node.js](https://nodejs.org/).
   - Install Appium with `npm install -g appium`.
   - Install Appium Doctor with `npm install -g appium-doctor`.
   - Verify the installation with `appium-doctor`.

5. **Appium Inspector:**
   - Download and install [Appium Inspector](https://github.com/appium/appium-inspector/releases).

6. **Android SDK:**
   - Download and install [Android Studio](https://developer.android.com/studio).
   - Configure the environment variable `ANDROID_HOME`.

7. **Xcode (for iOS):**
   - Download and install Xcode from the App Store.
   - Install the Command Line Tools with `xcode-select --install`.

## Running Tests
- For web tests, run `WebLauncher.java`
- For mobile tests, run `MobileMainRunner.java`
