package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Konsolka {
	
	// Zczytywanie strumienia wejsciowego.
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
	// Zmienne 
	static int procent = 0;

	public static void main(String[] args) {
		
		// Watek w tle.
		Thread petelka = new Thread() {
			public void run(){
				while (procent <= 100) {
					System.out.println("> Postep: " + procent + "%");
					procent++;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
			}
		};
		
		System.out.println("> Zaczac test?");
		
		// Zmienna pobierajaca dane z strumienia wejsciowego.
		// Otoczona try'em w razie jakby strumieni nie byl strumieniem.
		String consoleInput = "";
		try {
			consoleInput = input.readLine();
		} catch (IOException e) {
			System.out.println("> Czytanie nie pyknelo.");
		}
		// Wyswietlenie tego co sie wpisalo.
		petelka.start();

	}

}
