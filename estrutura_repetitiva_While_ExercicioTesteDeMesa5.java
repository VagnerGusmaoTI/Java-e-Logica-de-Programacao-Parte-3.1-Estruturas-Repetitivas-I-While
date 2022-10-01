import java.util.Scanner;

public class estrutura_repetitiva_While_ExercicioTesteDeMesa5 {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Estrutura repetitiva "enquanto" - While

		// Exercício - teste de mesa 5

		Scanner sc = new Scanner(System.in);

		int x, y;

		x = 0;
		
		while (x < 5) {
			y = x * 3;
			System.out.print(y);
			x = x + 1;
		}
		System.out.println("Fim");

		sc.close();

	}

}
