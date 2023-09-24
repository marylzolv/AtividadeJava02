import java.util.Scanner;

public class Atividade14 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário: R$ ");
        double salarioAtual = entrada.nextDouble();
        double percentualAumento;

        if (salarioAtual <= 300.0) {
            percentualAumento = 50.0;
        } else if (salarioAtual <= 500.0) {
            percentualAumento = 40.0;
        } else if (salarioAtual <= 700.0) {
            percentualAumento = 30.0;
        } else if (salarioAtual <= 800.0) {
            percentualAumento = 20.0;
        } else if (salarioAtual <= 1000.0) {
            percentualAumento = 10.0;
        } else {
            percentualAumento = 5.0;
        }

        double novoSalario = salarioAtual + (salarioAtual * percentualAumento / 100);
        System.out.println("O novo salário é: R$ " + novoSalario);

        entrada.close();
   
    }
}
