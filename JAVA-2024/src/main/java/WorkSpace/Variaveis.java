package WorkSpace;

public class Variaveis {

    public static void main(String[] args) {
        double euSouVariavel = 10.00;
        euSouVariavel = 25.00;
        System.out.println("Fim!");
    }
}

// Note também que para alterar o valor da variável eu não preciso repetir o tipo:

// double euSouVariavel = 10.00;
// euSouVariavel = 25.00;

// Caso o tipo fosse repetido, o Java iria entender como se você estivesse declarando
// duas variáveis com o mesmo nome, e isso é errado. Se o programa fosse assim:

// public static void main(String[] args) {
//     double euSouVariavel = 10.0;
//     double euSouVariavel = 25.0;
//     System.out.println("Fim");
// }
