/*
* EXERCICIO 02
* Faça um programa que leia um valor numérico inteiro. 
* O programa deve apresentar a mensagem “O valor está na faixa permitida”, 
* caso o valor informado esteja entre 1 e 9. Se o valor estiver fora da faixa, 
* o programa deve apresentar a mensagem “O valor está fora da faixa permitida”.
 */

public class Exercicio02 {
    public static void main (String[] args){
        int num;

        System.out.println("Digite um numero: ");
        num = Integer.parseInt(System.console().readLine());

        if(num >= 1 || num <=9){
            System.out.println("O valor está na faixa permitida");
        }
        else{
            System.out.println("O valor está fora da faixa permitida");
        }
    }
}