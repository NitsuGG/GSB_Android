package com.example.gsb_android;
import java.io.Serializable;

public class Echantillon implements Serializable {

    private String code;
    private String libelle;
    private String quantiteStock;


    public Echantillon(String code, String libelle, String quantiteStock)  {
        this.code= code;
        this.libelle = libelle;
        this.quantiteStock= quantiteStock;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String codeMedicament) {
        this.code = codeMedicament;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelleMedicament) {
        this.libelle = libelleMedicament;
    }

    public String getquantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(String quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    @Override
    public String toString() {
        return this.code +" "+ this.libelle+" " + this.quantiteStock;
    }

}
