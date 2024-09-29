package SENAI;

/*Escreva um programa que leia o nome de um lutador e seu peso. Em seguida informe a categoria a que pertence o lutador,
conforme a tabela ao lado (note que a tabela foi criada para efeito deste exercício e não condiz com qualquer categoria
de luta). A saída do programa deve exibir em um TEXT uma frase no seguinte padrão: Nome fornecido:
Pepe Jordão Peso fornecido: 73.4 Saída exibida no TXT: O lutador Pepe Jordão pesa 73.4 kg e se enquadra na categoria Ligeiro

        Peso                                            Categoria
        Menor que 65 kg                                 Pena
        Maior ou igual a 65 kg e menor que 72 kg        Leve
        Maior ou igual a 72 kg e menor que 79 kg        Ligeiro
        Maior ou igual a 79 kg e menor que 86 kg        Meio médio
        Maior ou igual a 86 kg e menor que 93 kg        Médio
        Maior ou igual a 93 kg e menor que 100 kg       Meio pesado
        Maior ou igual a 100 kg                         Pesado
*/


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader leia = new BufferedReader(new InputStreamReader(System.in));
        DataInputStream digite = new DataInputStream(System.in);

        System.out.print("Digite o nome do lutador: ");
        String nomeLutador = leia.readLine();

        System.out.print("Digite o peso do lutador (em kg): ");
        double pesoLutador = Double.parseDouble(digite.readLine());

        String categoria;

        if (pesoLutador < 65){
            categoria = "Pena";
        }
        else if (pesoLutador < 72){
            categoria = "Leve";
        }
        else if (pesoLutador < 79){
            categoria = "Ligeiro";
        }
        else if (pesoLutador < 86){
            categoria = "Meio medio";
        }
        else if (pesoLutador < 93){
            categoria = "Medio";
        }
        else if (pesoLutador < 100){
            categoria = "Meio pesado";
        }
        else{
            categoria = "Pesado";
        }
        System.out.println("O lutador "+nomeLutador+" pesa "+pesoLutador+" kg e se enquadra na categoria "+categoria);
        digite.close();
        leia.close();
    }
}
