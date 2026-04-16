import java.util.Scanner;

public class projetoBancario {
    public static void main() {
        Scanner leitor = new Scanner(System.in);
        String nome = "João Antonio", tipoConta = "Corrente", mensagem = """
                Escolha uma operação:
                
                1 - Consultar saldo
                2 - Receber um valor
                3 - Transerir um valor
                4 - Sair
                
                """;
        double saldo = 2150, valorNovo=0;

        System.out.println("*************************");
        System.out.println("\nDados inicias: \n");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("\n*************************\n");

        while (true) {
            System.out.println(mensagem);
            int escolha = leitor.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("Saldo atual: R$" + saldo);
                    break;
                case 2:
                    System.out.println("Qual valor a ser recebido: ");
                    valorNovo = leitor.nextDouble();
                    saldo += valorNovo;
                    System.out.println("Saldo atual: R$" + saldo);
                    break;
                case 3:
                    System.out.println("Qual valor a ser transferido: ");
                    valorNovo = leitor.nextDouble();
                    if (saldo>valorNovo){
                        saldo -= valorNovo;
                        System.out.println("Saldo atual: R$" + saldo);
                    } else {
                        System.out.println("Valor insuficiente para transferencia");
                    }
                    break;
                case 4:
                    System.out.println("Saindo......");
                    break;
                default:
                    System.out.println("Valor invalido\nTente novamente!");
                    break;
            }

            if (escolha==4){
                break;
            }
        }
    }
}
