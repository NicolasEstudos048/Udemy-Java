public class Pessoa {
    private String nome;
    private Double peso;

    public Pessoa(String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(Comida comida) {
        if (comida != null) {
            this.setPeso(this.getPeso() + comida.getPesoComida());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", peso=" + peso + "]";
    }
}
