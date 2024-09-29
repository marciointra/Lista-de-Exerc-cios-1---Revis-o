package SENAI;

/*Determine qual é a idade que o usuário faz no ano atual, para isso solicite o ano de nascimento do
usuário e o ano atual.*/

import java.io.DataInputStream;
import java.io.IOException;

public class Main {
   public static void main(String[] args) throws IOException {
      DataInputStream digite = new DataInputStream(System.in);

      try {
         System.out.print("Informe o ano de nascimento: ");
         int anoNascimento = Integer.parseInt(digite.readLine());

         System.out.print("Informe o ano atual: ");
         int anoAtual = Integer.parseInt(digite.readLine());

         int idade = anoAtual - anoNascimento;

         System.out.println("Voce tem " + idade + " anos.");

      } catch (IOException e) {
         System.out.println("Erro na leitura dos dados. Tente novamente.");
      } catch (NumberFormatException e) {
         System.out.println("Por favor, informe um ano valido.");
      }
   }
}
