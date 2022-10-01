import java.util.Locale;
import java.util.Scanner;

public class estrutura_repetitiva_While_ExercicioTesteDeMesa4 {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Estrutura repetitiva "enquanto" - While

		// Exercício - teste de mesa 4
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double x, y;

		x = 100.00;
		y = 100.00;
		
		while (x != y) {
			System.out.print("olha");
			x = Math.sqrt(y);
		}

		sc.close();

	}

}
