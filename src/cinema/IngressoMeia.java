package cinema;

public class IngressoMeia extends Ingresso {
    public IngressoMeia(String nomeFilme, String dubladoLegendado) {
        super(nomeFilme, dubladoLegendado);
    }

    public String valorMeia (){
        double ingressoMeia =  valor / 2;
        return "Ingresso [Filme: " + nomeFilme + ". Valor: " + ingressoMeia + ". Tipo de tradução ou legenda: " + dubladoLegendado + "]";

    }

}
