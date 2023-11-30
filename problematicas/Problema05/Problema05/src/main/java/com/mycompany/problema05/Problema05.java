/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = 0;
        int d = 3;
        int contador = 0;
        String cadena1 = "1";
        do {
            if (contador % 2 == 0) {
                n = +1 / d;
                cadena1 = String.format("%s- 1/%d ",
                        cadena1,
                        d);
            } else {
                n = -1 / d;
                cadena1 = String.format("%s+ 1/%d ",cadena1,d);
            }
            d = d + 2;
            contador = contador + 1;
        } while (contador <= 6);
        System.out.printf("%s\n", cadena1);

    }
}

