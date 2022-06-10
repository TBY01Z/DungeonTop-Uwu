package de.prog2.uwupatch1.contoller;

import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * Die Klasse SoundPlayer spielt Töne wie eine Angriff, Menu-Selektor, und sonstiges.
 * //TODO: check grammar und Text neu schreiben
 */

public class SoundPlayer {
	
	Clip player;
	int number;
	
	public SoundPlayer(int number) {
		this.number = number;
		playSoundClip();
	}
	
	public void playSoundClip() {
		try {
			String n = String.valueOf(number);
			player = AudioSystem.getClip();
			System.out.println(n);
			player.open(AudioSystem.getAudioInputStream(getClass().getResource(n+".wav")));
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
