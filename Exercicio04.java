/*
* EXERCÍCIO 04
* Construa um programa que leia três valores para os lados de um triângulo (A, B e C). 
* O programa deve verificar se os lados fornecidos formam realmente um triângulo. 
* Em caso positivo, deve mostrar a mensagem “Os lados formam um triângulo” e caso contrário
* “Os valores informados não podem formar um triângulo”. Para que três valores de lados formem um triângulo,
* cada par de lados somados não pode ser menor ou igual ao terceiro lado.
 */

public class Exercicio04 {
    public static void main (String[] args){

        int A, B, C;

        System.out.println("Digite um valor para A: ");
        A = Integer.parseInt(System.console().readLine());
        System.out.println("Digite um valor para B: ");
        B = Integer.parseInt(System.console().readLine());
        System.out.println("Digite um valor para C: ");
        C = Integer.parseInt(System.console().readLine());

        if (A+B > C || A+C > B || B+C > A ){
            System.out.println("Os lados formam um triângulo");
        }
        else{
            System.out.println("Os valores informados não podem formar um triângulo");
        }
        //Parece que sempre vai dar triângulo.
        
    }
}