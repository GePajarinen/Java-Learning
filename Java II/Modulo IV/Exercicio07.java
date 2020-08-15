/**
 *  Faça um programa que recebe dois números e execute uma das operações 
 * listadas a seguir, de acordo com a escolha do usuário. Se for digitada 
 * uma opção inválida, mostre uma mensagem avisando sobre isso e termine a 
 * execução do programa. As opções são:
    1. Oprimeiro número elevado ao segundo número.
    2. Raiz quadrada de cada um dos números.
    3. Raiz cúbica de cada um dos números.
 */

import java.math.*;

public class Exercicio07 {
   public static void main(String[] args) {
      int num1, num2, escolha;
      float resultado1, resultado2;

      System.out.println("Digite um número:");
      num1 = Integer.parseInt(System.console().readLine());
      
      System.out.println("Digite outro número: ");
      num2 = Integer.parseInt(System.console().readLine());

      System.out.println("Agora, ecolha a operação que deseja relalizar:\n 1. Oprimeiro número elevado ao segundo número. \n 2. Raiz quadrada de cada um dos números.\n 3. Raiz cúbica de cada um dos números.\n");
      escolha = Integer.parseInt(System.console().readLine());

      switch (escolha){
         case 1:
            int resultado;
            resultado = (int) Math.pow(num1, num2);
            System.out.format("%d elevado à %d é igual à %d%n", num1, num2, resultado);
         break;

         case 2:
            resultado1 = (float) Math.sqrt(num1);
            resultado2 = (float) Math.sqrt(num2);
            System.out.format("A raíz de %d é %.2f e de %d é %.2f%n", num1, resultado1, num2, resultado2);
         break;

         case 3:   
            resultado1 = (float) Math.cbrt(num1);
            resultado2 = (float) Math.cbrt(num2);
            System.out.format("A raíz cúbica de %d é %.2f e de %d é igual à %.2f%n", num1, resultado1, num2, resultado2);
         break;

         default:
         System.out.println("\n * Escolha inválida. *\n");
         break;

      }

   }
}