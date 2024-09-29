package SENAI;

import java.io.DataInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try{
            DataInputStream digite = new DataInputStream(System.in);
            int numero;

            System.out.println("Digite um numero inteiro (0 para sair):");

            while (true) {
                numero = Integer.parseInt(digite.readLine());
                if (numero == 0) {
                    System.out.println("Encerrando o programa.");
                    break;
                } else if (numero > 0) {
                    System.out.println("O numero "+numero+" e positivo.");
                } else {
                    System.out.println("O numero "+numero+" e negativo.");
                }
            }
            digite.close();
        }catch (IOException e){
            System.err.println("Erro ao ler entrada do usuário: " + e.getMessage());
        }
    }
}
