/*
Eduardo Rodrigues Lima de Oliveira
Desenvolvimento de aplicações
TCTG241CNTDEV
*/
import java.util.Scanner;

public class PalavraManipulacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        int n = palavra.length();
        char primeiraLetra = palavra.charAt(0);
        char ultimaLetra = palavra.charAt(n - 1);
        char letraCentral = palavra.charAt(n / 2);
        String palavraReversa = new StringBuilder(palavra).reverse().toString();
        String palavraMaiuscula = palavra.toUpperCase();
        String palavraMinuscula = palavra.toLowerCase();

        System.out.println("A palavra digitada foi: " + palavra);
        System.out.println("A palavra tem " + n + " dígitos");
        System.out.println("A primeira letra: " + primeiraLetra);
        System.out.println("A letra central da palavra é: " + letraCentral);
        System.out.println("A última letra é: " + ultimaLetra);
        System.out.println("A palavra escrita ao contrário é: " + palavraReversa);
        System.out.println("A palavra toda em maiúsculo: " + palavraMaiuscula);
        System.out.println("A palavra toda em minúsculo: " + palavraMinuscula);
    }
}
