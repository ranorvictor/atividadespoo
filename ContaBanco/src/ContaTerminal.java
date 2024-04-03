import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por Favor, digite sua agência:");
        int agencia = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por Favor, digite sua conta:");
        String conta = scanner.nextLine();

        System.out.println("Por Favor, digite seu nome:");
        String name = scanner.nextLine();

        System.out.println("Por fim, digite seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + name + ", obrigado por criar uma conta em nosso banco! :), sua agência é: " + agencia + ", conta: " + conta + ", e seu saldo de: " + saldo + " já está disponível para saque!");
    }
}