/*
EXERCÍCIO 04
Faça um programa que leia dois vetores (A e B) com cinco posições. 
Cada vetor deverá armazenar números inteiros. O programa deve, então, subtrair 
o primeiro elemento de A do último de B, acumulando o valor; subtrair o segundo 
elemento de A do penúltimo de B, acumulando o valor, e assim por diante. Ao final, 
mostre o resultado de todas as subtrações realizadas.
*/

public class Exercicio04 { 
   
  public static void main (String[] args){
   
    
    int a[] = {5, 6, 7, 8, 9};
    int b[] = {0, 1, 2, 3, 4};
    int acumulado = 0;
    int i=0;

    while (i <5){
      acumulado += (a[i] - b[4-i]);
      i++;
  
    }
    
    System.out.println("Acumulado= " + acumulado);
    
  }
}
