/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javacourse.ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Facundo
 */
public class ParOImpar {
    // Armar un programa que permita ingresar un número y mostrar si es par o impar
    public static void main(String[] args) throws IOException {
        System.out.println("Inrese un número");
        Integer numero = cargarNumero();
        
        Boolean esPar = numero % 2 == 0;
        
        if (esPar) {
            System.out.println("El número ingresado es par");
        } else {
            System.out.println("El número ingresado es impar");
        }
    }
    
    private static Integer cargarNumero() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }
}
