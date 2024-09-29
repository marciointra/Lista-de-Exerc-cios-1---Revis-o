package SENAI;

/*Escreva um programa que leia o nome e salário atual de um funcionário. O programa deve calcular seu novo
salário (segundo a tabela abaixo) e mostrar o nome, o salário atual e o salário reajustado do funcionário:

               Faixa salarial                         Acréscimo
               acima de             até
               --                   150               25%
               150                  300               20%
               300                  600               15%
               600                  --                10%
   - Repita o processo acima até que seja digitado FIM no lugar do nome do funcionário;

   - Mostrar ao final do programa a soma dos salários atuais, a soma dos salários reajustados
      e a diferença entre eles.

*/

import java.io.DataInputStream;
import java.io.IOException;

   public class Main {
      public static void main(String[] args) throws IOException {
         DataInputStream dis = new DataInputStream(System.in);
         String nome;
         double salarioAtual;
         double totalSalarioAtual = 0;
         double totalSalarioAjustado = 0;

         while (true) {
            System.out.print("Informe o nome do funcionario (ou 'FIM' para terminar): ");
            nome = dis.readLine();
            if (nome.equals("FIM")) {
               break;
            }

            System.out.print("Informe o salario atual: ");
            salarioAtual = Double.parseDouble(dis.readLine());

            double taxaAjuste = addTaxaAjuste(salarioAtual);
            double salarioAjustado = salarioAtual * (1 + taxaAjuste);

            System.out.println("Nome do Funcionario: " + nome);
            System.out.println("Salario Atual: R$ " + salarioAtual);
            System.out.println("Salario Reajustado: R$ " + salarioAjustado);

            totalSalarioAtual += salarioAtual;
            totalSalarioAjustado += salarioAjustado;
         }

         System.out.println("\nSoma dos Salários Atuais: R$ " + totalSalarioAtual);
         System.out.println("Soma dos Salários Reajustados: R$ " + totalSalarioAjustado);
         System.out.println("Diferença: R$ " + (totalSalarioAjustado - totalSalarioAtual));
      }

      public static double addTaxaAjuste(double salary) {
         if (salary <= 150) {
            return 0.25;
         } else if (salary <= 300) {
            return 0.20;
         } else if (salary <= 600) {
            return 0.15;
         } else {
            return 0.10;
         }
      }
   }
