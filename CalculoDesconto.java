/*
Eduardo Rodrigues Lima de Oliveira
Desenvolvimento de aplicações
TCTG241CNTDEV
*/
import java.util.Scanner;

public class CalculoDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor cheio da compra: ");
        double valorCheio = scanner.nextDouble();

        System.out.print("Informe o valor do desconto: ");
        double valorDesconto = scanner.nextDouble();

        double novoValor = valorCheio - valorDesconto;

        System.out.println("O valor cheio é: " + valorCheio);
        System.out.println("O valor do desconto é: " + valorDesconto);
        System.out.println("O novo valor é: " + novoValor);
    }
}
