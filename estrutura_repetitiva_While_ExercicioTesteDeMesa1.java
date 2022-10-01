import java.util.Scanner;

public class estrutura_repetitiva_While_ExercicioTesteDeMesa1 {

	public static void main(String[] args) {

		// ESTRUTURA REPETITIVA

		// Estrutura repetitiva "enquanto" - While
		
		//Exercício - teste de mesa 1
		
		Scanner sc = new Scanner (System.in);
		
		int x, y;
		
		x = 0;
		y = 4;
		
		while (x < 3) {
			y = y + 2;
			x = x + 1;
			
			System.out.println(x + " - " + y);
		}	
		
		sc.close();

	}

}
