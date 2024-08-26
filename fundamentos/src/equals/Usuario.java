package equals;

public class Usuario {
    String nome;
    String email;

    public boolean equals(Object obj) {
        if (obj instanceof Usuario) { // Verifica se o objeto colocado nele é uma instancia de usuario
            Usuario outro = (Usuario) obj; // Converte o objeto para usuario

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        } else {
            return false;
        }
    }
}
