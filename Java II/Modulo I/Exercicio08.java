/* EXERCÍCIO 08
 * Faça um programa que leia três valores numéricos inteiros, 
 * identifique e apresente o menor valor informado.
 */


public class Exercicio08 {
    public static void main (final String[] args) {

        int num1, num2, num3;

        System.out.println("Digite o primeiro valor: ");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o segundo valor: ");
        num2 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o terceiro valor: ");
        num3 = Integer.parseInt(System.console().readLine());

        if (num1 < num2 && num1< num3){
            System.out.printf("O número %d é o menor.\n", num1);
        }
        if (num2 < num1 && num2< num3){
            System.out.printf("O número %d é o menor.\n", num2);
        }
        if (num3 < num2 && num3< num1){
            System.out.printf("O número %d é o menor.\n", num3);
        }

     }

}