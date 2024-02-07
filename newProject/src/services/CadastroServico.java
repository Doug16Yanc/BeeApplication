package services;

import entities.Apicultor;
import entities.Consumidor;
import entities.Transportador;
import repositories.GeracaoId;
import utils.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static utils.Util.sc;

public class CadastroServico {

    static final List<Apicultor> apicultores = new ArrayList<>();

    static final List<Transportador> transportadores = new ArrayList<>();

    static final List<Consumidor> consumidores = new ArrayList<>();
    public static int questionaCadastro(){
        Util.imprimeMensagem("Olá, caríssimo!\n");
        System.out.println("Já é cadastrado em nossa plataforma?\n" +
                "S/s - sim\n" +
                "N/n - não\n");
        String opcao = sc.nextLine();

        switch(opcao.toLowerCase()){
            case "s" -> {
                defineTipoEntidade();
            }
            case "n" -> {
                identificaEntidade();
            }
            default -> {
                Util.imprimeMensagem("Opção não existente.\n");
            }
        }
        return 1;
    }
    public static boolean identificaEntidade(){
        Util.imprimeMensagem("Identifique-se:\n" +
                "A/a - apicultor:\n" +
                "T/t - transportador\n" +
                "C/c - consumidor\n");
        String opcao = sc.nextLine();

        switch (opcao.toLowerCase()){
            case "a" -> {
                realizaCadastroApicultor();
            }
            case "t" -> {
                realizaCadastroTransportador();
            }
            case "c" -> {
                realizaCadastroConsumidor();
            }
            default -> {
                Util.imprimeMensagem("Opção não existente.\n");
            }
        }
        return true;
    }
    public static int realizaCadastroApicultor(){
        Util.imprimeMensagem("Cadastro de apicultores\n");

        Long idApi = (long) GeracaoId.gerarid();

        System.out.println("Nome:");
        String nome = sc.nextLine();

        System.out.println("Descrição:");
        String desc = sc.nextLine();

        System.out.println("Senha:");
        String senha = sc.nextLine();

        Apicultor apicultor = new Apicultor(idApi, nome, desc, senha);

        apicultores.add(apicultor);

        return 1;
    }
    public static int realizaCadastroTransportador(){
        Util.imprimeMensagem("Cadastro de transportadores\n");

        Long idTran = (long) GeracaoId.gerarid();

        System.out.println("Nome:");
        String nome = sc.nextLine();

        System.out.println("Descrição: ");
        String desc = sc.nextLine();

        System.out.println("Senha:");
        String senha = sc.nextLine();

        Transportador transportador = new Transportador(idTran, nome, desc, senha);

        transportadores.add(transportador);

        return 1;
    }
    public static int realizaCadastroConsumidor(){
        Util.imprimeMensagem("Cadastro de consumidores\n");

        Long idCon = (long) GeracaoId.gerarid();

        System.out.println("Nome:");
        String nome = sc.nextLine();

        System.out.println("Senha:");
        String senha = sc.nextLine();

        Consumidor consumidor = new Consumidor(idCon, nome, senha);

        consumidores.add(consumidor);

        return 1;
    }
    public static void defineTipoEntidade(){
        System.out.println("Quem é você em nosso sistema:\n" +
                "A/a - apicultor\n" +
                "T/t - transportador\n" +
                "C/c - consumidor\n" +
                "S/s - sair do programa\n");
        String opcao = sc.nextLine();

        switch(opcao.toLowerCase()) {
            case "a" -> {
                LoginService.fazLoginApicultor();
            }
            case "t" -> {
                LoginService.fazLoginTransportador();
            }
            case "c" -> {
                LoginService.fazLoginConsumidor();
            }
            case "s" -> {
                Util.imprimeMensagem("Foi muito bom ter você por aqui. Até mais!\n");
            }
            default -> {
                Util.imprimeMensagem("Opção não existente.\n");
            }
        }
    }
}
