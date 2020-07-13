/**
 * EXERCÍCIO 10
 * A nota final de um estudante é calculada a partir de três notas atribuídas,
 * respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a um exame final. 
 * A média das três notas mencionadas obedece aos pesos a seguir:
 * 
 *         Nota            / Peso
 * Trabalho de laboratório /   2
 * Avaliação semestral     /   3
 * Exame final             /   5

 * Faça um programa que receba as três notas, calcule e mostre a 
 * média ponderada e o conceito que segue a tabela:
 * 
 *        Média Ponderada              /    Conceito
 * 8,0 (inclusive) a 10,0 (inclusive)  /       A
 * 7,0 (inclusive) a 8,0               /       B
 * 6,0 (inclusive) a 7,0               /       C
 * 5,0 (inclusive) a 6,                /       D
 * 0,0 (inclusive) a 5,0               /       E
 */

public class Exercicio10 {
    public static void main (String[] args){

        double nota1, nota2, nota3, media_p, peso1= 2, peso2= 3, peso3= 5 ;


        System.out.println("Digite a primeira nota: ");
        nota1 = Double.parseDouble(System.console().readLine());
        System.out.println("Digite a segunda nota: ");
        nota2 = Double.parseDouble(System.console().readLine());
        System.out.println("Digite a terceita nota: ");
        nota3 = Double.parseDouble(System.console().readLine());

        media_p = ((nota1*peso1) + (nota2*peso2) + (nota3*peso3))/ (peso1+peso2+peso3);

        if(media_p >=0.0 && media_p <5.0){
           System.out.printf("A média foi de %.1f e o Conceito é E.\n", media_p);
        }
        if(media_p >=5.0 && media_p <6.0){
            System.out.printf("A média foi de %.1f e o Conceito é D.\n", media_p);
        }
        if(media_p >=6.0 && media_p <7.0){
            System.out.printf("A média foi de %.1f e o Conceito é C.\n", media_p);
        }
        if(media_p >=7.0 && media_p <8.0){
            System.out.printf("A média foi de %.1f e o Conceito é B.\n", media_p);
        }
        if(media_p >=8.0 && media_p <=10.0){
            System.out.printf("A média foi de %.1f e o Conceito é A.\n", media_p);
        }
    }
}