/*
Eduardo Rodrigues Lima de Oliveira
Desenvolvimento de aplicações
TCTG241CNTDEV
*/
import java.util.Scanner;

public class NotasTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double maiorNota = notas[0];
        double menorNota = notas[0];
        double soma = 0;

        for (double nota : notas) {
            if (nota > maiorNota) maiorNota = nota;
            if (nota < menorNota) menorNota = nota;
            soma += nota;
        }

        double media = soma / 5;

        System.out.println("A maior nota é: " + maiorNota);
        System.out.println("A menor nota é: " + menorNota);
        System.out.println("A média da turma é: " + media);
    }
}
