package com.javaTutorial;

public class BreakContinue {
	public static void main(String[] args) {
		System.out.println("Break example ");
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Continue example ");
		for (int l = 0; l < 10; l++) {
			if (l == 4) {
				continue;
			}
			System.out.println(l);
		}
	}

}
