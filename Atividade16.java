import java.util.Scanner;

public class Atividade16 {
    public static void main (String[] args) {

      Scanner entrada = new Scanner(System.in);

      System.out.print("Digite o preço atual do produto: R$ ");
      double preco = entrada.nextDouble();

      System.out.print("Digite o código do produto: ");
      int codigo = entrada.nextInt();

      double desconto = 0.0;

      if (preco <= 30.0) {
          desconto = 0.0;
      } else if (preco <= 100.0) {
          desconto = preco * 0.10; // 10% de desconto
      } else {
          desconto = preco * 0.15; // 15% de desconto
      }

      double novoPreco = preco - desconto;

      System.out.println("Código do produto: " + codigo);
      System.out.println("Preço atual: R$ " + preco);
      System.out.println("Desconto aplicado: R$ " + desconto);
      System.out.println("Novo preço: R$ " + novoPreco);

       entrada.close();

    }
}
