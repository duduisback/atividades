/*
Eduardo Rodrigues Lima de Oliveira
Desenvolvimento de aplicações
TCTG241CNTDEV
*/
import java.util.Scanner;

public class ManipulacaoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        String parOuImpar = (numero % 2 == 0) ? "par" : "ímpar";
        String positivoOuNegativo = (numero >= 0) ? "positivo" : "negativo";
        boolean primo = ehPrimo(numero);
        double raizQuadrada = Math.sqrt(numero);
        double elevadoAoCubo = Math.pow(numero, 3);

        System.out.println("O número é: " + parOuImpar);
        System.out.println("O número é: " + positivoOuNegativo);
        System.out.println("O número é primo: " + (primo ? "sim" : "não"));
        System.out.println("A raiz quadrada do número: " + raizQuadrada);
        System.out.println("O número elevado a 3 é: " + elevadoAoCubo);
    }

    public static boolean ehPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
