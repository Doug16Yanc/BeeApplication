package applications;

import enumerations.Regras;
import services.CadastroServico;
import utils.Util;
import static utils.Util.sc;

public class Program {
    public static void main(String[] args) {
        Util.imprimeMensagem("Seja bem-vindo(a) ao nosso sistema de rastreabilidade para a cadeia " +
                "produtiva do mel.\n");

        CadastroServico.questionaCadastro();
    }
}