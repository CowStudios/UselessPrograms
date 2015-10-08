package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Konsolka {
	
	// Zczytywanie strumienia wejsciowego.
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		
		// Watek w tle.
		int i = 100;
		Thread petelka = new Thread() {
			System.out.println("> ");
		};
		
		// Zmienna pobierajaca dane z strumienia wejsciowego.
		// Otoczona try'em w razie jakby strumieni nie byl strumieniem.
		String consoleInput = "";
		try {
			consoleInput = input.readLine();
		} catch (IOException e) {
			System.out.println("> Czytanie nie pyknelo.");
		}
		// Wyswietlenie tego co sie wpisalo.
		System.out.println("> " + consoleInput);
		
		

	}

}
