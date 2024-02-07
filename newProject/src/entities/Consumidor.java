package entities;

public class Consumidor {
    private Long idCon;
    private String nomeCon;
    private String senha;

    public Consumidor(Long idCon, String nomeCon, String senha){
        this.idCon = idCon;
        this.nomeCon = nomeCon;
        this.senha = senha;
    }

    public Long getIdCon() {
        return idCon;
    }

    public void setIdCon(Long idCon) {
        this.idCon = idCon;
    }

    public String getNomeCon() {
        return nomeCon;
    }

    public void setNomeCon(String nomeCon) {
        this.nomeCon = nomeCon;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
