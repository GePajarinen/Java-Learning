/**
 * Escreva um programa em Java que leia um número real qualquer e um número 
 * de casas decimais (inteiro) e o arredonde o número real para o número de 
 * casas especificado. Por exemplo, caso o usuário informe o número 1,1379 e 2 
 * casas decimais, o número seria arredondado para 1,14.
 */

import java.math.*; 

public class Exercicio05 {
  public static void main(String[] args) {
    BigDecimal num;
    int casas;

    System.out.println("Digite o número real: \n");
    //num = Float.parseFloat(System.console().readLine());
    num = new BigDecimal(System.console().readLine());

    System.out.println("\nPara quantas casas decimais deseja arrendodar? \n");
    casas= Integer.parseInt(System.console().readLine());

    BigDecimal resultado = num.setScale(casas, RoundingMode.FLOOR);
    System.out.println(resultado);


    //https://www.tutorialspoint.com/java/math/bigdecimal_setscale_rm_roundingmode.htm

  }
}