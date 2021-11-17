package org.generation.italy.array;

public class CibiPreferiti {

	public static void main(String[] args) {
		
		String[] cibiPreferiti = {"pasta", "pizza", "spaghetti", "torta", "paninoM", "carne", "pesce", "pollo" };
		
		int lunghezzaClassifica = cibiPreferiti.length;
		
		System.out.println("Classifica di " + lunghezzaClassifica + " elementi");
		
		//cibo primo-ultimo
		
		System.out.println("Il primo cibo in classifica è: " + cibiPreferiti [0]);
		System.out.println("L'ultimo cibo in classifica è: " + cibiPreferiti [lunghezzaClassifica-1]);
		System.out.println("Quarto cibo in classifica è: " + cibiPreferiti [3]);
	}

}
