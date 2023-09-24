import java.util.Scanner;

public class Atividade07 {
    public static void main (String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salario, novoSalario;

        System.out.print("Informe seu salário: ");
        salario = entrada.nextDouble();

        if(salario <= 0){
            System.out.println("Erro!");
        }else if (salario <= 500.0) {
            novoSalario = salario * 1.3;
            System.out.println(
                    "Seu novo salário será: " + novoSalario);
            System.out.println(
                    "Você teve aumento de " + salario * 0.3);
        } else {
            System.out.println("Não tem aumento!");
        }
        entrada.close();

    }
    
}       