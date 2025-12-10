
/**
 * Programa Java utiliza a entrada via teclado para criar e preencher um array de inteiros.
 * Depois de preencher o array, o programa coloca os números contidos no array em ordem numérica natural
 * 
 * Na computaçãoi existem va´rios algoritmos para ordenação dos dados. As diferenças são basicamente:
 * a complexidade, consumo de memória e tempo de processamento.
 * 
 * Nesse programa utilizamos o algoritmo Bubble Sort. Um algoritmo relativamente simples,
 * com a performance satisfátoria quando o array não tem capacidade muito grande.
 * 
 * Objetivos:
 * - uso de procedimentos para organizar o codigo;
 * - uso de algoritmos para resolver o problema de ordenação de dados;
 * - demonstrar como implementar o algoritmo Bubble Sort em Java;
 */

import java.util.Scanner;

public class OrdenaVetorBubbleSort {
    
    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);

        System.out.println("Indique o tamanho do array: ");
        int tamanhoArray = teclado.nextInt();
        int vetor[] = new int[tamanhoArray];

        preenche(vetor);

        System.out.println("\nConteudo do array antes de ordernar...");
        imprime(vetor);

        //coloca os valores do array em ordem númerica (ascende)
        ordena(vetor);

        System.out.println("\nConteudo do array depois de ordernar...");
        imprime(vetor);
    }
        /*
        * Procedimento responsável preencher o array a partir dos dados coletados via teclado.
        */

    static void preenche(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe o número"+ (i+1) + ": ");
            numeros[i] = teclado.nextInt();
        }
    }
    /*
    * Procedimento responsável por imprimir os dados contidos no array.
    */

    static void imprime(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }

    /**
     * Procedimento responsável por ordenar o array, utilizando o algoritmo Bubble Sort.
     * No fim do procedimento os números contidos no array estaão em oderm numérica.
     */

    static void ordena(int[] numeros) {
        boolean houveTroca = true;
        int aux;

        while (houveTroca) {
            houveTroca = false;
            for (int i = 0; i < numeros.length - 1; i++) {
                //compra o elemento atual (i) c/ o proximo (i+1)
                if (numeros[i] > numeros[i + 1]) {
                    //faz a troca
                    aux = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = aux;


                    // indica que o array deve ser analisado novamente (while)
                    houveTroca = true;

            }
        }
    }

}
    }