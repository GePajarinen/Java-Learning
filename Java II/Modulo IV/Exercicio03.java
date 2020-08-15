/**
 * EXERCÍCIO 03
 * Escreva um programa em Java que leia um string contendo um 
 * número em binário e o mostre em decimal na tela.
 */
    
import java.util.Scanner;

public class Exercicio03 {

  public static void main(String[] args) {
  
    System.out.print("Digite o número binário:\n ");

    Scanner sc = new Scanner( System.in ); // !!!!!!!! Entrada de Strings
    
    String num_binario = sc.nextLine(); // !!!!!!!! Entrada de Strings
    
    System.out.println("O número em Decimal é: "+ Integer.parseInt(num_binario,2)); //Integer.parseInt(num_binario,2) > o que converte pra BINARIO
    
  }
  
}
