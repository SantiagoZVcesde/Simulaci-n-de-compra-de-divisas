package org.example;

import java.util.Scanner;

public class Divisas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Cantidad_de_dolares = 0;
        double Tasa_del_dia = 0;
        double Valor_en_pesos = 0;
        double comision = 0;
        double Valor_total_con_comision = 0;
        double Cinco_millones_Descuento = 0;
        double Valor_total_A_Pagar_Final = 0;


        System.out.println("Ingrese la cantidad de dolares");
        Cantidad_de_dolares = sc.nextDouble();
        System.out.println("Ingrese la Tasa del dia");
        Tasa_del_dia = sc.nextDouble();

        Valor_en_pesos = Cantidad_de_dolares * Tasa_del_dia;

        comision = Valor_en_pesos * 0.03;
        Valor_total_con_comision = Valor_en_pesos + comision;

        if (Valor_total_con_comision > 5000000){
        Cinco_millones_Descuento = Valor_total_con_comision * 0.02;
    }
        else {
            Cinco_millones_Descuento = 0;
        }
        Valor_total_A_Pagar_Final = Valor_total_con_comision - Cinco_millones_Descuento;
       int Cantidad_De_Billetes = (int)(Valor_total_A_Pagar_Final / 100000);

        System.out.println("El valor en pesos es igual a:" + Valor_en_pesos);
        System.out.println("El valor final con comision es igual a:" + Valor_total_con_comision);
        System.out.println("El valor total a pagar final es igual a:" + Valor_total_A_Pagar_Final);
        System.out.println("La cantidad de billetes de 100.000 necesarios es :" + Cantidad_De_Billetes);

    }
}
