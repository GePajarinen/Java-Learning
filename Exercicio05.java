/**
 *  EXERCÍCIO 05
 * Desenvolva um programa que leia quatro valores numéricos inteiros e 
 * mostre os valores que são divisíveis por 2 e 3.
 */

public class Exercicio05 {

    public static void main (String[] args){

        int num1, num2, num3, num4;

        System.out.println("Digite o primeiro valor: ");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o segundo valor: ");
        num2 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o terceiro valor: ");
        num3 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o quarto valor: ");
        num4 = Integer.parseInt(System.console().readLine());


        if (num1 % 2 == 0 && num1 % 3 == 0){
            System.out.printf("O número %d é divisível por 2 e 3.\n", num1);
        }
        if (num2 % 2 == 0 && num2 % 3 == 0){
            System.out.printf("O número %d é divisível por 2 e 3.\n", num2);
        }
        if (num3 % 2 == 0 && num3 % 3 == 0){
            System.out.printf("O número %d é divisível por 2 e 3.\n", num3);
        }
        if (num4 % 2 == 0 && num4 % 3 == 0){
            System.out.printf("O número %d é divisível por 2 e 3.\n", num4);
        }
            
    }
}