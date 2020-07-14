/**
 * EXERCÍCIO 09
 * Uma empresa decide dar um aumento de 30% aos funcionários cujo salário é inferior a 5000. 
 * Escreva um programa que possa ser utilizado para efetuar o cálculo do salário reajustado de um funcionário, 
 * a partir do valor do salário informado pelo usuário.
 */

public class Exercicio09 {
    public static void main (String[] args){

        double salario_inicial, salario_final;
        
        System.out.println("Digite o salário do funcionário: ");
        salario_inicial = Double.parseDouble(System.console().readLine());

        if (salario_inicial< 5000){
            salario_final = salario_inicial + ((salario_inicial * 30) / 100);
            System.out.printf("O salário com reajuste será: %.2f\n", salario_final);
        }
        else{
            System.out.println("O salário é igual ou maior que 5000. Não haverá reajuste.");
        }
    }
}