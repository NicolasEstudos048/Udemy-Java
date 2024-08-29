package collections.pilha;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha { // O ultimo que entra é o primeiro que sai
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Príncipe");
        livros.push("A Divina Comedia");
        livros.push("O Senhor dos Anéis");

        System.out.println(livros.peek()); // Mostra "O Senhor dos Anéis" pq foi o ultimo adicionado
        System.out.println(livros.element());

        System.out.println(livros.pop()); // Remove da pilha
        System.out.println(livros.poll()); // Remove da pilha
        System.out.println(livros.poll());
        // System.out.println(livros.remove());

        System.out.println(livros.isEmpty());
    }
}
