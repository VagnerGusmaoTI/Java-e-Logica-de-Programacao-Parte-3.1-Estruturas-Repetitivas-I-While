import java.util.Scanner;

public class estrutura_repetitiva_1_While {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Estrutura repetitiva "enquanto" - While
		// � uma estrutura de controle que repete um bloco de comandos enquanto uma
		// condi��o for verdadeira.
		// Quando usar: quando n�o se sabe previamente a quantidade de repeti��es que
		// ser� realizada.

		// Sintaxe / regra
		// while ( condi��o ) {
		// comando 1
		// comando 2
		// }

		// Regra:
		// V: executa e volta
		// F: pula fora

		// Problema exemplo:
		// Fazer um programa que l� n�meros inteiros at� que um zero seja lido. Ao final
		// mostra a soma dos n�meros lidos.

		// Entrada: 5 2 4 0 / Sa�da: 11

		Scanner sc = new Scanner(System.in);

		int x, soma;

		soma = 0;

		x = sc.nextInt();

		while (x != 0) {
			soma = soma + x; // ou soma += x;
			x = sc.nextInt();
		}

		System.out.println(soma);

		sc.close();

	}
}
