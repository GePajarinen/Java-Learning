/**
 * EXERCÍCIO 04
 * 3 a 7. Refaça os exercícios 1, 2, 5, 6, 7 do caderno de exercícios 
 * do módulo anterior utilizando as estruturas para..faça e for.
 */
/**
 * EXERCÍCIO 04
 * Faça um programa que receba várias idades, calcule e mostre a 
 * média das idades digitadas. 
 * Finalize digitando idade igual a zero. 
 * */

public class Exercicio04{

    public static void main(String[] args) {
        
        int idade, soma=0, cont=1;
        double media;

        do{
            System.out.println("Digite a idade: ");
            idade = Integer.parseInt(System.console().readLine());

            soma += idade;
            cont++;
        }
        while(idade != 0);

        media = (double)  soma / cont;

        System.out.printf("A média de todas as idades é: %.1f\n", media);
    }
 }