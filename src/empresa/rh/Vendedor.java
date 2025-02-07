package empresa.rh;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Funcionarios{
    private final boolean admin = false;
    private List<Double> valoresVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha);
        this.valoresVendas = new ArrayList<>();
    }

    public int getQuantidadeVendas() {
        return valoresVendas.size();
    }

    public List<Double> getValoresVendas() {
        return valoresVendas;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void realizarVenda (double valor){
        valoresVendas.add(valor);

        System.out.println("Venda realizada! Valor da venda: " + valor);
        System.out.println("\n");
    }


    public void consultarVendas (){
        System.out.println("============ RELATÓRIO DE VENDAS ============");
        System.out.println("Quantidade de vendas: " + getQuantidadeVendas());

        if (valoresVendas.isEmpty()){
            System.out.println("Nenhuma venda registrada.");
        }else{
            System.out.println("Valor da Venda: " + valoresVendas);
        }
        System.out.println("=============================================");

    }

}
