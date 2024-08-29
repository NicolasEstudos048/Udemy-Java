package collections;

import java.util.HashSet;

import collections.list.Usuario;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Gui"));
        usuarios.add(new Usuario("Michel"));

        System.out.println(usuarios.contains(new Usuario("Michel")));
    }
}
