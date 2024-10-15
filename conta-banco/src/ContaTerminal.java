import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        String nomeCliente;
        String agencia;
        int numeroConta;
        double saldo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo: ");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", 
        nomeCliente, agencia, numeroConta, saldo);
    }
}