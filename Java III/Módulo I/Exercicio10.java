/*
EXERCÍCIO 10 
Faça um programa que receba um número inteiro maior que 1, verifique se o número fornecido é primo ou não. 
Um número é primo quando é divisível apenas por 1 e por ele mesmo.
*/

import java.util.Scanner.*;

public class Exercicio10 { 
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número maior que 1");
    int num = sc.nextInt();

    if (num <=1){
      System.out.println("INVÁLIDO:\n Digite um número maior que 1");
    }
    else{
      if (num ==2 || num == 3 || num == 5 || num == 7){
        System.out.format("O número %d é primo.\n", num);
      }
      else if (num %2!=0 && num %3!=0 && num%5 !=0 && num%7!=0){
        System.out.format("O número %d é primo.\n", num);
      }
      else{
        System.out.format("O número %d não é primo.", num);
      }
    }
        
  }
}
