import java.util.Scanner;

public class estrutura_repetitiva_While_ExercicioTesteDeMesa3 {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Estrutura repetitiva "enquanto" - While

		// Exercício - teste de mesa 3

		Scanner sc = new Scanner(System.in);

		int x, y;

		x = 2;
		y = 0;

		while (x < 60) {
			System.out.println(x);
			x = x * 2;
			y = y + 10;
		}

		sc.close();

	}

}
