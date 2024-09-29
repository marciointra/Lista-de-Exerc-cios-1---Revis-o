package SENAI;

/*Uma empresa precisa realizar uma estatística do salário de seus funcionários. Para isto precisa de um programa
que leia uma lista contendo os salários dos funcionários da empresa, e imprima quantos funcionários ganham
salário acima da média. Sabe-se que a empresa possui 50 funcionários.
   •Considerando que não há um número fixo de 50 funcionários, o programa pergunta no início quantos
   funcionários possui a empresa e reliza o restante do processo.*/

import java.io.DataInputStream;
import java.io.IOException;

public class Main {
   public static void main(String[] args) {
      DataInputStream digite = new DataInputStream(System.in);

      try {
         System.out.print("Informe o numero de funcionarios: ");
         int numFuncionarios = Integer.parseInt(digite.readLine());

         double[] salarios = new double[numFuncionarios];
         double somaSalarios = 0;

         for (int i = 0; i < numFuncionarios; i++) {
            System.out.print("Informe o salario do funcionario "+(i+1)+": ");
            salarios[i] = Double.parseDouble(digite.readLine());
            somaSalarios += salarios[i];
         }

         double mediaSalarios = somaSalarios / numFuncionarios;
         int countAcimaMedia = 0;

         for (double salario : salarios) {
            if (salario > mediaSalarios) {
               countAcimaMedia++;
            }
         }

         System.out.println("Media salarial: R$ "+mediaSalarios);
         System.out.println("Numero de funcionarios com salario acima da media: " + countAcimaMedia);

      } catch (IOException e) {
         System.out.println("Erro na leitura dos dados. Tente novamente.");
      } catch (NumberFormatException e) {
         System.out.println("Por favor, informe um numero valido.");
      }
   }
}
