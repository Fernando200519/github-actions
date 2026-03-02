package com.github_actions.app;

public class App {
    public static void main(String[] args) {
        Operacion op = new Operacion(10, 5);
        System.out.println("Suma: " + op.sumar());
    }
}