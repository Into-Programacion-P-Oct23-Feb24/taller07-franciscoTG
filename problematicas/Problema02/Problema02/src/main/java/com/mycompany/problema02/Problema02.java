/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.problema02;

/**
 *
 * @author ft110
 */
public class Problema02 {

    public static void main(String[] args) {
        int limite = 10;
        int resultado = 2;
        int num1 = 1;
        while (num1 <= limite) {
            System.out.println(resultado);
            resultado = resultado + num1 * 2 + 2 ;
            num1 = num1 + 1;
        }
    }
}
