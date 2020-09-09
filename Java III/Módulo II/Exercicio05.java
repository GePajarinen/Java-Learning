/*
EXERCÍCIO 05
Faça um programa que leia um vetor com 20 posições contendo números inteiros. 
Logo após, divida todos os seus elementos pelo maior valor do vetor e os armazene 
em outro vetor. Mostre, ao final, os valores armazenados em todas as posições do vetor após os cálculos.
*/

public class Exercicio05 { 
   
  public static void main (String[] args){
   int arr[] = {1,3,5,6,8,9,7,11,44,55,2,23,32,45,65,87,98,89,19,20};
   int maior=0;
   float div[] = new float[20];

   //System.out.print(arr.length);
   for (int i=0; i<20; i++){
     System.out.format("%d, ", arr[i]);
      if (arr[i]> maior){
        maior = arr[i];
      }
   }
   System.out.println("\nMaior= " + maior);

   for (int j=0; j<20; j++){
    div[j] = (float) arr[j]/maior;
    System.out.format("%.2f, ", div[j]);
   }
   
    
  }
}
