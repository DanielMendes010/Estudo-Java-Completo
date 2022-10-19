package com.javaTutorial;

public class ContinueInWhileLoop {
	public static void main(String[] args) {

		int l = 0;
		while (l < 10) {
			if (l == 4) {
				l++;
				continue;
			}
			System.out.println(l);
			l++;
		}
	}
}


