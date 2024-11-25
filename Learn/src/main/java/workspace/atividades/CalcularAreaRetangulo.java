package WorkSpace.Atividades;
import java.util.Scanner;

public class CalcularAreaRetangulo {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        double base, altura, area;

        System.out.println("Digite a base do retângulo: ");
        base = scanner.nextDouble(); 
        
        System.out.println("Digite a altura do retângulo: ");
        altura = scanner.nextDouble();

        area = base * altura;

        System.out.println("A área do retângulo é: " + area);

        scanner.close();
    }
}