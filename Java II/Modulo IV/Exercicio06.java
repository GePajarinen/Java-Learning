/**
 * Escreva um programa em Java que simule o lançamento de um dado, 
 * ou seja, sorteie um número entre 1 e 6.
 */

import java.lang.Math;

public class Exercicio06 {
    public static void main(String[] args) {
        int num; 
    
        num =  1 + (int)(Math.random()*6);
        System.out.format("O número sorteado foi: %d%n", num);
    }
}