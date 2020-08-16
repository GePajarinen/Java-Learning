/**
Escreva um programa em Java que calcule e mostre a raiz quadrada dos números de 1 a 100. Em cada linha de saída, o programa deve mostrar o número e sua raiz quadrada.
*/

import java.lang.Math;

class Main {
  
  public static void main(String[] args) {
    int i = 1;

    while(i<=100){
      double raiz;
      raiz = Math.sqrt(i);

      System.out.format("A raíz quadrada de %d é %.2f%n", i, raiz);

      i++;
    }
  }
}
