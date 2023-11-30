/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.problema04;

/**
 *
 * @author ft110
 */
public class Problema04 {

    public static void main(String[] args) {
        int n= 0;
        int d= 3;
        int contador = 0;
        String cadenaA = "1";

        while (contador <= 6) {
            if (contador % 2 == 0) {
                n = +1 / d;
                cadenaA = String.format("%s- 1/%d ", cadenaA, d);

            } else {

                n = -1 / d;

                cadenaA = String.format("%s+ 1/%d ", cadenaA, d);
            }
            d = d + 2;
            contador = contador + 1;
        }
        System.out.printf("%s\n", cadenaA);
    }
}
