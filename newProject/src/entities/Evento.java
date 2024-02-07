package entities;

import java.time.LocalDateTime;
import java.util.UUID;

public class Evento {
    private String idEve;
    private LocalDateTime Date;
    private String valor;
    private UUID endereco;

    public Evento(String idEve, LocalDateTime Date, String valor, UUID endereco){
        this.idEve = idEve;
        this.Date = Date;
        this.valor = valor;
        this.endereco = endereco;
    }

    public String getIdEve() {
        return idEve;
    }

    public void setIdEve(String idEve) {
        this.idEve = idEve;
    }

    public LocalDateTime getDate() {
        return Date;
    }

    public void setDate(LocalDateTime date) {
        Date = date;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public UUID getEndereco() {
        return endereco;
    }

    public void setEndereco(UUID endereco) {
        this.endereco = endereco;
    }
}
