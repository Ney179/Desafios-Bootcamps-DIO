package gft;

import java.text.NumberFormat;
import java.util.Scanner;

public class OFilme {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double A = leitor.nextDouble();
        double B = leitor.nextDouble();

        double aumento = ((B - A) / A) * 100;

        System.out.printf("%.2f%s", aumento,"%");
        //System.out.println(aumento+"%");

        //System.out.println(NumberFormat.getCurrencyInstance().format(aumento));
    }
}
