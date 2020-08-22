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


class Main {


  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    char resposta = 'S';

    do{
      System.out.println("Nome do Candidato: ");
      String nome = sc.next();
      System.out.println("Idade: ");
      int idade = sc.nextInt();
      System.out.println("Sexo: ");
      char sexo = sc.next().charAt(0);
      System.out.println("Anos de experiência: ");
      float exp = sc.nextFloat();
      
      Candidato c1 = new Candidato();
      c1.cadastrando( nome, idade, sexo, exp);
      System.out.println("Deseja cadastrar outro candidato? S ou N ");
      
      resposta = Character.toUpperCase(sc.next().charAt(0));
    }
      while(Character.toString(resposta).equals("S"));
    


  }
}
