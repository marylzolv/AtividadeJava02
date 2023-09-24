import java.util.Scanner;

public class Atividade01{
public static void main (String[] args) {
    Scanner entrada = new Scanner(System.in);
    double nota1, nota2, nota3, nota4, media;
    System.out.println("Informe a primeira nota: ");
    nota1 = Double.parseDouble(entrada.nextLine());
    System.out.println("Informe a segunda nota: ");
    nota2 = Double.parseDouble(entrada.nextLine());
    System.out.println("Informe a terceira nota: ");
    nota3 = Double.parseDouble(entrada.nextLine());
    System.out.println("Informe a quarta nota: ");
    nota4 = Double.parseDouble(entrada.nextLine());
    media = (nota1 + nota2 + nota3 + nota4) /4;
    if (media >=7){
        System.out.println("Aprovado" + media);
    }
    if (media <=7){
        System.out.println("Reprovado" + media);
    }

    entrada.close();




}
}