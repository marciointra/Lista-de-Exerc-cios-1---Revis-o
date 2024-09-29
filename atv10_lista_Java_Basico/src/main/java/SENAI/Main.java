package SENAI;

/*Escreva um programa que leia um número N (entre 0 e 50) e em seguida leia N números reais em um vetor
A. O programa dever separar os valores lidos em A em outros dois vetores NEG e POS, o primeiro contendo somente
os valores negativos e o segundo contendo os valores positivos e zero. Apresentar na tela os vetores NEG e POS
e a quantidade de valores contidos em cada um.*/

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
   public static void main(String[] args) throws IOException {
      DataInputStream digite = new DataInputStream(System.in);
      int num = 0;
      try {
         System.out.print("Informe um numero (entre 0 e 50): ");
         num = Integer.parseInt(digite.readLine());

         if (num < 0 || num > 50){
            System.out.println("Numero fora do intervalo permitido (0 a 50).");
            return;
         }

         double[] vetor = new double[num];
         ArrayList<Double> negativo = new ArrayList<>();
         ArrayList<Double> positivo = new ArrayList<>();

         for (int i = 0; i < num; i++){
            System.out.print("Informe um numero decimal: ");
            vetor[i] = Double.parseDouble(digite.readLine());

            if (vetor[i] < 0){
               negativo.add(vetor[i]);
            }else{
               positivo.add(vetor[i]);
            }
         }
         System.out.println("Vetor 'negativo' (valores negativos): " + negativo);
         System.out.println("Quantidade de valores em 'negativo': " + negativo.size());

         System.out.println("Vetor 'positivo' (valores positivos e zero): " + positivo);
         System.out.println("Quantidade de valores em 'positivo': " + positivo.size());
      } catch (IOException e) {
         System.out.println("Erro na leitura dos dados. Tente novamente.");
      } catch (NumberFormatException e) {
         System.out.println("Por favor, informe um numero valido.");
      }
   }
}
