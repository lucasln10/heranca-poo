package empresa.rh;

import java.util.Scanner;

public class Atendente extends Funcionarios{
    private final boolean admin = false;
    private double valorEmCaixa;
    private boolean caixaTouF;
    Scanner sc = new Scanner(System.in);

    public Atendente(String nome, String email, String senha, double valorEmCaixa) {
        super(nome, email, senha);
        this.valorEmCaixa = valorEmCaixa;
        this.caixaTouF = true;
    }

    public boolean CaixaTouF() {
        return caixaTouF;
    }

    protected void setCaixaTouF(boolean caixaTouF) {
        this.caixaTouF = caixaTouF;
    }

    public boolean isAdmin() {
        return false;
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void receberPagamento (double valor){
        //(onde o metodo recebe um valor que deve ser incrementado no valor em caixa)
       System.out.printf("%.2f", valorEmCaixa += valor);
       System.out.println("\n");
    }

    public void fecharCaixa (){
        System.out.println("Digite sua senha para fechar o caixa");
        String mySenha = sc.nextLine();
        if (mySenha.isEmpty()){
            System.out.println("Necessario digitar a senha");
            mySenha = sc.nextLine();
        }else if (mySenha.equals(getSenha())){
            System.out.println("Fechando o caixa");
            caixaTouF = false;
        }else{
            System.out.println("Senha invalida");
        }
    }

}
