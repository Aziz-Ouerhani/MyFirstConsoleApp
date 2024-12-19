package TuNetCom.BestErp.Domain;

import java.sql.Date;

public final class AvoirFournisseur extends Document {
    private Date date;
    private int fournisseurId ;
    private int numFacteurAvoirFournisseur ;
    private int numAvoirFournisseur ;
    private Date dateTranfert ;

    public AvoirFournisseur(int num, Date date, int fournisseurId, int numFacteurAvoirFournisseur, int numAvoirFournisseur, Date dateTranfert) {
        this.num = num;
        this.date = date;
        this.fournisseurId = fournisseurId;
        this.numFacteurAvoirFournisseur = numFacteurAvoirFournisseur;
        this.numAvoirFournisseur = numAvoirFournisseur;
        this.dateTranfert = dateTranfert;
    }

    // Getters et setters

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getFournisseurId() {
        return fournisseurId;
    }

    public void setFournisseurId(int fournisseurId) {
        this.fournisseurId = fournisseurId;
    }

    public int getNumFacteurAvoirFournisseur() {
        return numFacteurAvoirFournisseur;
    }

    public void setNumFacteurAvoirFournisseur(int numFacteurAvoirFournisseur) {
        this.numFacteurAvoirFournisseur = numFacteurAvoirFournisseur;
    }

    public int getNumAvoirFournisseur() {
        return numAvoirFournisseur;
    }

    public void setNumAvoirFournisseur(int numAvoirFournisseur) {
        this.numAvoirFournisseur = numAvoirFournisseur;
    }

    public Date getDateTranfert() {
        return dateTranfert;
    }

    public void setDateTranfert(Date dateTranfert) {
        this.dateTranfert = dateTranfert;
    }

}
