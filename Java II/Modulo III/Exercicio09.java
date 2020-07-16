/**
 * EXERCÍCIO 09
 * A série de Fibonacci é formada pela seguinte sequência: 
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ... etc, onde o próximo número 
 * é igual a soma dos dois anteriores. Escreva um programa que gere
 *  os dez primeiros números da série de Fibonacci, utilizando estruturas 
 * repita e do...while.
 */

 
public class Exercicio09 {
    public static void main(String[] args) {
        int primeiro=0, segundo=1, total= 0, i=1;

        do{
            System.out.printf("%d\n", primeiro);
           total = primeiro + segundo;
           primeiro = segundo;
           segundo = total;
            i ++;
           
        }
        while(i<=10);
    }
}