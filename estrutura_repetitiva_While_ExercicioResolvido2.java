import java.util.Locale;
import java.util.Scanner;

public class estrutura_repetitiva_While_ExercicioResolvido2 {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Estrutura repetitiva "enquanto" - While

		// Exerc�cio resolvido 2

		// Fa�a um programa para ler um n�mero indeterminado de dados, contendo cada um,
		// a
		// idade de um indiv�duo. O �ltimo dado, que n�o entrar� nos c�lculos, cont�m um
		// valor
		// de idade negativa. Calcular e imprimir a idade m�dia deste grupo de
		// indiv�duos. Se for
		// entrado um valor negativo na primeira vez, mostrar a mensagem "impossivel
		// calcular".

		// Exemplos:

		// Entrada: / Sa�da:
		// 31 34.67
		// 27
		// 46
		// -5

		// Entrada: / Sa�da:
		// -10 impossivel calcular

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int idade, soma, cont;
		double media;
		
		idade = sc.nextInt();
		soma = 0;
		cont = 0;
		
		while (idade >= 0) {
			soma = soma + idade;
			cont = cont + 1;
			idade = sc.nextInt();
		}
		if (cont > 0) {
			media = (double) soma / cont;
			System.out.printf("%.2f%n", media);
		} else {
			System.out.println("impossivel calcular");
		}
		
		sc.close();

	}

}