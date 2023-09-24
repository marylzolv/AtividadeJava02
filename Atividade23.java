import java.util.Scanner;

public class Atividade23 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o código do produto (1 a 40): ");
        int codigoProduto = entrada.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        int quantidadeComprada = entrada.nextInt();

        double precoUnitario = 0.0;
        double precoTotal = 0.0;

        if (codigoProduto >= 1 && codigoProduto <= 10) {
            precoUnitario = 10.00;
        } else if (codigoProduto >= 11 && codigoProduto <= 20) {
            precoUnitario = 15.00;
        } else if (codigoProduto >= 21 && codigoProduto <= 30) {
            precoUnitario = 20.00;
        } else if (codigoProduto >= 31 && codigoProduto <= 40) {
            precoUnitario = 30.00;
        } else {
            System.out.println("Código de produto inválido.");
             entrada.close();
            return;
        }

        precoTotal = precoUnitario * quantidadeComprada;

        double desconto = 0.0;
        if (precoTotal <= 250.00) {
            desconto = precoTotal * 0.05; // 5% de desconto
        } else if (precoTotal > 250.00 && precoTotal <= 500.00) {
            desconto = precoTotal * 0.10; // 10% de desconto
        } else {
            desconto = precoTotal * 0.15; // 15% de desconto
        }

        double precoFinal = precoTotal - desconto;

        System.out.println("Preço unitário do produto: R$ " + precoUnitario);
        System.out.println("Preço total da nota: R$ " + precoTotal);
        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Preço final da nota após o desconto: R$ " + precoFinal);

        entrada.close();
   
    }
}
