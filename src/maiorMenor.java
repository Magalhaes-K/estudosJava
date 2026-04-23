import java.util.Scanner;

public class maiorMenor {
    public static void main(String[] args) {
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        boolean hasNumber = false;
        int number;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero(numero 0 para encerrar): ");

        while ((number=input.nextInt()) != 0) {
            if (!hasNumber) {
                maxValue = number;
                minValue = number;
                hasNumber = true;
            } else {
                if (maxValue < number) {
                    maxValue = number;
                }
                if (minValue > number) {
                    minValue = number;
                }
            }
        }

        if (hasNumber) {
            System.out.println("\nResultado: ");
            System.out.println("Maior valor: "+ maxValue);
            System.out.println("Menor valor: "+minValue);
        } else {
            System.out.println("Nenhum numero digitado");
        }

        input.close();

    }
}
