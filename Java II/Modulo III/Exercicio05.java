/**
 * EXERCÍCIO 05
 * 3 a 7. Refaça os exercícios 1, 2, 5, 6, 7 do caderno de exercícios 
 * do módulo anterior utilizando as estruturas for.
 */
**
 * EXERCÍCIO 05
 * Crie um programa para ler a quantidade de litros de combustível e a 
 * distância percorrida por um carro em várias viagens. O programa deve 
 * calcular o consumo médio do carro, que é igual a média de quilômetros por 
 * litro de todas as viagens. O número de viagens realizado deve ser informado 
 * pelo usuário.
 */

public class Exercicio05 {
    public static void main(String[] args) {
        double litros, distancia, media, totalDistancia=0.0, totalLitros=0.0;
        int viagens;

        System.out.println("Digite a quantidade de viagens: ");
        viagens = Integer.parseInt(System.console().readLine());

        for (int i = 1; i <= viagens; i++){
            System.out.println("Digite a quantidade de combustível em litros: ");
            litros = Double.parseDouble(System.console().readLine());
            totalLitros += litros;

            System.out.println("e a distância em Km: ");
            distancia = Double.parseDouble(System.console().readLine());
            totalDistancia += distancia;
        }

        media = totalDistancia / totalLitros;
        System.out.printf("A média de quilômetros por litro é: %.2f Km/L \n", media);
    }
}