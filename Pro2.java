/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pro2;

import java.util.Scanner;

/**
 *
 * @author river
 */
public class Pro2 {

    public static void main(String[] args) {
       
  	 Scanner scanner = new Scanner(System.in);

        // Pedir al usuario dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Mostrar el menú de opciones
        int opcion;
        do {
            System.out.println("\nSeleccione una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Módulo");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Suma: " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("Resta: " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("Multiplicación: " + (numero1 * numero2));
                    break;
                case 4:
                    if (numero2 != 0) {
                        System.out.println("División: " + ((double) numero1 / numero2));
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    break;
                case 5:
                    if (numero2 != 0) {
                        System.out.println("Módulo: " + (numero1 % numero2));
                    } else {
                        System.out.println("Error: No se puede calcular el módulo con divisor cero.");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa. ¡Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 6);

        // Cerrar el escáner
        scanner.close();
    }
}