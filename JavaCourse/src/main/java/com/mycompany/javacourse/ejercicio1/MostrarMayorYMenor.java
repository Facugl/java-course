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
        System.out.println("Inrese el primer número");
        Integer numero1 = cargarNumero();

        System.out.println("Inrese el segundo número");
        Integer numero2 = cargarNumero();

        System.out.println("Inrese el tercero número");
        Integer numero3 = cargarNumero();

        // acá llamo a mi función
        calcularNumeroMayor(numero1, numero2, numero3);
        calcularNumeroMenor(numero1, numero2, numero3);
    }

    private static Integer cargarNumero() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }

    private static void calcularNumeroMayor(Integer numero1, Integer numero2, Integer numero3) {
        Integer numeroMayor = numero1; // por defecto el primero será el mayor
        if (numero2 > numeroMayor) {
            numeroMayor = numero2;
        }
        if (numero3 > numeroMayor) {
            numeroMayor = numero3;
        }
        System.out.println("El número mayor es: " + numeroMayor);
    }

    private static void calcularNumeroMenor(Integer numero1, Integer numero2, Integer numero3) {
        Integer numeroMenor = numero1; // por defecto el primero será el menor          
        if (numero2 < numeroMenor) {
            numeroMenor = numero2;
        }
        if (numero3 < numeroMenor) {
            numeroMenor = numero3;
        }
        System.out.println("El número menor es: " + numeroMenor);
    }
}
