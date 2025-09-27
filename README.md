# MP3 Player with Adapter Pattern

This project demonstrates the Adapter Design Pattern in Java using an MP3 player that can also play WAV and MP4 files through an adapter.

# Project Description

The target interface is MediaPlayer, which can play only .mp3 files.

The adaptee classes WavPlayer and Mp4Player represent players for other formats.

The adapter AudioAdapter makes non-MP3 files compatible with the Mp3Player.

The client (Main) demonstrates how different file types can be played seamlessly.



# Design Pattern: Adapter

Target (Interface): MediaPlayer

Adaptee: WavPlayer, Mp4Player

Adapter: AudioAdapter

Client: Main

📂 Project Structure
├── MediaPlayer.java
├── Mp3Player.java
├── AdvancedMediaPlayer.java
├── WavPlayer.java
├── Mp4Player.java
├── AudioAdapter.java
└── Main.java

# Learning Outcome

Understand how the Adapter Pattern works in Java.

Learn how to integrate incompatible classes with a clean and maintainable solution.

Apply Clean Code principles: meaningful class names, single responsibility, and separation of concerns.
