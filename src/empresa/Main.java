package empresa;

import empresa.rh.Atendente;
import empresa.rh.Gerente;
import empresa.rh.Vendedor;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vendedor vitor = new Vendedor("Vitor", "vitor@gmail.com", "vitor123");
        Atendente luan = new Atendente("Luan", "luan@gmail.com", "luan123", 100);
        Gerente joao = new Gerente("João", "joao@gmail.com", "joao123", List.of(luan), List.of(vitor));

        //Atendente
        luan.loggin("luan@gmail.com", "luan123");
        luan.receberPagamento(21.8);
        luan.receberPagamento(15.9);
        luan.receberPagamento(7.87);
        luan.receberPagamento(5.14);
        System.out.printf("Valor em caixa: %.2f", luan.getValorEmCaixa());
        System.out.println("\n");
        luan.fecharCaixa();
        luan.loggoff("luan@gmail.com", "luan123");
        System.out.println("\n");


        //Vendedor
        vitor.loggin("vitor@gmail.com", "vitor123");
        vitor.realizarVenda( 41.25);
        vitor.realizarVenda( 10.24);
        vitor.realizarVenda( 5.47);
        vitor.realizarVenda( 61.1);
        vitor.consultarVendas();
        vitor.loggoff("vitor@gmail.com", "vitor123");
        System.out.println("\n");


        //Gerente
        joao.loggin("joao@gmail.com","joao123");
        joao.gerarRelatorioFinanceiro();
        System.out.println("\n");
        joao.consultarVendas();
        System.out.println("\n");
        joao.loggoff("joao@gmail.com", "joao123");


    }
}
