import java.util.Scanner;

public class Main {
public static void main (String[] args) {
Scanner ler = new Scanner(System.in);
System.out.println("Digite o valor da base: ");
int base = ler.nextInt();
System.out.println("Digite o valor da altura: ");
int altura = ler.nextInt();
System.out.println ("Area: " + (base*altura/2));
}
}