package SENAI;

/*Escreva um programa que leia um número N (entre 0 e 50) e em seguida defina um vetor V preenchendo-o com N números
 inteiros aleatórios (pesquise como fazer isso em Java). Exiba-o na tela. Inicie um laço no qual será feita a
 leitura de um número X. Pesquise se X está ou não no vetor V e caso esteja informe a posição de cada ocorrência.*/

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Random;

public class Main {
   public static void main(String[] args) throws IOException {
      DataInputStream digite = new DataInputStream(System.in);
      Random numsSortidos = new Random();
      int numN = 0;
      try {
         System.out.print("Informe um numero(entre 0 e 50): ");
         numN = Integer.parseInt(digite.readLine());
         if (numN < 0 || numN > 50){
            System.out.println("Número fora do intervalo permitido (0 a 50).");
            return;
         }
         int[] vetor = new int[numN];
         for (int i = 0; i < numN; i++){
            vetor[i] = numsSortidos.nextInt(100);
         }
         System.out.print("Vetor: ");
         for (int num : vetor) {
            System.out.print(num + " ");
         }
         System.out.println();
         while (true) {
            System.out.print("Informe um numero inteiro para pesquisar no vetor (0 para sair): ");
            int numX = Integer.parseInt(digite.readLine());

            if (numX == 0) {
               break;
            }
            boolean encontrado = false;
            for (int i = 0; i < vetor.length; i++) {
               if (vetor[i] == numX) {
                  System.out.println("Valor " + numX + " encontrado na posicao " + i);
                  encontrado = true;
               }
            }
            if (!encontrado) {
               System.out.println("Valor " + numX + " nao encontrado no vetor.");
            }
         }
      } catch (IOException e) {
         System.out.println("Erro na leitura dos dados. Tente novamente.");
      } catch (NumberFormatException e) {
         System.out.println("Por favor, informe um numero valido.");
      }
   }
}
