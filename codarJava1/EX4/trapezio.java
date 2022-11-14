import java.util.Scanner;

public class Main {
public static void main (String[] args) {
Scanner ler = new Scanner(System.in);
System.out.println("Digite o valor da base maior: ");
int maior = ler.nextInt();
System.out.println("Digite o valor da base menor: ");
int menor = ler.nextInt();
System.out.println("Digite o valor da altura: ");
int altura = ler.nextInt();
System.out.println("O valor da área do trapézio é: " + (maior+menor)*altura/2);
}
}