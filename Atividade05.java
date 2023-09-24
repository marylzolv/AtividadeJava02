import java.util.Scanner;

public class Atividade05 {
    public static void main (String[] args){

        //Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        
        double n1, n2, res;
        int op;

        // Entrada de dados
        System.out.println("Informe um número: ");
        n1 = entrada.nextDouble();
        System.out.println("Informe um número: ");
        n2 = entrada.nextDouble();
        System.out.println(
                "1 - Média entre os números digitados " +
                        "\n2 - Diferença do maior pelo menor " +
                        "\n3 - Produto entre os números digitados " +
                        "\n4 - Divisão do primeiro pelo segundo" +
                        "\nEscolha uma opção: ");
        op = entrada.nextInt();

        // Processamento de dados
        switch (op) {
            case 1:
                res = (n1 + n2) / 2;
                break;
            case 2:
                if (n1 > n2) {
                    res = n1 - n2;
                } else {
                    res = n2 - n1;
                }
                break;
            case 3:
                res = n1 * n2;
                break;
            case 4:
                res = n1 / n2;
                break;

            default:
                res = 0;
                break;
        }

        if (res != 0) {
            System.out.println(
                    "O resultado da operação escolhida é: " + res);
        } else {
            System.out.println("Operação inválida!");
        }
        entrada.close();

    }
}
