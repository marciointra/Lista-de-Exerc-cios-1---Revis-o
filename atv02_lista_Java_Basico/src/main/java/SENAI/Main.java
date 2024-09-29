package SENAI;

/*Escreva um programa que leia dois números inteiros e apresente na tela sua soma apenas se ambos forem positivos.
Use o mesmo formato do exercício anterior e, caso algum dos números fornecidos seja negativo o programa deve escrever
na tela que os "Dados de Entrada são Inválidos".*/

import java.io.DataInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DataInputStream digite = new DataInputStream(System.in);
        int[] num = new int[2];
        int soma = 0;

        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o " + (i + 1) + "o valor: ");
            num[i] = Integer.parseInt(digite.readLine());
            if (num[i] < 0) {
                System.out.println("Dados de Entrada são Inválidos.");
                digite.close();
                return;
            }
            soma += num[i];
        }
        System.out.println("A soma de " + num[0] + " + " + num[1] + " = " + soma);
        digite.close();
    }
}
