import java.util.Scanner;

public class Atividade13 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o preço do produto: R$ ");
        double preco = entrada.nextDouble();
        double percentualAumento;

        if (preco <= 50.0) {
            percentualAumento = 5.0;
        } else if (preco <= 100.0) {
            percentualAumento = 10.0;
        } else {
            percentualAumento = 15.0;
        }

        double novoPreco = preco + (preco * percentualAumento / 100);
        String classificacao;

        if (novoPreco <= 80.0) {
            classificacao = "Barato";
        } else if (novoPreco <= 120.0) {
            classificacao = "Normal";
        } else if (novoPreco <= 200.0) {
            classificacao = "Caro";
        } else {
            classificacao = "Muito caro";
        }

        System.out.println("Novo preço: R$ " + novoPreco);
        System.out.println("Classificação: " + classificacao);

        entrada.close();
   

    }
}
