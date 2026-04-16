import java.util.Scanner;
import java.util.Random;

public class numeroSecreto {
    public static void main() {
        int tentativa=0, numeroGerado=new Random().nextInt(100), numeroDigitado;
        Scanner leitor = new Scanner(System.in);

        System.out.println(numeroGerado);
        System.out.println("TENTE ACERTAR O NUMERO EM 5 TENTATIVAS");

        while(tentativa<5){
            System.out.println("Digite um numero de 0 a 100: ");
            tentativa++;
            numeroDigitado=leitor.nextInt();
            if (numeroDigitado==numeroGerado){
                System.out.println("Parabens voce acertou!!");
                System.out.println("Em "+tentativa+" tentativas");
                break;
            } else if (numeroGerado>numeroDigitado){
                System.out.println(String.format("Numero é maior que %d", numeroDigitado));
            } else if(numeroGerado<numeroDigitado){
                System.out.println(String.format("Numero é menor que %d", numeroDigitado));
            }

            if (tentativa==5 && numeroGerado!=numeroDigitado){
                System.out.println(String.format("Voce perdeu!\nO numero era %d", numeroGerado));
            }
        }
    }
}