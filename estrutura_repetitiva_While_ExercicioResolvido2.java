import java.util.Locale;
import java.util.Scanner;

public class estrutura_repetitiva_While_ExercicioResolvido2 {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Estrutura repetitiva "enquanto" - While

		// Exercício resolvido 2

		// Faça um programa para ler um número indeterminado de dados, contendo cada um,
		// a
		// idade de um indivíduo. O último dado, que não entrará nos cálculos, contém um
		// valor
		// de idade negativa. Calcular e imprimir a idade média deste grupo de
		// indivíduos. Se for
		// entrado um valor negativo na primeira vez, mostrar a mensagem "impossivel
		// calcular".

		// Exemplos:

		// Entrada: / Saída:
		// 31 34.67
		// 27
		// 46
		// -5

		// Entrada: / Saída:
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