/***
 EXERCÍCIO 05
 Foi realizada uma pesquisa de algumas características físicas da população de certa região, a qual coletou os seguintes dados referentes a cada habitante para serem analisados:
- sexo (M ou F);
- cor dos olhos (1 – azuis, 2 – verdes, 3 – castanhos);
- cor dos cabelos (L – louros, C – castanhos, P – pretos, R - ruivos);
- idade;
- altura;
- peso.
Escreva um programa que leia essas informações para cada pessoa e apresente:
- a média da idade dos participantes, 
- a média do peso 
- e da altura de seus habitantes, 
- a porcentagem de pessoas do sexo feminino, 
- a porcentagem de pessoas do sexo masculino 
- e quantas pessoas possuem olhos azuis e cabelos ruivos. 
A cada iteração deverá ser perguntado ao usuário se deseja continuar ou não. Os resultados deverão ser mostrados apenas quando o usuário não desejar mais inserir dados.
*/


import java.util.*;

class Exercicio05 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      
    int idade=0, mulheres=0, homens=0, azul_ruivo=0;
    float altura=0, peso=0, media_idade, media_peso, media_altura;
    String continuar = "s";

    do{
      System.out.println("Digite o sexo: F ou M ");
      String sexo = Character.toString(Character.toUpperCase(sc.next().charAt(0)));
        if(sexo.equals("F")){
          mulheres ++;
        }else{
          homens++;
        }
      
      System.out.println("Cor dos olhos: \n 1 – azuis \n 2 – verdes \n 3 – castanhos");
      if (sc.nextInt() == 1){
          System.out.println("Cor dos cabelos: \n L – louros\n C – castanhos\n P – pretos\n R - ruivos");
          if(Character.toString(Character.toUpperCase(sc.next().charAt(0))).equals("R")){
            azul_ruivo++;
          }
      }
      else{
        System.out.println("Cor dos cabelos: \n L – louros\n C – castanhos\n P – pretos\n R - ruivos");
        String cor = Character.toString(Character.toUpperCase(sc.next().charAt(0)));
      }

      System.out.println("Idade: ");
      idade += sc.nextInt();

      System.out.println("Altura: ");
      altura += sc.nextFloat();

      System.out.println("Peso: ");
      peso += sc.nextFloat();

      System.out.println("Deseja cadastrar outra pessoa? 'S' ou 'N': ");
      continuar = Character.toString(Character.toUpperCase(sc.next().charAt(0)));

    }
    while(continuar.equals("S"));

    System.out.println("\n************* RESULTADOS *************\n" );

    media_idade = (float) idade/(mulheres+homens);
    System.out.println("A média da idade: " + media_idade + " anos.");

    media_peso = peso/(mulheres+homens);
    System.out.println("A média do peso: " + media_peso + "kg.");

    media_altura = altura/(mulheres+homens);
    System.out.println("A média da altura: " + media_altura +"m.");

    System.out.println("A porcentagem de pessoas do sexo feminino: " + (float)(mulheres*100)/(mulheres+homens)+ "%.");

    System.out.println("A porcentagem de pessoas do sexo masculino: " + (float)(homens*100)/(mulheres+homens) + "%.");

    System.out.println("Número de pessoas de olhos azuis e cabelos ruivos: "+  azul_ruivo);

  }
}
