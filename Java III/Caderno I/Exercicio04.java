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


class Cadastro{
  int id;
  float salario;

  void cadastrando(int i, float s){
    id = i;
    salario = s;
  }

}

class Main {
  
  private static DecimalFormat df = new DecimalFormat("0.00");
  

  public static void main(String[] args) {
    float tt_salarios=0;

    //Creating 58 random salaries:
    for(int i=1; i<=8; i++){
      
      df.setRoundingMode(RoundingMode.DOWN);
      float salario = Float.parseFloat(df.format(1200.00 + (Math.random() * 3000.00)));

      System.out.println(salario);
    
      Cadastro c = new Cadastro();
      c.cadastrando(i, salario);

      tt_salarios+=salario;
      
    }

    System.out.println("Valor total da folha de pagamento" + tt_salarios);
    
  }
}
