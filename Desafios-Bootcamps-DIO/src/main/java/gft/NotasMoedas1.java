package gft;

import java.util.Scanner;

public class NotasMoedas1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double valor = leitor.nextDouble();

        //int notas = (int) dinheiroTotal ;
        //int moedas = (int) ((dinheiroTotal - notas) * 100);

        System.out.println("NOTAS");
        System.out.printf("nota(s) de R$100.00", (int) valor / 100);

        valor = valor % 100;
        valor -= valor * 100;
        System.out.printf("nota(s) de R$50.00", (int) valor / 50);


    }
}
