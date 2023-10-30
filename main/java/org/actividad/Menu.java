package org.actividad;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    int numero;

    public int menuDificultad() {
        System.out.println("Selecciona el nivel de dificultad:");
        System.out.println("1. Números de un dígito");
        System.out.println("2. Números de dos dígitos");
        System.out.println("3. Números de tres dígitos");
        System.out.print("Opción: ");
        do {
            while (!sc.hasNextInt()) {
                sc.next();
            }
            numero = sc.nextInt();
        } while (numero < 1 || numero > 3);
        return numero;
    }

    public int menuOperacion() {
        System.out.println("Selecciona el tipo de problema aritmético a estudiar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Mezcla aleatoria");
        System.out.print("Opción: ");
        do {
            while (!sc.hasNextInt()) {
                sc.next();
            }
            numero = sc.nextInt();
        } while (numero < 1 || numero > 5);
        return numero;
    }
}
