package resultadoiniciante;

import java.util.Locale;
import java.util.Scanner;

public class ResultaIniciante {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String name;
		Double n1, n2, n3;
		Double total;

		System.out.println("Nome do aluno: ");
		name = sc.next();

		System.out.println("Digite a Primeira nota:");
		n1 = sc.nextDouble();

		System.out.println("Digite a segunda nota:");
		n2 = sc.nextDouble();

		System.out.println("Digite a terceira nota:");
		n3 = sc.nextDouble();

		total = n1 + n2 + n3;

		System.out.printf("FINAL GRADE = %.2f%n", total);

		if (total < 60) {
			System.out.println("FAILED " + " MISSING: " + (60 - total) + " POINTS: ");
		} else {
			System.out.println("PASS");
		}

		sc.close();

	}

}
