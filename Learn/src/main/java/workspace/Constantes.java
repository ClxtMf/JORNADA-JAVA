package WorkSpace;

public class Constantes {

    public static final double LARGURA = 10.0;

        public static void main(String[] args) {

            double compr = 25.0;
            double res = calculaArea(LARGURA, compr);
            System.out.println("A área é: " + res);
        }
        
        private static double calculaArea(double largura, double comprimento) {
            return largura * comprimento;
        }
    }