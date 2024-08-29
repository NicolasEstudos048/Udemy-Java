package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    public static void main(String[] args) {
        /*
         * Mapa é uma coleção de chave-valor, não indexado
         * Mapa não aceita chaves duplicadas, mas pode ter valores duplicados
         * HashMap é uma implementação de map que mantém a ordem de inserção dos
         * elementos
         */
        Map<Integer, String> usuarios = new HashMap<>();

        // put adiciona elemento ou substitui
        usuarios.put(1, "Roberto");
        usuarios.put(2, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.get(3)); // Retorna valor da chave passada
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet()); // Retorna as chaves
        System.out.println(usuarios.values()); // Retorna os valores
        System.out.println(usuarios.entrySet()); // Retorna as chaves-valores

        System.out.println(usuarios.containsKey(3)); // Retorna boolean sobre a chave
        System.out.println(usuarios.containsValue("Rafaela")); // Retorna boolean sobre o valor

        // System.out.println(usuarios.remove(1)); ou
        System.out.println(usuarios.remove(1, "Roberto"));
        System.out.println(usuarios.remove("Rebeca"));

        for (Integer chave : usuarios.keySet()) { // Foreach para chaves
            System.out.println(chave);
        }

        for (String valor : usuarios.values()) { // Foreach para valores
            System.out.println(valor);
        }

        for (Entry<Integer, String> registro : usuarios.entrySet()) { // Foreach para chave-valor
            System.out.println(registro.getKey() + " " + registro.getValue());
        }
    }
}
