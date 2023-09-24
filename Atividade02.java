import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {

        //Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        //Entrada de dados
        System.out.println("Informe a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Informe a segunda nota: ");
        nota2 = entrada.nextDouble();

        //Processamento de dados
        media = (nota1 + nota2) /2;

        //Saída de dados
        if ((media >= 0) && (media < 3)) {
        System.out.println("Reprovado: " + media);
        } else if ((media >= 3) && (media < 7)){
            System.out.println("Exame: " + media);
        } else if ((media >= 7) && (media <= 10)){
            System.out.println("Aprovado!" + media);
        }else {
            System.out.println("Média Inválida!");
        }

        entrada.close();
        



    }     
}
