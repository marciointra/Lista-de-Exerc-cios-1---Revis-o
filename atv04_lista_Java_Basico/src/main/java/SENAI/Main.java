package SENAI;

/*Escreva um programa que leia três números reais e informe se eles constituem os lados de um triângulo. Em caso
afirmativo, informe se o triângulo é equilátero, isósceles ou escaleno. Para que três números formem um triângulo
deve ocorrer que a soma dos dois lados menores deve ser maior que o lado maior. Para resolver essa questão verifique
como funcionam os operadores lógicos and e or.*/

import java.io.DataInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DataInputStream digite = new DataInputStream(System.in);
        Double[] numLados = new Double[3];
        Double somaLados = 0.0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i + 1) + "o lado: ");
            numLados[i] = Double.parseDouble(digite.readLine());
        }
        if (numLados[0]+numLados[1]>numLados[2] && numLados[0]+numLados[2]>numLados[1] && numLados[1]+numLados[2]>numLados[0]){
            if (numLados[0].equals(numLados[1]) && numLados[1].equals(numLados[2])) {
                System.out.println("Triangulo equilatero.");
            }
            else if (numLados[0].equals(numLados[1]) || numLados[0].equals(numLados[2]) || numLados[1].equals(numLados[2])){
                System.out.println("Triangulo isosceles.");
            }
            else{
                System.out.println("Triangulo escaleno.");
            }
        }else{
            System.out.println("Os lados informados não formam um triangulo.");
        }
        digite.close();
    }
}
