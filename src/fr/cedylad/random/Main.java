package fr.cedylad.random;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int n = rand.nextInt(100);
		
		System.out.println(n);

	}

}
