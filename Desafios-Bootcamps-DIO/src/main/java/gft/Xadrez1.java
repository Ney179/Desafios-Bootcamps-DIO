package gft;

import java.util.Scanner;

public class Xadrez1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int C = sc.nextInt();
        if ((  C % L   )     ==0)
            System.out.println("  1 ");
        else                                               //complete o código nos espaços em branco
            System.out.println("  0 ");
        sc.close();
    }
}
