package WorkSpace;

public class Variaveis1 {

    public static void main(String[] args) {
        System.out.println("==============");

        double precoProduto = 115.00;

        System.out.println("O preço do produto é "
        + precoProduto + " reais.");

        double percentualDesconto = 5.0;

        // Regra de três para descobrir o valor com desconto.
        double desconto = precoProduto * percentualDesconto / 100;

        // Preço do produto menos o desconto para
        // sabermos o valor do produto com o 
        // desconto que foi calculado na linha anterior.

        double precoComDesconto = precoProduto - desconto;

        System.out.println("Com desconto, o produto sai "
        + "por R$" + precoComDesconto + ".");

        System.out.println("Fim!");
        System.out.println("==============");
    }
}



// public class Variaveis1 {

//     public static void main(String[] args) {
//         System.out.println("================");

//         // Altere o valor da variável abaixo
//         // Para realizar testes.
//         double precoProduto = 115.00;
//         System.out.println("O preço do produto é"
//         + precoProduto + " reais.");


//         double percentualDesconto = 5.0;
//     }
// }