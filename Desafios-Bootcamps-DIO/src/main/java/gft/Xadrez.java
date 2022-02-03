package gft;

import java.util.Scanner;

public class Xadrez {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);

        /* Nada aver com o codigo
         * if (isNaN(c)){c= 1}
         * */

        int L = scan.nextInt();
        int C = scan.nextInt();

        if (L % 2 == C % 2)
            System.out.println(1);
        else
            System.out.println(0);
    }

}
