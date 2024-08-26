package equals;

import java.util.Date;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Nicolas";
        u1.email = "nicolas@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Nicolas";
        u2.email = "nicolas@gmail.com";

        System.out.println(u1 == u2); // false pq aponta para endereço de memoria diferente
        System.out.println(u1.equals(u2)); // true pq compara os valores dos atributos
        System.out.println(u2.equals(u1));
        System.out.println(u2.equals(new Date()));
    }
}
