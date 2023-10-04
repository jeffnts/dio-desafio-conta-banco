import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = scan.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String numeroAgencia = scan.next();

        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scan.next();

        System.out.println("Por favor, digite o saldo do Cliente!");
        Double saldoCliente = scan.nextDouble();

        ContaTerminal conta = new ContaTerminal(numeroConta, numeroAgencia, nomeCliente, saldoCliente);

        System.out.println(conta);

        scan.close();
    }
}
