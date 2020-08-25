import java.io.*;
import java.util.Scanner;

/*
EXERCÍCIO 03
A empresa JS Recrutamento e Seleção Ltda. faz recrutamento e seleção de funcionários para várias empresas em diversos ramos de atuação. Para facilitar o trabalho de identificação do perfil dos candidatos que se inscrevem para as vagas, resolveu fazer um programa para registrar alguns dados para obter as informações a seguir:
a. número de candidatos do sexo feminino;
b. número de candidatos do sexo masculino;
c. idade média dos homens;
d. idade média das mulheres com experiência

Faça um programa para calcular as informações solicitadas anteriormente, sabendo que para cada candidato devem ser informados sexo (M ou F), idade e tempo de experiência profissional (em anos). Também considere que a cada iteração deverá ser perguntado ao usuário se deseja cadastrar outro candidato ou não. Quando a resposta for negativa, os resultados deverão ser apresentados.
*/

class Candidato{

  int mulheres, homens, sum_id_homens, sum_id_mulheres_exp;
    
  public void cadastrando(String n, int i, char s, float ae){
    String nome = n;
    int idade = i;
    char sexo = s;
    float anos_expe = ae;

    if (Character.toString(sexo).equals("F")){
      mulheres ++;
      if(anos_expe > 0){
        sum_id_mulheres_exp += idade;
      }
      else{
        sum_id_mulheres_exp = sum_id_mulheres_exp;
      }
    }
    else{
      homens++;
      sum_id_homens += idade;
    }
    
  }

  void printInfo(){

    float media_id_homens = (float) sum_id_homens/homens; 
    float media_id_mulheres_exp = (float) sum_id_mulheres_exp/mulheres;

    System.out.println("a. Número de candidatos do sexo feminino = " + mulheres);
    System.out.println("b. Número de candidatos do sexo masculino = " + homens);
    System.out.println("c. Idade média dos homens = " + media_id_homens); 
    System.out.println("d. Idade média das mulheres com experiência = " + media_id_mulheres_exp);
    }
}

class Main {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    char resposta = 'S';
    Candidato c = new Candidato();

    do{
      System.out.println("Nome do Candidato: ");
      String nome = sc.next();
      System.out.println("Idade: ");
      int idade = sc.nextInt();
      System.out.println("Sexo: ");
      char sexo = sc.next().charAt(0);
      System.out.println("Anos de experiência: ");
      float exp = sc.nextFloat();
      
      c.cadastrando( nome, idade, sexo, exp);
      System.out.println("Deseja cadastrar outro candidato? S ou N ");
      
      resposta = Character.toUpperCase(sc.next().charAt(0));
    }
      while(Character.toString(resposta).equals("S"));

      c.printInfo();
  
  }
}
