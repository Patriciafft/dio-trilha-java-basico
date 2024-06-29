import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        System.out.println("Bem-vindo ao banco!");

        System.out.println("Digite o número da opção desejada: ");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Ver saldo");
        System.out.println("4 - Sair");

        System.out.println("________________________________________________________________________________________");

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    double valor = scanner.nextDouble();
                    saldo += valor;

                    System.out.println(String.format("Saldo atual: %.1f", saldo));
                    break;

                case 2:
                    System.out.println("Digite o valor a ser sacado: ");
                    double saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= saque;
                        System.out.println(String.format("Saldo atual: %.1f ", saldo));
                    }
                    break;

                case 3:
                    System.out.println(String.format("Saldo atual: %.1f ", saldo));
                    break;

                case 4:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
