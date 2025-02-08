package InterfaceCelular.app;

public record RedesSociais() implements Mensagem {

    public void receberMensagem (){
        System.out.println(enviarMensagem());
    }
}
