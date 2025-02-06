import cinema.IngressoFamilia;
import cinema.IngressoMeia;
import cinema.IngressoNormal;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IngressoMeia meia = new IngressoMeia("Senhor dos Aneis", "Dublado Portugues");
        IngressoFamilia familia = new IngressoFamilia("Sonic", "Legendados Portugues");
        IngressoNormal normal = new IngressoNormal("Avatar", "Dublado Portugues");

        System.out.println(meia.valorMeia());
        System.out.println(familia.valorFamilia(4));
        System.out.println(normal.valorNormal());
    }
}