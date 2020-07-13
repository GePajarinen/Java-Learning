/*
Faça um programa que leia dois valores numéricos inteiros e apresente o 
resultado da diferença do maior valor pelo menor valor. Se os valores forem iguais, 
o programa deve mostrar zero.
*/

class Exercicio01 { 
    public static void main (String[] args){
        int num1, num2;

        System.out.println("Digite um numero: ");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite outro numero: ");
        num2 = Integer.parseInt(System.console().readLine());

        if (num1 > num2){
            System.out.printf("A diferenca entre %d e %d é: %d", num1, num2, num1-num2);
        }
        if(num1 < num2){
            System.out.printf("A diferenca entre %d e %d é: %d ", num2, num1, num2-num1);
        }
        if (num1 == num2){
            System.out.printf("A diferenca entre %d e %d é: 0", num1, num2);
        }
    }
}