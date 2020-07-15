/**
 * EXERCÍCIO 08
 *  Faça um programa, utilizando as estruturas repita e do..while
 *  que repita a leitura de uma senha até que o usuário digite o número 1234. 
 * Após isso, mostrar a mensagem “Senha correta, acesso liberado.”
 */

public class Exercicio08 {
    public static void main(String[] args) {
        int senha;

        do{
            System.out.println("Digite sua senha: ");
            senha = Integer.parseInt(System.console().readLine());

        } while(senha != 1234);

        System.out.println("Senha correta, acesso liberado.");
    }
}