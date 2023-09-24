import java.util.Scanner;

public class Atividade25 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de horas extras trabalhadas: ");
        int horasExtras = entrada.nextInt();

        System.out.print("Digite o número de horas que o funcionário faltou ao trabalho: ");
        int horasFalta = entrada.nextInt();

        int minutos = (horasExtras - (2 * horasFalta / 3)) * 60; // Convertendo horas para minutos

        double premio = 0.0;

        if (minutos >= 2400) {
            premio = 500.00;
        } else if (minutos >= 1800) {
            premio = 400.00;
        } else if (minutos >= 1200) {
            premio = 300.00;
        } else if (minutos >= 600) {
            premio = 200.00;
        } else {
            premio = 100.00;
        }

        System.out.println("Valor da gratificação de Natal: R$ " + premio);

        entrada.close();
    
    }
}
