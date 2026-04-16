import java.util.Scanner;

void main(){
    Scanner leitor= new Scanner(System.in);
    System.out.println("Informe um numero: ");
    int numeroDesejado = leitor.nextInt();
    int fatorial=1;

    for (int i=1; i<=numeroDesejado; i++){
        fatorial*=i;
    }

    System.out.println("O fatorial de " + numeroDesejado + " é: " + fatorial);
}