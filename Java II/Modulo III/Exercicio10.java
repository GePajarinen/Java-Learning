/**
 * EXERCÍCIO 10
 *  Faça um programa que mostre o menu de opções a seguir, receba a opção digitada pelo usuário 
 * e os dados necessários para executar cada operação. Note que dependendo da opção 
 * escolhida pelo usuário, um conjunto de instruções diferente será executado. DICA: 
 * utilize as estruturas escolha e switch para executar conjuntos de instruções diferentes, 
 * dependendo da opção escolhida pelo usuário.
    Menu de opções:
    1. Somar dois números. 
    2. Número ao quadrado.
    Digite a opção desejada
 */

public class Exercicio10 {
    public static void main(String[] args) {
       int opcao;

         System.out.println("--------Menu de opções:--------");
         System.out.println("1. Somar dois números.");
         System.out.println("2. Número ao quadrado");
         System.out.println("Digite a opção desejada:");
         
         opcao = Integer.parseInt(System.console().readLine());

       switch (opcao){
         case 1:
            System.out.println("Digite o primeiro número:");
            int primeiro = Integer.parseInt(System.console().readLine());
            System.out.println("Digite o segundo número:");
            int segundo = Integer.parseInt(System.console().readLine());

            int soma = primeiro + segundo;
            System.out.printf("A soma de %d e %d é: %d.\n", primeiro, segundo, soma);
            break;

         case 2:
            System.out.println("Digite o número:");
            int numero = Integer.parseInt(System.console().readLine());
            
            int quadrado = (int) Math.pow(numero, 2);

            System.out.printf("O quadrado de %d é: %d.\n", numero, quadrado);
            break;

         default:
            System.out.println("Opção incorreta.");
         }
    }
}