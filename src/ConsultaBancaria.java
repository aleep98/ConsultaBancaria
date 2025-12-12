import java.util.Scanner;

public class ConsultaBancaria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome:");
        String nome = leitura.nextLine();
        String banco = "Banco Exemplo";
        String tipoConta = "Corrente";
        double saldo = 1500.00;
        int opcao = 0;

        System.out.println("**********************************");
        System.out.println("Bem-vindo ao " + banco);
        System.out.println("Olá, " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("**********************************");

        while (opcao != 4) {

            String menu = """
                    Menu:
                    1 - Ver saldo
                    2 - Fazer Transferência
                    3 - Depositar
                    4 - Sair
                    """;

            System.out.println(menu);
            System.out.print("Digite a opção desejada: ");
            
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é de: R$ " + saldo);
            }else if (opcao == 2) {
                System.out.println("Valor da transferência: R$ ");
                double valorTransferencia = leitura.nextDouble();
                if (valorTransferencia > saldo) {
                    System.out.println("Saldo insuficiente para transferência.");
                } else {
                    saldo -= valorTransferencia;
                    System.out.println("Transferência de R$ " + valorTransferencia + " realizada com sucesso.");
                    System.out.println("Novo saldo: R$ " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor do depósito: R$ ");
                    double valorDeposito = leitura.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Depósito de R$ " + valorDeposito + " realizado com sucesso.");
            } else if (opcao == 4) {
                    System.out.println("Saindo...");
            } else if (opcao != 4) {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        leitura.close();
    }  
}
    
