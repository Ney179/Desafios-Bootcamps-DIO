package gft;

import java.util.Scanner;

public class TopN {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] TOPS = {1, 3, 5, 10, 25, 50, 100};

        //escreva aqui o seu código

        int posicao = scan.nextInt();

        if (posicao == 0) System.out.println("Não exite essa posicão");
        if(posicao > 0 && posicao <= 3)
            System.out.println("Top 3");
        else if (posicao > 3 && posicao <= 5)
            System.out.println("Top 5");
        else if (posicao > 5 && posicao <= 10)
            System.out.println("Top 10");
        else if (posicao > 10 && posicao <= 25)
            System.out.println("Top 25");
        else if (posicao > 25 && posicao <= 50)
            System.out.println("Top 50");
        else if (posicao > 50 && posicao <= 100)
            System.out.println("Top 100");
        else
            System.out.println("Fora do top 100");

    }
}
