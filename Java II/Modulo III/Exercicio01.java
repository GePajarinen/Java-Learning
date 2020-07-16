/**
 * EXERCÍCIO 01
 * Escreva um programa em Java (utilizando switch) 
 * que leia três números inteiros que representam uma data com dia, mês e ano 
 * respectivamente. O programa deve escrever esta data da seguinte forma:
 * dia de nome do mês de ano.
 */

public class Exercicio01 {
    public static void main(String[] args) {
        int dia, ano, mes;

        System.out.println("Digite o dia: ");
        dia = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o mês: ");
        mes = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o ano: ");
        ano = Integer.parseInt(System.console().readLine());
        
        switch (mes) {
            case 1:
                System.out.printf("Data: %d de janeiro de %d\n", dia, ano);
                break;
            case 2:
                System.out.printf("Data: %d de fevereiro de %d\n", dia, ano);
                break;
            case 3:
                System.out.printf("Data: %d de março de %d\n", dia, ano);
                break;
            case 4:
                System.out.printf("Data: %d de abril de %d\n", dia, ano);
                break;
            case 5:
                System.out.printf("Data: %d de maio de %d\n", dia, ano);
                break;
            case 6:
                System.out.printf("Data: %d de junho de %d\n", dia, ano);
                break;
            case 7:
                System.out.printf("Data: %d de julho de %d\n", dia, ano);
                break;
            case 8:
                System.out.printf("Data: %d de agosto de %d\n", dia, ano);
                break;
            case 9:
                System.out.printf("Data: %d de setembro de %d\n", dia, ano);
                break;
            case 10:
                System.out.printf("Data: %d de outubro de %d\n", dia, ano);
                break;
            case 11:
                System.out.printf("Data: %d de novembro de %d\n", dia, ano);
                break;
            case 12:
                System.out.printf("Data: %d de dezembro de %d\n", dia, ano);
                break;
            
            default:
                System.out.println("A data do mês está incorreta.");
                break;
        }
    }
}