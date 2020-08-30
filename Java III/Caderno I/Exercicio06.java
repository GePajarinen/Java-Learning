/*
EXERCÍCIO 06
Faça um programa que mostre os conceitos finais dos alunos de uma turma de 75 pessoas, considerando a tabela a seguir. Para isso, a nota final e o código do aluno deverão ser fornecidos pelo usuário. 
Ao final do programa, apresente a quantidade de alunos e a média de nota alcançada para cada conceito.

    Nota       |   Conceito
De 0,0 a 2,9   |   E
De 3,0 a 4,9   |   D
De 5,0 a 6,9   |   C
De 7,0 a 8,9   |   B
De 9,0 a 10,0  |   A 
*/
import java.lang.Math.*;
import java.util.Scanner;

class Exercicio06 {

  public static void main(String[] args) {
    int num_alunos=0;
    int as=0, bs=0, cs=0, ds=0, es=0;
    Scanner sc = new Scanner(System.in);
    
    for (int i=0; i<75; i++){ //75 times!!!
      System.out.println("Digite o código do aluno: ");
      int cod = sc.nextInt();
      System.out.println("Digite a nota final do aluno: ");
      float nota = sc.nextFloat();

      num_alunos++;

      if (nota >= 0.0 && nota <= 2.9) {
        System.out.println("Conceito E\n");
        es++;
      }
      else if (nota >= 3.0 && nota <= 4.9){
        System.out.println("Conceito D\n");
        ds++;
      }
      else if (nota >= 5.0 && nota <= 6.9){
        System.out.println("Conceito C\n");
        cs++;
      }
      else if (nota >= 7.0 && nota <= 8.9){
        System.out.println("Conceito B\n");
        bs++;
      }
      else if (nota >= 9.0 && nota <= 10.0){
        System.out.println("Conceito A\n");
        as++;
      }
      
    }

    System.out.format("Total de alunos= %d \n", num_alunos);
    System.out.format("Média de conceito A = %.2f \n" , (float) as/num_alunos);
    System.out.format("Média de conceito B = %.2f \n" , (float) bs/num_alunos);
    System.out.format("Média de conceito C = %.2f \n" , (float) cs/num_alunos);
    System.out.format("Média de conceito D = %.2f \n" , (float) ds/num_alunos);
    System.out.format("Média de conceito E = %.2f \n" , (float) es/num_alunos);
    
  }
}