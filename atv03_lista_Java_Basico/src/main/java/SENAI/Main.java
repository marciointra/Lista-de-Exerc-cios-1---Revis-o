package SENAI;

/*Escreva um programa que leia dois números inteiros e apresente na tela sua soma apenas se ambos tiverem o mesmo sinal
(positivo ou negativo). Use o mesmo formato do exercício anterior e, caso os números fornecidos tenham sinais trocados
o programa deve escrever na tela que os "Dados de Entrada são Inválidos".*/

import java.io.DataInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DataInputStream digite = new DataInputStream(System.in);
        int[] num = new int[2];
        int soma = 0;

        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o "+(i + 1)+"o valor: ");
            num[i] = Integer.parseInt(digite.readLine());
        }

        // Verifica se os números têm o mesmo sinal
        if ((num[0] > 0 && num[1] > 0) || (num[0] < 0 && num[1] < 0)) {
            soma = num[0] + num[1];
            System.out.println("A soma de "+num[0]+" + "+num[1]+" = "+soma);
        } else {
            System.out.println("Dados de Entrada são Inválidos.");
        }
        digite.close();
    }
}
