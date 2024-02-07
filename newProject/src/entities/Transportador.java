package entities;

public class Transportador {
    private Long idTran;
    private String nomeTran;
    private String descTran;

    private String senha;

    public Transportador(Long idTran, String nomeTran, String descTran, String senha){
        this.idTran = idTran;
        this.nomeTran = nomeTran;
        this.descTran = descTran;
        this.senha = senha;
    }

    public Long getIdTran() {
        return idTran;
    }

    public void setIdTran(Long idTran) {
        this.idTran = idTran;
    }

    public String getNomeTran() {
        return nomeTran;
    }

    public void setNomeTran(String nomeTran) {
        this.nomeTran = nomeTran;
    }

    public String getDescTran() {
        return descTran;
    }

    public void setDescTran(String descTran) {
        this.descTran = descTran;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
