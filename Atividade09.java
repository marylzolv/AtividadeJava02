
import java.util.Scanner;

public class Atividade09 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        double saldoMedio, credito;

        System.out.print("Informe seu saldo médio: ");
        saldoMedio = entrada.nextDouble();

        if (saldoMedio > 400) {
            credito = saldoMedio * 0.30;
        } else if ((saldoMedio <= 400) && (saldoMedio > 300)) {
            credito = saldoMedio * 0.25;
        } else if ((saldoMedio <= 300) && (saldoMedio > 200)) {
            credito = saldoMedio * 0.20;
        } else {
            credito = saldoMedio * 0.10;
        }

        System.out.println("Saldo médio: R$ " + saldoMedio);
        System.out.println("Crédito: R$ " + credito);

        entrada.close();

    }
}
