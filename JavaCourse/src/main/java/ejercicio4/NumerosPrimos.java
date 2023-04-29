/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Facundo
 */
public class NumerosPrimos {

    public static void main(String[] args) {
        // Armar un programa que muestre los 100 primeros números primos
        String resultado = "";
        int contador = 0;
        int numero = 1;
        while (contador < 100) {
            if (esPrimo(numero)) {
                resultado += numero + ", ";
                contador ++;
            }
            numero++;
        }
        System.out.println("Los primeros 100 números primos son: " + resultado);
    }

    private static Boolean esPrimo(Integer numero) {
        Boolean esUnNumeroPrimo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esUnNumeroPrimo = false;
            }          
        }
        return esUnNumeroPrimo;
    }
}
