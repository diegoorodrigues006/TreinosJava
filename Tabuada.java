/** 
* Programa Java calcula a tabuada de um determinado número.
*Ojetivos:
* - exercício de lógica
* uso do comando for (repetição);
*
*/
    
import java.util.Scanner;

public class Tabuada {

public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);

System.out.print("Informe o número para calcular a tabuada: ");
int numero = teclado.nextInt();
calculaTabuada(numero);
}

/*
* Calcula da tabuado do número informado como argumento.
*/
static void calculaTabuada(int n) {
    if (n<=0) {
        System.out.println("Informe um número válido para calcular a tabuada!");
        return;
    }

    System.out.println("Calculando tabuadas do " + n + "...");

    for (int multiplicador = 1; multiplicador <= 10; multilplicador++) {
        int resultado = multiplicador * n;
        System.out.println(n+" x "+multiplicador+" = " +resultado);
     }
    
    }
    }
