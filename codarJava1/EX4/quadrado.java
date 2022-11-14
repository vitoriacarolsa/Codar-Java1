import java.util.Scanner;

public class Main {
public static void main (String[] args) {
Scanner ler = new Scanner(System.in);
System.out.println("Informe o valor do primeiro lado: ");
int primeiro = ler.nextInt();
System.out.println("Informe o valor do segundo lado: ");
int segundo = ler.nextInt();
System.out.println("O resultado da área é: " + (primeiro*segundo) );
}
}