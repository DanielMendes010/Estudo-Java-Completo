package com.javaTutorial;

public class Switch {
	public static void main(String[] args) {
		int estacoes = 2;
		
		switch (estacoes) {
		case 1:
			System.out.println("Verão");
			break;
		case 2:
			System.out.println("Outono");
			break;
		case 3:
			System.out.println("Inverno");
			break;
		case 4:
			System.out.println("Primavera");
			break;
		default:
			System.out.println("Erro desconhecido. Escolha qual estação do ano estamos!");
		}
	}

}
