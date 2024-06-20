import java.util.Scanner;

public class ContaBanco {
    // Atributos
    int numero;
    String agencia, nomeCliente;
    float saldo;

    // Construtor
    public ContaBanco(int numero, String agencia, String nomeCliente, float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    // Método para inserir via terminal com a classe Scanner
    public void inserir() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        this.numero = scanner.nextInt();
        System.out.println("Digite a agência: ");
        this.agencia = scanner.next();
        System.out.println("Digite o nome do cliente: ");
        this.nomeCliente = scanner.next();
        System.out.println("Digite o saldo: ");
        this.saldo = scanner.nextFloat();

        scanner.close();

    }

    /*
     * Método para escrever: Olá [Nome Cliente], obrigado por criar uma conta em
     * nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já
     * está disponível para saque.
     */
    public void escrever() {
        System.out.println("Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + this.agencia + ", conta " + this.numero + " e seu saldo " + this.saldo
                + " já está disponível para saque.");
    }

    public static void main(String[] args) throws Exception {
        // Criação de um objeto da classe ContaTerminal
        ContaBanco conta = new ContaBanco(0, "", "", 0);

        // Chamada dos métodos
        conta.inserir();
        conta.escrever();
    }

}