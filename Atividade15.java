import java.util.Scanner;

public class Atividade15 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o tipo de investimento (1 para Poupança, 2 para Fundos de renda fixa): ");
        int tipoInvestimento = entrada.nextInt();

        System.out.print("Digite o valor do investimento: R$ ");
        double valorInvestimento = entrada.nextDouble();
        double taxaRendimentoMensal;

        if (tipoInvestimento == 1) {
            taxaRendimentoMensal = 0.03; 
        } else if (tipoInvestimento == 2) {
            taxaRendimentoMensal = 0.04; 
        } else {
            System.out.println("Tipo de investimento inválido.");
            entrada.close();
            return; 
        }

        double valorCorrigido = valorInvestimento + (valorInvestimento * taxaRendimentoMensal);
        System.out.println("O valor corrigido após um mês de investimento é: R$ " + valorCorrigido);

        entrada.close();
    
    }
}
