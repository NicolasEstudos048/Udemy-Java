package collections.fila;

import java.util.Queue;
import java.util.LinkedList;

// Queue é uma interface que define os métodos para manipular uma fila

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> adicionam elementos na fila, a diferença é o comportamente
        // qndo a fila está cheia
        fila.add("Ana"); // .add() lançará uma exceção caso a fila esteja cheia.
        fila.offer("João"); // .offer() retorna false caso a fila esteja cheia.
        fila.offer("Daniel");
        fila.offer("Rafa");
        fila.offer("Judith");

        // Peek e Element -> Leem o elemento da fila, difere está quando cheia
        System.out.println(fila.peek()); // Se vazia, retorna false
        System.out.println(fila.element()); // Se vazia, retorna exception

        // Poll e Remove -> remove e retorna o elemento da fila, difere quando vazia
        System.out.println(fila.poll()); // Se fila vazia, retorna null
        System.out.println(fila.remove()); // Se fila vazia, retorna exception

        // fila.size();
        // fila.clear();
        // fila.isEmpty();
        // fila.contains();

        System.out.println(fila);
    }
}
