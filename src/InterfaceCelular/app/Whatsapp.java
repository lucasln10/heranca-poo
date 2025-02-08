package InterfaceCelular.app;

public record Whatsapp() implements Mensagem {
    public void receberMensagem (){
        System.out.println(enviarMensagem());
    }
}
