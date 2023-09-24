import java.util.Scanner;

public class Atividade21 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        int codProduto;
        System.out.print("Digite o código do produto: ");
        codProduto = entrada.nextInt();

        if (codProduto == 1) {
            System.out.println("O produto veio do Sul");
        } else if (codProduto == 2) {
            System.out.println("O produto veio da Norte");
        } else if (codProduto == 3) {
            System.out.println("O produto veio do Leste");
        } else if (codProduto == 4) {
            System.out.println("O produto veio do Oeste");
        } else if (codProduto == 5 || codProduto == 6) {
            System.out.println("O produto veio do Nordeste");
        } else if (codProduto == 7 || codProduto == 8 || codProduto == 9) {
            System.out.println("O produto veio do Sudeste");
        } else if (codProduto == 10 || codProduto <= 20)
        {
            System.out.println("O produto veio do Centro-oeste");
        } else if(codProduto ==21 || codProduto <= 30 )
        {
           System.out.println("O produto veio do Nordeste");
        } else {
           System.out.println("Código invalido!");

        }
      entrada.close();

    }
}
