package sporthecamobiledeveloper;

import java.io.IOException;
import java.util.Scanner;

public class QuantaMandioca {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);

		int chico = 300 * leitor.nextInt();
		int bento = 1500 * leitor.nextInt();
		int bernardo = 600 * leitor.nextInt();
		int marina = 1000 * leitor.nextInt();
		int iara = 150 * leitor.nextInt();
		int marlene = 225;

		int total = chico + bento + bernardo + marina + iara + marlene;

		System.out.print(total);
	}

}
