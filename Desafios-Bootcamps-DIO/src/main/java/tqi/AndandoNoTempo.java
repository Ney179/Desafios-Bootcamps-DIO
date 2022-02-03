package tqi;

import java.io.IOException;
import java.util.Scanner;

public class AndandoNoTempo {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        if (a + b == c || a + c == b ||     c + b == a    || a == b ||    b == c     ||   b == a   )  //complete com o código nos espaços em branco
            System.out.println("S");
        else
            System.out.println("N");
    }
}
