import java.util.Scanner;

public class estrutura_repetitiva_While_ExercicioTesteDeMesa6 {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Estrutura repetitiva "enquanto" - While

		// Exerc�cio - teste de mesa 6

		Scanner sc = new Scanner(System.in);

		int x, y;

		x = 2;
		y = 10;
		
		System.out.println("Ol�");
		
		while (x < y) {
			System.out.println(x + "-" + y);
			x = x * 2;
			y = y + 1;
		}

		sc.close();

	}

}
