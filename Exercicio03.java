/*
* EXERCÍCIO 03
* Construa um programa que leia três valores numéricos (representados pelas variáveis A, B e C) 
* e faça o cálculo do delta de uma equação de segundo grau, segundo a fórmula de Báskara. 
* O programa deve mostrar quantas raízes reais a equação possui (delta < 0 – mostrar
* uma mensagem dizendo que a equação não possui raízes reais, delta > 0 – mostrar que possui 
*  duas raízes reais, delta = 0 – mostrar que possui uma única raiz real).
*/

public class Exercicio03{
    public static void main (String[] args){
        int A, B, C, delta;

        System.out.println("Digite o valor de A: ");
        A = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o valor de B: ");
        B = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o valor de C: ");
        C = Integer.parseInt(System.console().readLine());

        delta = (B * B) - (4 * A * C);
        
        if (delta > 0){
           System.out.println("Delta possui duas raízes reais");
        }
        if (delta < 0){
            System.out.println("A equação não possui raízes reais");
        } 
        if (delta == 0){
            System.out.println("Delta possui uma única raiz real");
        }
        
    }
}