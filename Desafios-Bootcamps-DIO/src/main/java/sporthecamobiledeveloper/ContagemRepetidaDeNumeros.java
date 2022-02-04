package sporthecamobiledeveloper;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class ContagemRepetidaDeNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		int control = sc.nextInt();
		while (control > 0) {
			for (int a = 1; a <= control; a++)

				numbers.add(sc.nextInt());

			SortedMap<Integer, Integer> contaQuant = new TreeMap<>();
			numbers.forEach(id -> contaQuant.compute(id, (k, v) -> (v == null) ? 1 : v + 1));

			contaQuant.entrySet().forEach(entry -> {
				System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());
			});
			break;
		}

	}

}
