package de.prog2.uwupatch1.Model.Audio;

import javafx.scene.media.AudioClip;

import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * Die Klasse SoundPlayer spielt Töne wie eine Angriff, Menu-Selektor, und sonstiges.
 * //TODO: check grammar und Text neu schreiben
 */

public class AudioController {

//	AudioClip audioClip;
	Clip player;
	String trackName;

	public AudioController(String trackName) {
		this.trackName = trackName;
		playSoundClip();
	}

	public void playSoundClip() {
		try {
			String n = this.trackName;
			player = AudioSystem.getClip();
			System.out.print(n);
			//TODO: wenn app zu jar gepackaged wird, dateipfad immer mit "jar:" beginnen lassen
			player.open(AudioSystem.getAudioInputStream(getClass().getResource(n + ".wav")));
			//sound.loop(Clip.LOOP_CONTINUOUSLY);
			player.start();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		}
	}

}
