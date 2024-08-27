package collections.set;

import java.util.HashSet;
import java.util.Set;

// HashSet não mantém a ordem dos elementos, ele não aceita valores duplicados e não é indexavel
public class ConjuntoBaguncado {
    @SuppressWarnings({ "rawtypes", "unchecked" }) // Silencia as advertências
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        // Uma Collection não suporta tipos primitivos, então ela converte tudo para não
        // primitivo
        conjunto.add(1); // double -> Double
        conjunto.add("Teste");
        conjunto.add(10); // int -> Integer
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("X");

        conjunto.add("Teste"); // Não adiociona repetidos

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));

        System.out.println(conjunto.contains(10)); // Verifica se contém e retorna boolean

        System.out.println(conjunto);
        System.out.println("Tamanho é: " + conjunto.size());

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);

        // conjunto.addAll(nums); // Add tudo de um pra outro
        conjunto.retainAll(nums); // Remove tudo que não está em nums
        System.out.println(conjunto);

        conjunto.clear(); // Remove tudo
        System.out.println(conjunto);
    }
}
