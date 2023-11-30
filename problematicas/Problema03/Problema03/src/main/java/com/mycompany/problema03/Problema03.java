/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.problema03;

/**
 *
 * @author ft110
 */
public class Problema03 {

    public static void main(String[] args) {
        int limite = 6;
        int resultado = 2;
        int num1 = 1;

        while (num1 <= limite) {
            System.out.println(resultado);

            resultado = resultado + num1 * 2 + 1;
            num1 = num1 + 1;
        }
    }
}
