package com.github_actions.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double n1 = teclado.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double n2 = teclado.nextDouble();

        Operacion op = new Operacion(n1, n2);

        System.out.println("\n--- Resultados ---");
        System.out.println("Suma: " + op.sumar());
        System.out.println("Resta: " + op.restar());
        System.out.println("Multiplicación: " + op.multiplicar());
        
        try {
            System.out.println("División: " + op.dividir());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        teclado.close();
    }
}