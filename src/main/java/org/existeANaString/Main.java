package org.existeANaString;
//2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.
//        IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String frasePalavra;
        int quantA = 0;

        System.out.println("Informe uma frase, ou uma palavra:");
        frasePalavra = scann.nextLine();

        for (int i = 0; i < frasePalavra.length(); i++) {
            if(frasePalavra.toLowerCase().charAt(i) == 'a') {
                quantA++;
            }
        }
        if(quantA > 0) {
            System.out.println("A string infomada tem " + quantA + " letras a");
        } else  {
            System.out.println("A string informada não tem a letra a");
        }
    }
}
