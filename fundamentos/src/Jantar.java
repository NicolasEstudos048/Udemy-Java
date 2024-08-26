public class Jantar {
    public static void main(String[] args) {
        Comida comida = new Comida("Arroz", 0.3);

        Pessoa pessoa = new Pessoa("Nicolas", 80.0);

        System.out.println(pessoa.toString());

        System.out.println(comida.toString());

        pessoa.comer(comida);
        System.out.println(pessoa.getPeso());

        pessoa.comer(comida);
        System.out.println(pessoa.getPeso());
    }
}
