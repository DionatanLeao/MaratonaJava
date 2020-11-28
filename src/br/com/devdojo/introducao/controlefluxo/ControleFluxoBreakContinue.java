package br.com.devdojo.introducao.controlefluxo;

/***
 * 
 * @author dionatan
 *
 */

public class ControleFluxoBreakContinue {
	public static void main(String[] args) {

		double valorTotal = 30000;

		for (int parcela = 1; parcela <= valorTotal; parcela++) {
			double valorParcela = valorTotal / parcela;
			if (valorParcela < 1000) {
				break;
			}

			System.out.println("Parcela " + parcela + " R$: " + valorParcela);

		}

		System.out.println("------------------------------------------------");

		double valorTotalTwo = 30000;

		for (int parcelaTwo = (int) valorTotalTwo; parcelaTwo >= 1; parcelaTwo--) {
			double valorParcelaTwo = valorTotalTwo / parcelaTwo;
			if (parcelaTwo <= 1000) {
				continue;
			}
			System.out.println("Parcela " + parcelaTwo + " R$: " + valorParcelaTwo);
			System.out.println("Codigo Consumindo memória");
		}
	}
}
