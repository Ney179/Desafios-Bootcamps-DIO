package cognizant;

import java.util.Scanner;

public class TempoDoDobby {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();

        if(N < A) System.out.println("Deixa para amanha!");
        else 	  System.out.println("Farei hoje!");
    }

}
