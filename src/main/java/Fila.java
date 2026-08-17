import java.util.Queue;
import java.util.ArrayDeque;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new ArrayDeque<>();

        fila.add("Ana");
        fila.add("Bruno");
        fila.add("Carlos");

        System.out.println(fila.isEmpty()); // false
    }
}