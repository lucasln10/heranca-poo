package HerancaPolimorfismoCinema;

public class IngressoNormal extends Ingresso {
    public IngressoNormal(String nomeFilme, String dubladoLegendado) {
        super(nomeFilme, dubladoLegendado);
    }

    public String valorNormal (){
        return "Ingresso [Filme: " + nomeFilme + ". Valor: " + valor + ". Tipo de tradução ou legenda: " + dubladoLegendado + "]";
    }
}
