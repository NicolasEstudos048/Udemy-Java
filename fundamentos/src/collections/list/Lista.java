package collections.list;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Jose"));
        lista.add(new Usuario("Romeu"));
        lista.add(new Usuario("Maria"));

        System.out.println(lista.get(3)); // Acessa pelo indice

        lista.remove(1); // Remove pelo indice
        lista.remove(new Usuario("Romeu")); // Remove pelo Usuario

        lista.set(1, new Usuario("Felipe")); // Set novo usuario passando indice e o User

        System.out.println(lista.contains("Carlos"));

        for (Usuario usuario : lista) {
            System.out.println(usuario);
        }
    }
}
