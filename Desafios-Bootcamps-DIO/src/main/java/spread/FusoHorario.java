package spread;

import java.util.Scanner;

public class FusoHorario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasaida = sc.nextInt();
        int tempoviagem = sc.nextInt();
        int fuso = sc.nextInt();
        int ajuste = 0;

        ajuste = horasaida + tempoviagem + fuso;

        if (horasaida == 0) {
            ajuste = 24 + tempoviagem + fuso;
        }else if (ajuste > 24){
            ajuste = ajuste - 24;
        }else {
            ajuste = horasaida + tempoviagem + fuso;
        }

        System.out.println(ajuste);

        sc.close();
    }

}
