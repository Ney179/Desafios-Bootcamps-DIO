package amdocs;

import java.util.Scanner;

public class FibonacciRapido {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double fibonacciNumber = sc.nextInt();
        fibonacciNumber = getFibonacciNumebrAt(fibonacciNumber);
        System.out.println(fibonacciNumber);
    }

    public static int getFibonacciNumebrAt(double n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return getFibonacciNumebrAt(n - 1) + getFibonacciNumebrAt(n - 2);
    }
}
