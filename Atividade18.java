import java.util.Scanner;

public class Atividade18 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua idade");
        int idade = entrada.nextInt();

        if (idade >= 18) {
            System.out.println("A pesssoa é maior de idade");
        } else {
            System.out.println("A pessoa não é maior de idade");
        }

        entrada.close();
    }
}
