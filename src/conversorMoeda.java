import java.util.Scanner;

public class conversorMoeda {
    public void main(){
        Scanner input = new Scanner(System.in);

        double reais, valorDolar, valorEuro;
        double taxaDolar = 4.99;
        double taxaEuro = 5.88;

        System.out.println("===== CONVERSOR DE MOEDAS =====");
        System.out.println("Digite valor em reais (R$)");
        reais = input.nextDouble();

        valorDolar = reais / taxaDolar;
        valorEuro = reais / taxaEuro;

        System.out.println("\n--- Resultados ---");
        System.out.printf("Valor em Dólar: $ %.2f%n", valorDolar);
        System.out.printf("Valor em Euro:  € %.2f%n", valorEuro);

        input.close();

    }
}
