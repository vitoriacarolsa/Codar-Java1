import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do raio do circulo: ");
        double raio = ler.nextDouble();
        System.out.println("O valor da área do circulo é: " + 3.14*(raio*2));
        ler.close();
    }
}