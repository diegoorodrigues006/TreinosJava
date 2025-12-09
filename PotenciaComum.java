/**
 * Programa Java calcula a potência a partir de um numero base e expoente.
 * O calculo de potência desse programa só se aplica a numeros positivos.
 * 
 * O nome PotenciaComum, diferencia do outro programa Potencia.java.
 * Esse algoritmo, diferentemente do outro, não utiliza recursividade.
 * 
 */
import java.util.Scanner;

public class PotenciaComum {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a base: ");
        int base = teclado.nextInt();

        System.out.print("Informe o expoente: ");
        int expoente = teclado.nextInt();

        if (base < 0) {
            System.out.println("A base deve ser um número positivo.");
            return;
        }
        int resultado;

        if(expoente == 0) {
            resultado = 1;
        } else {
            resultado = base;
        }

        //resolve a potencia com repetição
        for (int x = 1; x < expoente; x++) {
            resultado *= base;
        }
        System.out.println("\nResultado de " +base+" ^ "+expoente+" = " +resultado);
    }
}

