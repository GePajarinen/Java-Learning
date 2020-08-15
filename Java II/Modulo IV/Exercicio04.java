/**
 * EXERCÍCIO 04
 * Escreva um programa em Java que calcule as raízes de uma equação de 
 * segundo grau utilizando a fórmula de Báskara. A equação de segundo 
 * grau é uma equação no formato Ax2 + Bx + C. O usuário deve informar os 
 * valores para A, B e C.
 */

import java.lang.Math;

public class Exercicio04 {
    public static void main (String[] args){
            
        double delta, x1, x2, A, B, C;

        System.out.println("Digite um valor para A: \n");
        A = Double.parseDouble(System.console().readLine());
        System.out.println("Digite um valor para B: \n");
        B = Double.parseDouble(System.console().readLine());
        System.out.println("Digite um valor para C: \n");
        C = Double.parseDouble(System.console().readLine());

        delta = Math.pow(B,2) - (4*A*C);

        if (delta < 0){ //equação não possui resultados reais;
        System.out.println("A equação não possui resultados reais.\n");
        }
        if(delta == 0){//a equação possui apenas um resultado real 
        x1 = ((-1*B)+ (Math.sqrt(delta)))/ (2*A);
        System.out.format("x1 = x2 = %f%n", x1);
        }
        if (delta > 0){ // a equação possui dois resultados distintos reais.
        x1 = ((-1*B)+ (Math.sqrt(delta)))/ (2*A);
        x2 = ((-1*B)- (Math.sqrt(delta)))/ (2*A);
        System.out.format("\nS = { %.2f, %.2f}\n", x1, x2);
        }
    }
}