/**public class UsaTeclado {

    
    Objetivos:
    - uso entrada pelo teclado e printf

*/

import java.util.Scanner;

public class UsaTeclado {

    public static void main(String args []) { 
        Scanner teclado = new Scanner(System.in);

        //pede para o usuario entrar com o nome, idade e salario da linha de comando
        System.out.println("Informe um nome (String) qualquer, depois pressione ENTER...");
        String nome = teclado.next();

        System.out.println("Agora informa a idade (int)...");
        int idade = teclado.nextInt();

        System.out.println("E pra encerrar informe o salario (double)...");
        double salario = teclado.nextDouble();

        System.out.println("-------------------------");
        //com printf é possivel imprimir dados com maior eficiencia
        System.out.printf("Nome informado: %s %n" ,nome); //%s string, %n quebra de linha
        System.out.printf("Idade informado: %d %n", idade); //%d int (decimal)
        System.out.printf("Salario informado: %.f %n" , salario); //%f double ou float
    }
}