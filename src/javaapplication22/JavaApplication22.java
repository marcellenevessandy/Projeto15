package javaapplication22;

import java.util.Scanner;

public class JavaApplication22 {

    public static void main(String[] args) {

        double nota1, nota2, media;
        int c;

        Scanner ler = new Scanner(System.in);
        
        c = 0;
        while (c <3) {

        
        System.out.println("Nota 1: ");
        nota1 = ler.nextDouble();
        System.out.println("Nota 2: ");
        nota2 = ler.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);
        c++;
        
        }
    }

}
