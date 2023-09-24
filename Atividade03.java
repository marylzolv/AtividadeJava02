import java.util.Scanner;

public class Atividade03 {
    public static void main (String[] args) {

        //Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        double num1, num2;

        //Entrada de dados
        System.out.println("Informe o primeiro numero: ");
        num1 = entrada.nextDouble();
        System.out.println("Informe o segundo numero: ");
        num2 = entrada.nextDouble();

        //Processamento de dados
        if (num1 > num2) {
            System.out.println(num2 + " menor que " + num1);
        } else if (num1 < num2){
            System.out.println(num1 + " menor que " + num2); 
        } else {
            System.out.println("São iguais!");
        }

        entrada.close();
        


    }
}
