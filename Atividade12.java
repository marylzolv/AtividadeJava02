import java.util.Scanner;

public class Atividade12 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário bruto do funcionário: R$ ");
        double salarioBruto = entrada.nextDouble();
        double gratificacao;

        if (salarioBruto <= 350.0) {
            gratificacao = 100.0;
        } else if (salarioBruto <= 600.0) {
            gratificacao = 75.0;
        } else if (salarioBruto <= 900.0) {
            gratificacao = 50.0;
        } else {
            gratificacao = 35.0;
        }

        double imposto = salarioBruto * 0.07;
        double valorAReceber = salarioBruto + gratificacao - imposto;

        System.out.println("O valor a receber é: R$ " + valorAReceber);

        entrada.close();


    }
}
