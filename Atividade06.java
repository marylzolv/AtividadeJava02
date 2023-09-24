import java.util.Scanner;

public class Atividade06 {
    public static void main (String[] agrs) {

        Scanner entrada = new Scanner(System.in);
        
        double num1 = 0, num2 = 0, res = 0, res1 = 0;
        int op;

        System.out.print("Informe um número: ");
        num1 = entrada.nextDouble();
        System.out.print("Informe um número: ");
        num2 = entrada.nextDouble();

        System.out.println("1 - O primeiro número elevado ao segundo" +
        " número: ");
        System.out.println("2 - Raiz quadrada de cada um dos números:");
        System.out.println("3 - Raiz cúbica de cada um dos números:");

        System.out.print("Informe operação: ");
        op = entrada.nextInt();

        switch (op) {
            case 1:
                res = Math.pow(num1, num2);
                break;
            case 2:
                res = Math.sqrt(num1);
                res1 = Math.sqrt(num2);
                break;
            case 3:
                res = Math.cbrt(num1);
                res1 = Math.cbrt(num2);
                break;
            default:            
                System.out.println("Erro!");
                break;
        }  
        if (op == 1) {
             System.out.println(
                    "O resultado da operação escolhida é: " + res);
        }else if ((op == 2) || (op == 3)){
             System.out.println(
                    "O resultado da operação escolhida é: " + res1);
             System.out.println(
                    "O resultado da operação escolhida é: " + res);                
        }         
        entrada.close();
    }
}
