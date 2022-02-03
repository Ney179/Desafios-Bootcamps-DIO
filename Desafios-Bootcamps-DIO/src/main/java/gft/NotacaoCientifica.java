package gft;

import java.io.IOException;
import java.util.Scanner;

public class NotacaoCientifica {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        // Escreva aqui o seu código
        Double saida = leitor.nextDouble();
        System.out.printf("%.4E", saida);
    }
}
