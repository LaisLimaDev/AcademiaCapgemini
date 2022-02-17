package proway;

/*
 * # Questão 01
 * 
 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o
 * caractere * e espaços. A base e altura da escada devem ser iguais ao valor de
 * n. A última linha não deve conter nenhum espaço. Exemplo:
 * 
 * Entrada: n = 6
 * 
 * Saída:
 *
 **
 ***
 ****
 *****
 ******
 *
 *
 * }
 * 
 */


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao1Escada {

	
	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		List<String> degraus = new ArrayList<>();

		System.out.print("Digite a quantidade de degraus: ");
		int qtdDegraus = entrada.nextInt();

		for (int i = 0; i < qtdDegraus; i++) {
			degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i + 1));
		}

		for (String d : degraus) {
			System.out.println(d);
		}
	}
}
