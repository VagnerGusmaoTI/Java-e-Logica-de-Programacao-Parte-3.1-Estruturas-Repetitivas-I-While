import java.util.Scanner;

public class estrutura_repetitiva_While_ExercicioTesteDeMesa7 {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Estrutura repetitiva "enquanto" - While

		// Exercício - teste de mesa 7

		Scanner sc = new Scanner(System.in);

		int x, y, i;

		x = 4;
		y = 0;
		i = 0;

		while (i < x) {
			i = i + 1;
			y = y + i;
			System.out.print(i);
			System.out.println(y);
		}

		sc.close();

	}

}
