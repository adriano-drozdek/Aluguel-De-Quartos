package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImpleAluguel;

public class Aluguel {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<ImpleAluguel> list = new ArrayList<>();

		System.out.println("Informe a quantidade de quartos. ");
		int n = sc.nextInt();
		ImpleAluguel[] vect = new ImpleAluguel[n];

		for (int i = 0; i < n; i++) {

			System.out.println("Aluguel #" + (i + 1) + ":");

			sc.nextLine();
			System.out.println("Nome: ");
			String nome = sc.nextLine();

			System.out.println("Email: ");
			String email = sc.nextLine();

			System.out.println("Quarto: ");
			int quarto = sc.nextInt();

			ImpleAluguel x = new ImpleAluguel(nome, email, quarto);

			list.add(x);

		}

		System.out.println("Lista: ");

		for (ImpleAluguel x : list) {
			System.out.println(x);
		}

		sc.close();

	}

}
