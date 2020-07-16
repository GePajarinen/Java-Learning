/**
 * EXERCÍCIO 07
 * 3 a 7. Refaça os exercícios 1, 2, 5, 6, 7 do caderno de exercícios 
 * do módulo anterior utilizando a estrutura for.
 */
/**
 * EXERCÍCIO 07
 * Faça um programa que apresente os quadrados dos números inteiros de 15 a 200.
 */

public class Exercicio07 {
    public static void main(String[] args) {
        
        int numeros= 15;

        while (numeros<=200){
            int quadrado = (int) Math.pow(numeros, 2);
            System.out.printf("O quandrado de %d é: %d\n", numeros, quadrado);
            numeros++;
        }
    }
}