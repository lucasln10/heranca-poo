package HerancaPolimorfismoEmpresa.rh;

import java.util.Scanner;

public class Funcionarios {
    private final String nome;
    private String email;
    private String senha;
    Scanner sc = new Scanner(System.in);

    public Funcionarios(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void alterarEmail (String email){
        if (email.equals(getEmail())){
            System.out.println("Digite o email para qual voce quer alterar: ");
            String newEmail = sc.nextLine();
            setEmail(newEmail);
            System.out.println("Email alterada com sucesso!");
        }else {
            System.out.println("O email digitado não foi encontrado");
        }
    }

    public void alterarSenha (String senha){
        if (senha.equals(getSenha())){
            System.out.println("Digite a sua nova senha: ");
            String newSenha = sc.nextLine();
            setSenha(newSenha);
            System.out.println("Senha alterada com sucesso!");
        }else{
            System.out.println("Senha invalida!");
        }
    }

    public void loggin (String email, String senha){
        if (email.equals(getEmail()) && senha.equals(getSenha())){
            System.out.println("Login realizado com sucesso!");
        }else if (!email.equals(getEmail())){
            System.out.println("Email é invalido!");
        } else if (!senha.equals(getSenha())) {
            System.out.println("Sua senha é invalida!");
        }else{
            System.out.println("Você não tem cadastro.");
        }

    }

    public void loggoff (String email, String senha){
        if (email.equals(getEmail()) && senha.equals(getSenha())){
            System.out.println("Saindo");
        }else if (!email.equals(getEmail())){
            System.out.println("Email é invalido!");
        } else if (!senha.equals(getSenha())) {
            System.out.println("Sua senha é invalida!");
        }else{
            System.out.println("Tente novamente.");
        }
    }

    public void finaceiro (){
    }
}
