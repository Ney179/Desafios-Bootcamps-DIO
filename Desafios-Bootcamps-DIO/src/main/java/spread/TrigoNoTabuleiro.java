package spread;

import java.util.Scanner;

public class TrigoNoTabuleiro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            System.out.printf("%d kg\n", (long) (Math.pow(2, x) / 12000)); // Complete o código aqui.
        }
        sc.close();
    }

}
