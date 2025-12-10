/**
 * Programa Java demonstra como é possivel utilizar um procedimento
 * para computar números divisiveis em um determinado range de valores.
 * 
 * Em java "procedimento" é um bloco de código que processa instruções,
 * mas no fim não retorna resultado.
 * 
 * Java não tem suporte a procedimentos, na verdade criamos um método
 * com tipo de retorno 'void'.
 * 
 * Objetivos:
 * - uso de procedimento para computar instruções;
 * - uso do escopo de varíavel global (programa);
 * 
 */


public class NumeroDivisiveisProcedimento {
    
    //variavel global, acessível em todo arquivo (programa).

    static int contador;

    public static void main(String[] args) {
        System.out.println("Identificando divisiveis por 10 entre 100 e 1000");

        int valorMinimo = 10;
        int valorMaximo = 1000;
        int div = 10;

        //chama a procedure
        imprimeDivisiveis(valorMinimo, valorMaximo, div);
        System.out.println("\nQtos números são diviseis por " + div + ": " + contador);

        System.out.println("\nIdentificando divisiveis por 2 entre 1 e 10");

        //outra cahama, com argumentos diferentes
        imprimeDivisiveis(1, 10, 2);

        System.out.println("\nQuantos número são divisiveis por 2? " + contador);
    }
            /*
     * Bloco de código que centraliza as instruções que calculam possíveis divisores de um número.
     * Ao chamar esse procedimento, é necessário informar o número minimo e maximo que devem ser analisados,
     * além do divisor.
     * Exemplo imprimeDivisiveis(1, 10, 2) -> computa os divisiveis por 2 de 1 a 10. 
    */

    static void imprimeDivisiveis(int minimo, int maximo, int divisor) {
        //zera o contador sempre que o procedimento é chamado
        contador = 0;

        for (int n = minimo; n <= maximo; n++) {
            if (n % divisor == 0) {
        contador++;
          System.out.println("\nO número " + n + " é divisível por " + divisor);
            }
         
    }
    }
}
