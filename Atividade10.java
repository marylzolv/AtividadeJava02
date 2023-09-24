import java.util.Scanner;

public class Atividade10 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o custo da fábrica de carro");
        double custoFabrica = entrada.nextDouble();

        double porcentDistribuidor;
        double porcentImpostos;

        if (custoFabrica <= 12000.0) {
            porcentDistribuidor = 5.0;
            porcentImpostos = 0.0;
        } else if (custoFabrica <= 25000.0) {
            porcentDistribuidor = 10.0;
            porcentImpostos = 15.0;
        } else {
            porcentDistribuidor = 15.0;
            porcentImpostos = 20.0;
        }

        double precoConsumidor = custoFabrica + (custoFabrica * porcentDistribuidor / 100) + (custoFabrica * porcentImpostos / 100);
        System.out.println("O preço ao consumidor é: " + precoConsumidor);

        entrada.close();


    }
}
