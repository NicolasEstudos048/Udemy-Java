public class Comida {
    private String nomeComida;
    private Double pesoComida;

    public Comida(String nomeComida, Double pesoComida) {
        this.nomeComida = nomeComida;
        this.pesoComida = pesoComida;
    }

    public String getNomeComida() {
        return nomeComida;
    }

    public void setNomeComida(String nomeComida) {
        this.nomeComida = nomeComida;
    }

    public Double getPesoComida() {
        return pesoComida;
    }

    public void setPesoComida(Double pesoComida) {
        this.pesoComida = pesoComida;
    }

    @Override
    public String toString() {
        return "Comida [nomeComida=" + nomeComida + ", pesoComida=" + pesoComida + "]";
    }
}
