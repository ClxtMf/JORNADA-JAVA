package WorkSpace.Operadores;
// Esses são os operadores que nos permitem realizar cálculos 
// matemáticos básicos.
// São eles:
// • + e - (adição e subtração)
// • * e / (multiplicação e divisão)
// • % (módulo ou resto de uma divisão)

public class OperadoresAritmeticos {

    public static void main (String[] args) {
        System.out.println("===========================");

        int adicao = 5 + 10;
        System.out.println("O resultado da soma é: " + adicao);

        int subtracao = 5 - 15;
        System.out.println("O resultado da subtração é: " + subtracao);

        int multiplicacao = 5 * 10;
        System.out.println("O resultado da multiplicação é: " + multiplicacao);

        double divisao = 5.0 / 2.0;
        System.out.println("O resultado da divisão é: " + divisao);

        double moduloOuResto = 5.0 % 2.0;
        System.out.println("O resultado é: " + moduloOuResto);

        System.out.println("Fim!");
        System.out.println("===========================");

        // Uma coisa que você pode fazer também é utilizar variáveis, ao invés de colocar
        // os números diretamente. Algo como:

        int umNumero = 5;
        int outroNumero = 2;
        int soma = umNumero + outroNumero;

    }
}