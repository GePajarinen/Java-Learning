/**
 * EXERCÍCIO 03
 * Crie um programa Java para exibir os quadrados de números digitados pelo usuário, 
 * até que ele digite um número negativo.
 */
public class Exercicio03 {
    
    public static void main(String[] args) {
        
        int num, quadrado;

        do{System.out.println("Digite um número: ");
        num = Integer.parseInt(System.console().readLine());  
        quadrado = (int) Math.pow(num, 2);
        
        if (num <0){
            break;
        }
        
        System.out.printf("O quadrado número %d é: %d\n", num, quadrado);
        System.out.println();

    }
        while(num > 0);

    }
}
