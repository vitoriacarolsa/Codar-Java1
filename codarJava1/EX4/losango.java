import java.util.Scanner;

public class Main {
public static void main (String[] args) {
Scanner ler = new Scanner(System.in);
System.out.println("Digite o valor do diagonal maior: ");
int diagonalmaior = ler.nextInt();
System.out.println("Digite o valor do diagonal menor: ");
int diagonalmenor = ler.nextInt();
System.out.println("O valor da área é: " + (diagonalmaior*diagonalmenor/2) );
}
}