/*
EXERCÍCIO 04
A empresa PowerSoftware Ltda. possui 58 funcionários e pretende processar sua folha de pagamento de forma informatizada. 
Para isso, é necessário construir um programa que leia o salário de cada funcionário da empresa e calcule os descontos de imposto de renda e INSS de acordo com as tabelas abaixo e também uma porcentagem fixa correspondente ao plano de saúde que é de 4,5% do valor do salário. O programa também deve:
a. calcular o valor do salário líquido de cada um dos 58 funcionários;
b. calcular o valor total da folha de pagamento (soma dos salários de todos os funcionários);
c. calcular o valor total do imposto de renda que a empresa deverá recolher.
De acordo com as informações disponíveis no site da Receita Federal, a tabela de alíquotas do imposto de renda para o ano de 2018 é:
      Salário bruto (R$)         |   Alíquota (%)
      Até 1.903,98               |      -
      De 1.903,99 até 2.826,65   |     7,5
      De 2.826,66 até 3.751,05   |     15
      De 3.751.06 até 4.664,68   |     22,5
      Acima de 4.664,68          |     27,5
  
      Desconto do INSS:
      Salário bruto (R$)        |    Alíquota (%)
      Até 1.693,72              |       8%
      De 1.693,73 até 2.822,90| |       9%
      Acima de 2.822,90         |       11%
  */

import java.io.*;
import java.math.*;
import java.text.DecimalFormat;


class Exercicio04 {
  
  private static DecimalFormat df = new DecimalFormat("0.00");
  
  public static void main(String[] args) {
    float tt_salarios=0, tt_ir=0;
    

    //Creating 58 random salaries:
    for(int i=1; i<=58; i++){
      
      df.setRoundingMode(RoundingMode.DOWN);
      float salario = Float.parseFloat(df.format(1200.00 + (Math.random() * 3000.00)));
  

      tt_salarios +=salario;

      float liquido_sal, ir=1, inss=1;

      // IR
      if (salario <= 1903.98){
        ir = 0;
      }
      if (salario > 1903.98 && salario <= 2826.65){
        ir = (float)(salario*7.5)/100;
      }
      if (salario > 2826.65 && salario <=3751.05){
        ir = (float)(salario*15)/100;
      }
      if (salario > 3751.05 && salario <= 4664.68 ){
        ir = (float)(salario*22.5)/100;
      }
      if (salario > 4664.68){
        ir = (float)(salario*27.5)/100;
      }
      
      //INSS
      if (salario <= 1903.98){
        inss = 0;
      }
      if (salario > 1693.72 && salario <= 2822.9){
        inss = (salario*9)/100;
      }
      if (salario > 2822.9){
        inss = (salario*11)/100;
      }
      
      tt_ir += ir;
      liquido_sal = salario - ir - inss;

      System.out.println("Salário bruto: " + salario);
      System.out.println("IR : " + df.format(ir));
      System.out.println("INSS : " + df.format(inss));
      System.out.println("Salário líquido: " + df.format(liquido_sal));
      System.out.println();
      
    
    }
    System.out.println("----------------------------------------------------------");
    System.out.println("Valor total da folha de pagamento: " + tt_salarios);

     System.out.println("Total do imposto de renda que a empresa deverá recolher: " + df.format(tt_ir));
    
  }
}
