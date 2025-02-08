package HerancaPolimorfismoCinema;

public class IngressoFamilia extends Ingresso {
    public IngressoFamilia(String nomeFilme, String dubladoLegendado) {
        super(nomeFilme, dubladoLegendado);
    }

    public String valorFamilia (int pessoas){
        double ingressoFamilia = valor * pessoas;
        double ingressoDesconto = ingressoFamilia - (ingressoFamilia * 0.05);
        if (pessoas > 3) {
            return "Ingresso [Filme: " + nomeFilme + ". Valor: " + ingressoDesconto + ". Tipo de tradução ou legenda: " + dubladoLegendado + "]";
        }
        else{
            return "Ingresso [Filme: " + nomeFilme + ". Valor: " + ingressoFamilia + ". Tipo de tradução ou legenda: " + dubladoLegendado + "]";
        }
    }

}