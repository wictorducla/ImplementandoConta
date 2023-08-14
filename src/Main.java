import java.util.Scanner;

public class Main {
    public static Scanner ler = new Scanner(System.in);
    public static String nome = "Wictor Ducla";
    public static String tipoConta = "Corrente";
    public static double saldo = 2500.00;
    public static void main(String[] args) {

        int opcao = 0;

        System.out.println("***********************");
        System.out.println("\nNome do cliente:" + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo atual:" + saldo);
        System.out.println("\n***********************");

        String menu = """
                Operações
                                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                                
                Digite a opção desejada:
                """;


        while (opcao != 4){

            System.out.println(menu);
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O saldo atual é: " + saldo);
                    break;
                case 2:
                    receberPix();
                    break;
                case 3:
                    enviarPix();
                    break;
                case 4:
                    break;

                default:
                    System.out.println(" Opção inválida");
                    break;
            }

        }


    }

    public static void receberPix() {
        System.out.println("Informe o valor a receber: ");
        double valorRecebido = ler.nextDouble();
        saldo += valorRecebido;
        System.out.println("Saldo atualizado: " + saldo);
    }

    public static void enviarPix () {
        System.out.println("Informe o valor que deseja transferir:");
        double valorEnviado = ler.nextDouble();
        if (valorEnviado > saldo) {
            System.out.println("Não há saldo suficiente para realizar transferencia");
        }else {
            saldo -= valorEnviado;
            System.out.println("Saldo atualizado: " + saldo);
        }
    }
}