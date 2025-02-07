package empresa.rh;

import java.util.List;

public class Gerente extends Funcionarios{
    public final boolean admin = true;
    private List<Atendente> atendentes;
    private List<Vendedor> vendedores;

    public Gerente(String nome, String email, String senha, List<Atendente> atendentes, List<Vendedor> vendedores) {
        super(nome, email, senha);
        this.atendentes = atendentes;
        this.vendedores = vendedores;
    }

    public void gerarRelatorioFinanceiro (){
        double totalRecebido = 0;

        System.out.println("============RELATORIO FINANCEIRO============");

        for (Atendente atendente : atendentes){
            System.out.printf(atendente.getNome() + " - Recebeu: R$ %.2f%n", atendente.getValorEmCaixa());
            totalRecebido += atendente.getValorEmCaixa();
        }

        System.out.printf("Total de Pagamentos Recebidos: R$ %.2f %n", totalRecebido);
        System.out.println("===============================");

    }

    public void consultarVendas (){
        double totalVendas = 0;

        System.out.println("============ RELATÓRIO DE VENDAS ============");

        for (Vendedor vendedor : vendedores) {
            double totalVendasVendedor = vendedor.getValoresVendas().stream().mapToDouble(Double::doubleValue).sum();
            System.out.printf("%s - Vendas: %d - Total Vendido: R$ %.2f%n",
                    vendedor.getNome(), vendedor.getQuantidadeVendas(), totalVendasVendedor);
            totalVendas += totalVendasVendedor;
        }

        System.out.println("Total de Vendas: R$ " + totalVendas);

        System.out.println("===============================");

    }

}
