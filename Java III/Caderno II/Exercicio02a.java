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

public class Exercicio02a { 
   
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    
    int lista[] = new int[5];
    int sum =0;

    System.out.println("Digite o 1o número: ");
    lista[0] = sc.nextInt();
    System.out.println("Digite o 2o número: ");
    lista[1] = sc.nextInt();
    System.out.println("Digite o 3o número: ");
    lista[2] = sc.nextInt();
    System.out.println("Digite o 4o número: ");
    lista[3] = sc.nextInt();
    System.out.println("Digite o 5o número: ");
    lista[4] = sc.nextInt();
    
    for (int i=0; i<5; i++){
      sum += lista[i];
    }

    System.out.format("Os números digitados foram:\n %d + %d + %d + %d + %d = %d \n", lista[0], lista[1],lista[2],lista[3],
    lista[4], sum);


  }
 }
