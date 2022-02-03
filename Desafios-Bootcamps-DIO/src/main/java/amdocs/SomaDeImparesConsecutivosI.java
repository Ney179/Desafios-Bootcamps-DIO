package amdocs;

import java.io.IOException;
import java.util.Scanner;

public class SomaDeImparesConsecutivosI {

    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x < y){
            for(int i =  x + 1; i < y; i++){
                if(i % 2 != 0){
                    soma += i;
                }
            }
        }else{
            for(int i = y + 1; i < x; i++){
                if(i % 2 != 0){
                    soma += i;
                }
            }
        }
        System.out.println(soma);
    }
}
