import java.util.Scanner;

public class Atividade11 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salário atual do funcionário: ");
        double salarioAtual = entrada.nextDouble();

        double Aumento;
        double novoSalario;

        if (salarioAtual <= 300.0) {
            Aumento = salarioAtual * 0.15;
        } else if (salarioAtual <= 600.0) {
            Aumento = salarioAtual * 0.10;
        } else if (salarioAtual <= 900.0) {
            Aumento = salarioAtual * 0.05;
        } else {
            Aumento = 0.0;
        }

        novoSalario = salarioAtual + Aumento;

        System.out.println("Valor do aumento: " + Aumento);
        System.out.println("Novo salario: " + novoSalario);

        entrada.close();
    }
}
