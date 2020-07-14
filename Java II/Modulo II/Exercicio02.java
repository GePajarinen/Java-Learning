/**
 * Faça um programa que calcule o somatório, a soma dos quadrados 
 * e a média entre os n primeiros números inteiros positivos.
 * (Muito consuso, mas vou criar algo)
 */

public class Exercicio02 {
    
    public static void main(final String[] args) {

        int entrada, somatorio=0, soma_quad=0;
        double mediana;

        System.out.println("Digite um número: \n>>");
        entrada = Integer.parseInt(System.console().readLine());

        for(int i=0; i<= entrada; i++){
            somatorio += i;
            soma_quad += Math.pow(i, 2);
        }
        
        mediana = (double) somatorio/ entrada;

        System.out.printf("O Somatório dos números é: %d\n", somatorio);
        System.out.printf("A soma dos quadrados é: %d\n", soma_quad);
        System.out.printf("A média dos números é: %.1f\n", mediana);

    }

}