package entities;

public class Apicultor {
    private Long idApi;
    private String nomeApi;
    private String descApi;

    private String senha;

    public Apicultor(Long idApi, String nomeApi, String descApi, String senha){
        this.idApi = idApi;
        this.nomeApi = nomeApi;
        this.descApi = descApi;
        this.senha = senha;
    }

    public Long getIdApi() {
        return idApi;
    }

    public void setIdApi(Long idApi) {
        this.idApi = idApi;
    }

    public String getNomeApi() {
        return nomeApi;
    }

    public void setNomeApi(String nomeApi) {
        this.nomeApi = nomeApi;
    }

    public String getDescApi() {
        return descApi;
    }

    public void setDescApi(String descApi) {
        this.descApi = descApi;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
