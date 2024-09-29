package SENAI;

/*Escreva um programa que leia dois números inteiros denominados Min e Max. Em seguida, inicie um laço dentro
do qual será efetuada a leitura de um número inteiro X. O laço termina quando for digitado o valor 0 (zero)
para X. Dentro do laço o programa deve contar e totalizar todos os valores de X que estejam no intervalo fechado
[Min, Max]. Se algum valor fora do intervalo for digitado para X, o programa deve dar a mensagem "Valor fora do
intervalo [Min, Max] ignorado na totalização". Após sair do laço, deve apresentar o total e a quantidade correta
de valores fornecidos. Cuidado com a possibilidade do usuário digitar o valor Min maior que o valor Max. Se isso
acontecer o programa deve avisar a situação e invertê-los.*/

import java.io.DataInputStream;
import java.io.IOException;

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
         int total = 0;
         int quantidade = 0;
         while (true) {
            System.out.print("Informe um numero inteiro (0 para sair): ");
            int x = Integer.parseInt(digite.readLine());
            if (x == 0){
               break;
            }
            if (x >= min && x <= max){
               total += x;
               quantidade++;
            }else{
               System.out.println("Valor fora do intervalo ["+min+", "+max+"] ignorado na totalizacao.");
            }
         }
         System.out.println("Total dos valores no intervalo: " + total);
         System.out.println("Quantidade de valores no intervalo: " + quantidade);
      } catch (IOException e) {
         System.out.println("Erro na leitura dos dados. Tente novamente.");
      } catch (NumberFormatException e) {
         System.out.println("Por favor, informe um numero inteiro valido.");
      }
   }
}
