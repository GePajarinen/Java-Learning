/*
EXERCÍCIO 09
Faça um programa que apresente o menu de opções a seguir, que permita ao usuário escolher a opção desejada, receba os dados necessários para executar a operação e mostre o resultado. Verifique a possibilidade de opção inválida.

Menu de opções:
1. Novo salário
2. Férias
3. Décimo terceiro 
4. Sair

Na opção 1, receber o salário de um funcionário, calcular e mostrar o novo salário usando as regras a seguir:
          Salários             |    Percentagem de Aumento
Até R$ 1000,00                 |             15%
De R$ 1000,01 a R$ 3000,00     |             10%
Acima de R$ 3000,00            |              5%

Na opção 2, receber o salário de um funcionário, calcular e mostrar o valor de suas férias. Sabe-se que as férias equivalem ao seu salário acrescido de um terço do salário.

Na opção 3, receber o salário de um funcionário e o número de meses de trabalho na empresa, no máximo doze, calcular e mostrar o valor do décimo terceiro salário. Sabe-se que o décimo terceiro salário equivale ao seu salário multiplicado pelo número de meses de trabalho dividido por 12.

Na opção 4, sair do programa.
*/

import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcao = 0;

    do{
      System.out.println("\nMenu de opções:\n 1. Novo salário\n 2. Férias\n 3. Décimo terceiro \n 4. Sair");
      opcao = sc.nextInt();

      switch(opcao){
        case 1:
          System.out.print("Digite o salário: \n>> ");
          float salario = sc.nextFloat();
          if (salario <=1000){
            System.out.format("O novo salário é de: R$ %.2f\n", salario+((salario*15)/100));
          }
          if (salario >1000 && salario <=3000){
            System.out.format("O novo salário é de: R$%.2f\n", salario+((salario*10)/100));
          }
          else if (salario >3000){
            System.out.format("O novo salário é de : R$ %.2f\n", salario+((salario*5)/100));
          }
          break;
        case 2:
          System.out.print("Digite o salário: \n >> ");
          salario = sc.nextFloat();
          System.out.format("A remuneração de férias é de R$ %.2f\n", salario+((salario*33.33)/100));
          break;
        case 3:
          System.out.print("Digite o salário: \n >> ");
          salario = sc.nextFloat();
          System.out.print("Quantidade de meses trabalhados no ano: \n >> ");
          float meses = sc.nextFloat();
          System.out.format("O 13° é de: R$ %.2f\n", (salario*meses)/12);
          break;
        case 4:
          System.out.println(">> Saindo do programa.");
          break;
        default:
          System.out.println(">> Opção inválida. Tente novamente. <<");
          break;
      }
    }while (opcao !=4);
  }
}
