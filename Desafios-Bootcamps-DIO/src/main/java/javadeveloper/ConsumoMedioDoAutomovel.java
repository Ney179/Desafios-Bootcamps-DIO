package javadeveloper;

import java.io.IOException;
import java.util.Scanner;

public class ConsumoMedioDoAutomovel {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int distance = leitor.nextInt();
        Double consumption = leitor.nextDouble();
        Double mediumConsumption = distance / consumption;
        System.out.printf("%.3f km/l", mediumConsumption);
    }
}
