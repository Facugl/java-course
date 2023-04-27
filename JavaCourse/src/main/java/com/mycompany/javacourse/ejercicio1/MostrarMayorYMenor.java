/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacourse.ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Facundo
 */

// Arma un programa que permita cargar 3 números y mostrar cuál es el mayor y cual es el menor
public class MostrarMayorYMenor {
    public static void main(String[] args) throws IOException {
            InputStreamReader capturarTeclado = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(capturarTeclado);
            
            System.out.println("Inrese el primer número");
            String strNumero1 = buffer.readLine();
            Integer numero1 = Integer.parseInt(strNumero1);
            
            System.out.println("Inrese el segundo número");
            String strNumero2 = buffer.readLine();
            Integer numero2 = Integer.parseInt(strNumero2);
            
            System.out.println("Inrese el tercero número");
            String strNumero3 = buffer.readLine();
            Integer numero3 = Integer.parseInt(strNumero3);
            
            Integer numeroMayor = numero1; // por defecto el primero será el mayor
            if (numero2 > numeroMayor) {
                numeroMayor = numero2;
            }
            if (numero3 > numeroMayor) {
                numeroMayor = numero3;
            }
            System.out.println("El número mayor es: " + numeroMayor);
            
            Integer numeroMenor = numero1; // por defecto el primero será el mayor          
            if (numero2 < numeroMenor) {
                numeroMenor = numero2;
            }
            if (numero3 < numeroMenor) {
                numeroMenor = numero3;
            }    
            System.out.println("El número menor es: " + numeroMenor);
        }
}
