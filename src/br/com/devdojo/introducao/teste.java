package br.com.devdojo.introducao;

public class teste {
	public static void main(String[] args) {
		int a;
		int b;

		a = 10;
		while (a >= 5) {
			a--;
			System.out.println("A " + a);
		}
		b = 10;
		do {
			System.out.println("B " + b);
			b--;
		} while (a > 5);
	}
}
