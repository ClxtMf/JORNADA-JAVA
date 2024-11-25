package WorkSpace;

import java.util.Scanner;

public class LendoDiferentesTiposDeDados {

    public static void main (String[] args) {

        System.out.println("============================");

        Scanner scanner = new Scanner(System.in);

        // ----------------------------------------------

        System.out.println("Digite um texto >>>>> ");
        String texto = scanner.nextLine();
        System.out.println(String.format("O texto escrito foi %s", texto));
        
        // ----------------------------------------------

        // Apesar do java trabalhar com o "." como
        // separador de decimais, o Scanner vai receber
        // um decimal no formato em seu computador estiver
        // configurado, ou seja, se você usa o
        // português brasileiro, então, para digitar,
        // terá que usa a vírgula como separador
        // de decimais. A própria funcionalidade Scanner vai
        // tranformar o número com vírgula em algo
        // que o java entenda, ou seja, umm número
        // que tem o "." como separador de decimais.

        System.out.println("Digite um decimal >>>>>>>> ");
        double numeroDecimal = scanner.nextDouble();
        System.out.println("O número digitado"
        + "foi" + numeroDecimal);

        // ----------------------------------------------

        System.out.println("Digite um número inteiro >>>>>>");
        int numeroInteiro = scanner.nextInt();
        System.out.println("O número inteiro digitado"
        + "foi" + numeroInteiro);

        // ----------------------------------------------

        System.out.println("Digite um boolean (True or False) >>>>>>>");
        boolean booleano = scanner.nextBoolean();
        System.out.println("O booleano foi digitado"
        + "foi" + booleano);

        // ----------------------------------------------

        scanner.close();
        System.out.println("Fim!");
        System.out.println("============================");
    }
}