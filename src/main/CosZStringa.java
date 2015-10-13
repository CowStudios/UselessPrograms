package main;

public class CosZStringa {

	public static void main(String[] args) {
		// Sting wejsciowy.
		String koza = "Cos Kot, nie wiem.";
		
		// To cos to wyciagania.
		String output = koza.substring(4, 5);
		
		// Tylko jednen znak. 
		char outputchat = koza.charAt(4);
		
		int foo = Integer.parseInt(output);
		
		
		System.out.println(output);
		System.out.println(outputchat);
		System.out.println(foo);
	}

}
