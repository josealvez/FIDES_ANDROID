package com.proyectofinal.fides_rca.persistence;

public class ObsCaracteristicasDTO {
    private long numero;
    private String texto;
    private long idCaract;
    private String idCaractNom;
    private long idObs;
    private String idObsNom;

    public ObsCaracteristicasDTO(long numero, String texto, long idCaract, String idCaractNom, long idObs,
                                 String idObsNom) {
        super();
        this.numero = numero;
        this.texto = texto;
        this.idCaract = idCaract;
        this.idCaractNom = idCaractNom;
        this.idObs = idObs;
        this.idObsNom = idObsNom;
    }

    public ObsCaracteristicasDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public long getNumero() {
        return numero;
    }
    public void setNumero(long numero) {
        this.numero = numero;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public long getIdCaract() {
        return idCaract;
    }
    public void setIdCaract(long idCaract) {
        this.idCaract = idCaract;
    }
    public long getIdObs() {
        return idObs;
    }
    public void setIdObs(long idObs) {
        this.idObs = idObs;
    }

    public String getIdCaractNom() {
        return idCaractNom;
    }

    public void setIdCaractNom(String idCaractNom) {
        this.idCaractNom = idCaractNom;
    }

    public String getIdObsNom() {
        return idObsNom;
    }

    public void setIdObsNom(String idObsNom) {
        this.idObsNom = idObsNom;
    }

    @Override
    public String toString() {
        return "ObsCaracteristicasDTO [numero=" + numero + ", texto=" + texto + ", idCaract=" + idCaract
                + ", idCaractNom=" + idCaractNom + ", idObs=" + idObs + ", idObsNom=" + idObsNom + "]";
    }



}
