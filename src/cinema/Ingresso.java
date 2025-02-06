package cinema;

public class Ingresso {
    protected String nomeFilme;
    protected double valor;
    protected String dubladoLegendado;

    public Ingresso(String nomeFilme, String dubladoLegendado) {
        this.nomeFilme = nomeFilme;
        this.valor = 30.0;
        this.dubladoLegendado = dubladoLegendado;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public double getValor() {
        return valor;
    }

    public String getDubladoLegendado() {
        return dubladoLegendado;
    }

}