package view;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) {
		int decimal = 13;
		
		ConverteController converte = new ConverteController();
		converte.decToBin(decimal);
	}

}
