import java.util.Scanner;

public class Atividade17 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        int senhaDigitada = entrada.nextInt();

        int senhaCorreta = 4531;

        if (senhaDigitada == senhaCorreta) {
            System.out.println("Permissão de acesso!");
        } else {
            System.out.println("Não permitido o acesso");
        }

        entrada.close();
    }
}
