/*
EXERCÍCIO 08
Em uma eleição presidencial existem quatro candidatos. Os votos são informados por meio de um código. Os códigos utilizados são:
1, 2, 3, 4 Votos para os respectivos candidatos;
5 Voto nulo;
6 Voto em branco.
Faça um programa que calcule e mostre:
- o total de votos para cada candidato;
- o total de votos nulos;
- o total de votos em branco;
- a percentagem de votos nulos sobre o total de votos;
- a percentagem de votos em branco sobre o total de votos.
Para finalizar o conjunto de votos, tem-se o valor zero e, para códigos inválidos, o programa deverá mostrar uma mensagem.
*/

import java.util.*;

class Exercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int candidato1=0, candidato2=0, candidato3=0, candidato4=0, nulo=0, branco=0, voto=0;
  
    do{
      System.out.print("Entre o númedo do voto: \n>> ");
      voto = sc.nextInt();

      switch (voto){
        case 0:
          break;
        case 1:
          candidato1++;
          break;
        case 2:
          candidato2++;
          break;
        case 3:
          candidato3++;
          break;
        case 4:
          candidato4++;
          break;
        case 5:
          nulo++;
          break;
        case 6:
          branco++;
          break;
        default:
          System.out.println(">> Número inválido. Tente novamente.<<");
          break;
      }
    }while (voto >0);

    System.out.println("*********  RESULTADOS  *********");
    System.out.format("Total de votos para cada candidato: \n Candidato-1: %d \n Candidato-2: %d \n Candidato-3: %d \n Candidato-4: %d \n", candidato1, candidato2, candidato3, candidato4);
    System.out.format("Total de votos nulos: %d\n", nulo);
    System.out.format("Total de votos em branco: %d\n", branco);
    System.out.format("Percentagem de votos nulos sobre o total de votos: %.1f%%\n", (float)(nulo*100)/(candidato1 + candidato2 + candidato3 + candidato4 + nulo + branco));
    System.out.format("Percentagem de votos em branco sobre o total de votos: %.1f%%\n", (float)(branco*100)/(candidato1 + candidato2 + candidato3 + candidato4 + nulo + branco));


  }
}
