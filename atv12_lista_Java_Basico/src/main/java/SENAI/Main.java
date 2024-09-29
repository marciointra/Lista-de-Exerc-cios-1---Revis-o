package SENAI;

/*Escreva um programa que leia um número N (entre 0 e 50) e em seguida defina um vetor V preenchendo-o com
N números inteiros aleatórios (pesquise como fazer isso em Java). Exiba-o na tela. Inicie um laço no qual será
feita a leitura de um número X. Pesquise se X está ou não no vetor V e caso esteja elimine todas as ocorrências
do mesmo e reexiba o vetor na tela.*/

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.ArrayList;

public class Main {
   public static void main(String[] args) throws IOException {
      DataInputStream digite = new DataInputStream(System.in);
      Random numsSortidos = new Random();
      int numN = 0;
      try {
         System.out.print("Informe um numero(entre 0 e 50): ");
         numN = Integer.parseInt(digite.readLine());
         if (numN < 0 || numN > 50) {
            System.out.println("Numero fora do intervalo permitido (0 a 50).");
            return;
         }
         int[] vetor = new int[numN];
         for (int i = 0; i < numN; i++) {
            vetor[i] = numsSortidos.nextInt(100);
         }
         System.out.print("Vetor: ");
         for (int num : vetor){
            System.out.print(num+" ");
         }
         System.out.println();
         while (true){
            System.out.print("Informe um numero inteiro para pesquisar no vetor (0 para sair): ");
            int numX = Integer.parseInt(digite.readLine());

            if (numX == 0){
               break;
            }
            ArrayList<Integer> novoVetor = new ArrayList<>();
            boolean encontrado = false;
            for (int num : vetor){
               if (num != numX) {
                  novoVetor.add(num);
               } else {
                  encontrado = true;
               }
            }
            if (encontrado){
               vetor = novoVetor.stream().mapToInt(i -> i).toArray();
               System.out.print("Vetor após remoção de "+numX+": ");
               for (int num : vetor){
                  System.out.print(num+" ");
               }
               System.out.println();
            }else{
               System.out.println("Valor "+numX+" nao encontrado no vetor.");
            }
         }
      } catch (IOException e) {
         System.out.println("Erro na leitura dos dados. Tente novamente.");
      } catch (NumberFormatException e) {
         System.out.println("Por favor, informe um numero valido.");
      }
   }
}
