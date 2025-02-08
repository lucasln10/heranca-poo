package InterfaceCelular;

import InterfaceCelular.app.Email;
import InterfaceCelular.app.RedesSociais;
import InterfaceCelular.app.SMS;
import InterfaceCelular.app.Whatsapp;

public class Main {

    public static void main(String[] args) {
        Whatsapp whatsapp = new Whatsapp();
        RedesSociais redesSocial = new RedesSociais();
        Email email = new Email();
        SMS sms = new SMS();

        whatsapp.receberMensagem();
        redesSocial.receberMensagem();
        email.receberMensagem();
        sms.receberMensagem();

    }
}
