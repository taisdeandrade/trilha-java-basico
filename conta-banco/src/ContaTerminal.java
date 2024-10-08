import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        String nome, sobrenome, nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Boas vindas. Insira os dados solicitados abaixo para cadastro.");

        System.out.println("Digite seu nome: ");
        nome = scanner.next();
        System.out.println("Digite seu sobrenome: ");
        sobrenome = scanner.next();
        System.out.println("digite a agencia (exemplo: 010-0): ");
        agencia = scanner.next();
        System.out.println("Digite o numero da conta (exemplo 0101): ");
        numero = scanner.nextInt();
        System.out.println("Digite seu saldo: ");
        saldo = scanner.nextDouble();

        nomeCliente = nome + " " + sobrenome;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + "," + " conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
