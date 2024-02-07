package services;

import entities.Apicultor;
import entities.Consumidor;
import entities.Transportador;
import utils.Util;

import static services.CadastroServico.*;
import static utils.Util.sc;

public class LoginService {
    public static boolean fazLoginApicultor(){
        int tentativas = 3;
        Util.imprimeMensagem("Login para apicultor\n" +
                "So há três tentativas de login:\n" +
                "Entre com nome e senha:\n");

        do{
            System.out.println("Nome:");
            String nome = sc.nextLine();

            System.out.println("Senha");
            String senha = sc.nextLine();

            Apicultor encontradoApicultor = null;

            for (Apicultor apicultor : apicultores){
                if (apicultor.getNomeApi().equals(nome) && apicultor.getSenha().equals(senha)){
                    encontradoApicultor = apicultor;
                    break;
                }
            }
            if (encontradoApicultor != null){
                System.out.println("Login realizado com sucesso.\n" +
                        "Bem-vindo(a), caríssimo(a) " + encontradoApicultor.getNomeApi() + "\n");
            }
            else {
                Util.imprimeMensagem("Nome ou senha não reconhecidos, tente novamente.\n");
                tentativas--;
            }

        } while(tentativas > 0);

        return true;
    }
    public static boolean fazLoginTransportador(){
        int tentativas = 3;
        Util.imprimeMensagem("Login para transportador\n" +
                "So há três tentativas de login:\n" +
                "Entre com nome e senha:\n");

        do{
            System.out.println("Nome:");
            String nome = sc.nextLine();

            System.out.println("Senha");
            String senha = sc.nextLine();

            Transportador encontradoTransportador = null;

            for (Transportador transportador: transportadores){
                if (transportador.getNomeTran().equals(nome) && transportador.getSenha().equals(senha)){
                    encontradoTransportador = transportador;
                    break;
                }
            }
            if (encontradoTransportador != null){
                System.out.println("Login realizado com sucesso.\n" +
                        "Bem-vindo(a), caríssimo(a) " + encontradoTransportador.getNomeTran() + "\n");
            }
            else {
                Util.imprimeMensagem("Nome ou senha não reconhecidos, tente novamente.\n");
                tentativas--;
            }

        } while(tentativas > 0);
        return true;
    }
    public static boolean fazLoginConsumidor(){
        int tentativas = 3;
        Util.imprimeMensagem("Login para consumidor\n" +
                "So há três tentativas de login:\n" +
                "Entre com nome e senha:\n");

        do{
            System.out.println("Nome:");
            String nome = sc.nextLine();

            System.out.println("Senha");
            String senha = sc.nextLine();

            Consumidor encontradoConsumidor = null;

            for (Consumidor consumidor : consumidores){
                if (consumidor.getNomeCon().equals(nome) && consumidor.getSenha().equals(senha)){
                    encontradoConsumidor = consumidor;
                    break;
                }
            }
            if (encontradoConsumidor != null){
                System.out.println("Login realizado com sucesso.\n" +
                        "Bem-vindo(a), caríssimo(a) " + encontradoConsumidor.getNomeCon() + "\n");
            }
            else {
                Util.imprimeMensagem("Nome ou senha não reconhecidos, tente novamente.\n");
                tentativas--;
            }

        } while(tentativas > 0);
        return true;
    }
}
