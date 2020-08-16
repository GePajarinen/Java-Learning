/**
Escreva um programa em Java que mostre os números de 0 a 100 e seus correspondentes em binário.
*/

public class Exercicio02 {

  public static void main(String[] args) {
    int i = 0;

    while(i<=100){

      System.out.format("O binário de %d é: %s%n", i, Integer.toBinaryString(i));
      i++;

    }

  }
}
