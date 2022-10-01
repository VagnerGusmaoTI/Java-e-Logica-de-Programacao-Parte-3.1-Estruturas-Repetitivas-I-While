import java.util.Scanner;

public class estrutura_repetitiva_While_ExercicioTesteDeMesa2 {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Estrutura repetitiva "enquanto" - While

		// Exercício - teste de mesa 2

		Scanner sc = new Scanner(System.in);

		int x, y;

		x = 5;
		y = 0;

		while (x > 2) {
			System.out.print(x);
			y = y + x;
			x = x - 1;
		}

		sc.close();

	}

}