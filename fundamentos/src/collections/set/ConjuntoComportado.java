package collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        // Qndo coloco <> especifico que a listaAprovados será obrigatóriamente do tipo
        // passado
        // Set<String> listaAprovados = new HashSet<>();

        // Com o TreeSet é possível amnter a ordem de inserção, ele especificamente faz
        // parte do SortedSet (conjuntos)
        SortedSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Ana");
        listaAprovados.add("João");
        listaAprovados.add("Maria");
        listaAprovados.add("Pedro");

        for (String lista : listaAprovados) {
            System.out.println(lista);
        }

        Set<Integer> nums = new HashSet<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(10); // Não adiciona porque já existe

        for (Integer num : nums) {
            System.out.println(num);
        }
    }
}
