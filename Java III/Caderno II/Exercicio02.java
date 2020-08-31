/*
EXERCÍCIO 02
Faça um programa que receba cinco números e mostre a saída a seguir:
  Digite o 1o número: 5
  Digite o 2o número: 3
  Digite o 3o número: 2
  Digite o 4o número: 0
  Digite o 5o número: 2
   Os números digitados foram:
   5 + 3 + 2 + 0 + 2 = 12
*/

import java.util.Scanner;

public class Exercicio02 { 
   
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int num1, num2, num3, num4, num5;
    System.out.println("Digete o 1o número: ");
    num1 = sc.nextInt();
    System.out.println("Digete o 2o número: ");
    num2 = sc.nextInt();
    System.out.println("Digete o 3o número: ");
    num3 = sc.nextInt();
    System.out.println("Digete o 4o número: ");
    num4 = sc.nextInt();
    System.out.println("Digete o 5o número: ");
    num5 = sc.nextInt();

    System.out.format("Os números digitados foram:\n %d + %d + %d + %d + %d = %d \n", num1, num2, num3, num4, num5, num1+num2+num3+num4+num5);
    
  }
 }
