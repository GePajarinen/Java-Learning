/**
 * EXERCÍCIO 06
 * Para cada uma das mercadorias com que um armazém trabalha dispõe- se 
 * dos seguintes dados:
− o nome da mercadoria;
− o seu preço unitário;
− a quantidade total vendida no mês.
Elabore um programa para calcular o faturamento total mensal do armazém. 
O faturamento total do armazém será calculado somando-se o total faturado 
por cada mercadoria, que é igual a quantidade vendida da mercadoria vezes o 
seu preço unitário. O número de mercadorias comercializadas pelo armazém deve 
ser informado pelo usuário.
 */

public class Exercicio06 {
    public static void main(String[] args) {
        int quantidade, total;
        double preco, faturamento = 0.0;

        System.out.println("Digite a quantidade de produtos vendidos durante o mês: ");
        total = Integer.parseInt(System.console().readLine());

        for (int i= total; i>0; i-= quantidade ){
            System.out.println("Quantas unidades do produto? ");
            quantidade = Integer.parseInt(System.console().readLine());
            
            System.out.println("Qual o preço de casa unidades? ");
            preco = Double.parseDouble(System.console().readLine());

            faturamento += (double) quantidade * preco;

        }

        System.out.printf("Faturamento do mês é de: %.2f\n", faturamento);

    }
    
}