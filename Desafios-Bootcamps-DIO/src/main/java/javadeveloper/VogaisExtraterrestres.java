package javadeveloper;

import java.util.Scanner;

public class VogaisExtraterrestres {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String vogais = sc.nextLine();
            String frase = sc.nextLine();

            int countVogais = 0;
            for(char vogal : vogais.toCharArray()) {
                countVogais += frase.chars().filter(c -> c == vogal).count();
            }
            System.out.println(countVogais);
        }
    }
}
