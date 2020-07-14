/**
 * Faça um programa que calcule a soma de dez números quaisquer fornecidos pelo usuário
 */

 public class Exercicio01{
     public static void main (String[] args){

        int numero, soma=0;

        for (int i=1; i<=10 ; i++ ){
            
            System.out.printf("Digite o %d° número: \n>> ", i);
            numero = Integer.parseInt(System.console().readLine());
            soma += numero;
        }

        System.out.printf(" A soma dos números é: %d\n", soma);
        
     }
 }