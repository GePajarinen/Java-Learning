/*
EXERCÍCIO 01
Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os dados de idade, sexo (M ou F), e salário. Faça um programa que leia essas informações para cada habitante, calcule e mostre:
- a média dos salários do grupo;
- a maior e a menor idade do grupo;
- a quantidade de mulheres com salário até R$ 1500,00;
- a idade e o sexo da pessoa que possui o menor salário.
Finalize a entrada de dados ao ser digitada uma idade negativa.
*/
import java.util.Scanner;

public class Exercicio01 { 

    
  public static void main (String[] args){
    int idade, entrada =0, maior_id=0, menor_id=200, mulheres=0, menor_sal_idade;
    String sexo, menor_sal_sexo= " ";
    float salario, soma_salario=0, media_salario, menor_sal= 5000000;

    do {

      menor_sal_idade = menor_id;
            
      Scanner sc = new Scanner(System.in);

      System.out.println("\n***Informações do habitante: ***");
      System.out.println("Idade: ");
      idade = sc.nextInt();

      if (idade < 0){
        break;
      }
      
      entrada ++;

      if (idade > maior_id){
        maior_id = idade;
      }
      if (idade < menor_id){
        menor_id = idade;
      }

      System.out.println("\nSexo 'F' ou 'M': ");
      sexo = sc.next();
      char sex_char = sexo.charAt(0);

      System.out.println("\nSalário: ");
      salario = sc.nextFloat();

      if (sex_char == 'F' || sex_char == 'f' && salario <= 1500.00){
        mulheres ++;
      }

      soma_salario += salario;

      if (salario< menor_sal){
        menor_sal_sexo = sexo;
        menor_sal_idade = idade;
      }
      
    } while (idade >0);

    media_salario = soma_salario / (float)entrada;


    System.out.format("\nA média dos salários do grupo é: R$ %.2f", media_salario);

    System.out.format("\nA maior e a menor idade do grupo são: %d e %d ", maior_id, menor_id);

    System.out.format("\nA quantidade de mulheres com salário até R$ 1500,00: %d", mulheres);

    System.out.println("\nA idade e o sexo da pessoa que possui o menor salário são: " + menor_sal_idade + " e " + menor_sal_sexo);
    
  }
 }
