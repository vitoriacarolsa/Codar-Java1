import java.util.Scanner;

  public class Main {
  public static void main (String [] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Informe seu nome:");
    String nome = ler.nextLine();
    System.out.println("Informe sua idade:");
    int idade = ler.nextInt();
    System.out.println("Olá " + nome + ", sua idade é " + idade);
    ler.close();
  }
}