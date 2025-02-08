package InterfaceCelular.app;

public record SMS() implements Mensagem{

    public void receberMensagem (){
        System.out.println(enviarMensagem());
    }
}
