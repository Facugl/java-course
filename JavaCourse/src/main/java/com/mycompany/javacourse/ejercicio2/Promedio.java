/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacourse.ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Facundo
 */
public class Promedio {
    // Armar un programa que permita cargar 3 números y mostrar cuál es el número promedio
    public static void main(String[] args) throws IOException {
        System.out.println("Inrese el primer número");
        Integer numero1 = cargarNumero();

        System.out.println("Inrese el segundo número");
        Integer numero2 = cargarNumero();

        System.out.println("Inrese el tercero número");
        Integer numero3 = cargarNumero();
        
        Integer sumatoria = numero1 + numero2 + numero3;
        Double numeroPromedio = Double.valueOf(sumatoria) / 3;
        System.out.println("El número promedio es: " + numeroPromedio);
    }
    
    private static Integer cargarNumero() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }
}
