package WorkSpace;

import java.util.Scanner;

public class EntradaDados {

    public static void main(String[] args) {
        System.out.println("==============");


        // A primeira linha está declarando uma
        // variável chamada scanner
        Scanner scanner = new Scanner(System.in);

        // Espera que o usuário informe um valor e aperte a tecla ENTER
        System.out.println("Digite uma distância: ");
        double distanciaPercorrida = scanner.nextDouble();

        System.out.println("A distância digitada foi "
        + distanciaPercorrida + "Km.");


        // Essa funcionalidade precisa ser encerrada
        // explicitamente e isso é feito dessa forma
        scanner.close();

        System.out.println("Fim!");
        System.out.println("==============");
    }
}