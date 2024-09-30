package org.sequenciaFibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int numero;
        int numeroFibnacci = 1;


        System.out.println("Informe um número:");
        numero = scann.nextInt();


        for (int i = 0; i < numero; ) {
            int aux = numeroFibnacci;
            numeroFibnacci = i + numeroFibnacci;
            i = aux;
            if (numero == numeroFibnacci) {
                System.out.println("O numero " + numero + " pertence a sequencia de Fibonacci");
                break;
            } else if (numero < numeroFibnacci) {
                System.out.println("O numero " + numero + " não pertence a sequencia de Fibonacci");
                break;
            }
            ;
        }
    }
}