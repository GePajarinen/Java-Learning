/**
EXERCÍCIO 07
Faça um programa que apresente o menu de opções a seguir:
Menu de opções:
1. Média Aritmética 
2. Média ponderada 
3. Sair
Na opção 1, receber duas notas, calcular e mostrar a média aritmética deles.
Na opção 2, receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
Na opção 3, sair do programa.
Verifique a possibilidade de opção inválida, Neste caso, o programa deverá mostrar uma mensagem.
*/
import java.util.*;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);
    
    System.out.println("Menu de opções:\n 1. Média Aritmética\n 2. Média ponderada\n 3. Sair");
    int opcao = sc.nextInt();

    switch(opcao){
      case 1:
        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();
        System.out.format("A média aritmética de %d e %d é: %.1f\n", num1, num2, (float)(num1+num2)/2);
        break;
      case 2:
        System.out.println("Digite o primeiro número: ");
        float mp1 = sc.nextFloat();
        System.out.println("Digite o peso desse número: ");
        float p1 = sc.nextFloat();
        System.out.println("Digite o segundo número: ");
        float mp2 = sc.nextFloat();
        System.out.println("Digite o peso desse número: ");
        float p2 = sc.nextFloat();
        System.out.println("Digite o terceiro número: ");
        float mp3 = sc.nextFloat();
        System.out.println("Digite o peso desse número: ");
        float p3 = sc.nextFloat();
        System.out.format("A média ponderada é: %.1f\n", ((mp1*p1)+(mp2*p2)+(mp3*p3))/(p1+p2+p3));
        break;
      case 3:
        System.out.println("Saindo do programa.");
        break;
      default:
        System.out.println(">>Opção inválida. Tente novamente.<<");

    }

    
  }
}
