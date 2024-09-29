package SENAI;

/*Elaborar um programa que efetue a leitura de valores positivos inteiros até que zero ou um valor negativo seja
informado. Ao final devem ser apresentados: o maior e menor valores informados pelo usuário, a quantidade de
valores, a soma e a média de todos.*/

import java.io.DataInputStream;
import java.io.IOException;

public class Main {
   public static void main(String[] args) throws IOException {
      DataInputStream digite = new DataInputStream(System.in);
      int maior = Integer.MIN_VALUE;
      int menor = Integer.MAX_VALUE;
      int soma = 0;
      int quantidade = 0;
      while (true) {
         try {
            System.out.print("Informe um numero inteiro positivo (ou zero/negativo para sair): ");
            int numero = Integer.parseInt(digite.readLine());

            if (numero <= 0){
               break;
            }
            if (numero > maior){
               maior = numero;
            }
            if (numero < menor){
               menor = numero;
            }
            soma += numero;
            quantidade++;
         } catch (IOException e) {
            System.out.println("Erro na leitura dos dados. Tente novamente.");
         } catch (NumberFormatException e) {
            System.out.println("Por favor, informe um numero inteiro valido.");
         }
      }
      if (quantidade > 0){
         double media = (double) soma / quantidade;
         System.out.println("Maior valor: " + maior);
         System.out.println("Menor valor: " + menor);
         System.out.println("Quantidade de valores: " + quantidade);
         System.out.println("Soma dos valores: " + soma);
         System.out.println("Media dos valores: " + media);
      } else {
         System.out.println("Nenhum valor positivo foi informado.");
      }
   }
}
