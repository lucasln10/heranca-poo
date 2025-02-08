package InterfaceCelular.app;

public interface Mensagem {

    default String enviarMensagem(){
        String mensagem = "venha concorrer a 1 milhão de reais, se inscreva agora no sorteio para concorrer";
        return String.format("Mensagem: [ " + mensagem + " ]");
    }

}

/*
SMS;
E-mail;
Redes Sociais;
WhatsApp;*/
