package SENAI;

/*  Escreva um programa que leia dois números inteiros e apresente na tela sua soma, no seguinte formato:
    Soma de 5 com 7 = 12*/

import java.io.DataInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DataInputStream digite = new DataInputStream(System.in);
        int[] num = new int[2]; int soma = 0;

        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o "+(i+1)+"o valor: ");
            num[i] = Integer.parseInt(digite.readLine());
            soma += num[i];
        }
        System.out.println("A soma de "+num[0]+" + "+num[1]+" = "+soma);
        digite.close();
    }
}