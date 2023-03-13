package com.ty.adapterPattern;

interface MediaPlayer {
	void play(String filename);
}

interface MediaPackage {
	void playFile(String filename);
}

class MP3 implements MediaPlayer {
	@Override
	public void play(String filename) {
		System.out.println("Playing MP3 File " + filename);
	}
}

class MP4 implements MediaPackage {
	@Override
	public void playFile(String filename) {
		System.out.println("Playing MP4 File " + filename);
	}
}

class VLC implements MediaPackage {
	@Override
	public void playFile(String filename) {
		System.out.println("Playing VLC File " + filename);
	}
}

class FormatAdapter implements MediaPlayer {
	private MediaPackage media;

	public FormatAdapter(MediaPackage m) {
		media = m;
	}

	@Override
	public void play(String filename) {
		System.out.print("Using Adapter --> ");
		media.playFile(filename);
	}
}

public class Main {
	public static void main(String[] args) {
		MediaPlayer player = new MP3();
		player.play("file.mp3");
		player = new FormatAdapter(new MP4());
		player.play("file.mp4");
		player = new FormatAdapter(new VLC());
		player.play("file.avi");
	}
}