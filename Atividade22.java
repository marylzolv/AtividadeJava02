import java.util.Scanner;

public class Atividade22 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = entrada.nextInt();

        System.out.print("Digite o peso da pessoa: ");
        double peso = entrada.nextDouble();

        int grupoDeRisco = 0; 

        if (idade < 20) {
            if (peso <= 60) {
                grupoDeRisco = 9;
            } else if (peso <= 90) {
                grupoDeRisco = 8;
            } else {
                grupoDeRisco = 7;
            }
        } else if (idade >= 20 && idade <= 50) {
            if (peso <= 60) {
                grupoDeRisco = 6;
            } else if (peso <= 90) {
                grupoDeRisco = 5;
            } else {
                grupoDeRisco = 4;
            }
        } else if (idade > 50) {
            if (peso <= 60) {
                grupoDeRisco = 3;
            } else if (peso <= 90) {
                grupoDeRisco = 2;
            } else {
                grupoDeRisco = 1;
            }
        }

        System.out.println("Grupo de risco: " + grupoDeRisco);

         entrada.close(); 
    }
}
