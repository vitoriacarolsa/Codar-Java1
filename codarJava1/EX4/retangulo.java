import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe a base: ");
    int base = ler.nextInt();
    System.out.println("Informe a altura: ");
    int altura = ler.nextInt();
    System.out.println("Area: " + (base*altura));
    }
}