package SENAI;

/*Refaça o exercício 8 armazenando cada um dos valores válidos (dentro do intervalo [Min, Max]) em um vetor de
números inteiros. Apresente na tela todos os valores contidos no vetor, bem como o total e a quantidade correta
de valores fornecidos. Responda a seguinte questão: Qual problema pode ocorrer neste exercício, referente ao
preenchimento do vetor à medida que os valores de X são digitados?*/

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
   public static void main(String[] args) throws IOException {
      DataInputStream digite = new DataInputStream(System.in);
      int min = 0, max = 0;
      try {
         System.out.print("Informe o valor de Minimo: ");
         min = Integer.parseInt(digite.readLine());
         System.out.print("Informe o valor de Maximo: ");
         max = Integer.parseInt(digite.readLine());
         if (min > max) {
            System.out.println("Valor de Minimo maior que Maximo. Valores serao invertidos.");
            int temp = min;
            min = max;
            max = temp;
         }
         ArrayList<Integer> valores = new ArrayList<>();
         int total = 0;
         int quantidade = 0;

         while (true) {
            System.out.print("Informe um numero inteiro (0 para sair): ");
            int x = Integer.parseInt(digite.readLine());
            if (x == 0){
               break;
            }
            if (x >= min && x <= max){
               valores.add(x);
               total += x;
               quantidade++;
            }else{
               System.out.println("Valor fora do intervalo ["+min+", "+max+"] ignorado na totalizacao.");
            }
         }
         System.out.println("Valores no intervalo: "+valores);
         System.out.println("Total dos valores no intervalo: "+total);
         System.out.println("Quantidade de valores no intervalo: "+quantidade);
      } catch (IOException e) {
         System.out.println("Erro na leitura dos dados. Tente novamente.");
      } catch (NumberFormatException e) {
         System.out.println("Por favor, informe um numero inteiro valido.");
      }
   }
}
