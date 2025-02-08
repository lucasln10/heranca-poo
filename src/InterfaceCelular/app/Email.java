package InterfaceCelular.app;

public record Email() implements Mensagem{

    public void receberMensagem (){
        System.out.println(enviarMensagem());
    }
}
