package TuNetCom.BestErp.Domain;

import java.sql.Date;
public final class BonDeReception extends Document {
    private long numBonFournisseur;
    private Date dateLivraison;
    private int idFournisseur;
    private Date date;
    private int numFactureFournisseur;


    public BonDeReception(int num, long numBonFournisseur, Date dateLivraison, int idFournisseur, Date date, int numFactureFournisseur) {
        this.num = num;
        this.numBonFournisseur = numBonFournisseur;
        this.dateLivraison = dateLivraison;
        this.idFournisseur = idFournisseur;
        this.date = date;
        this.numFactureFournisseur = numFactureFournisseur;
    }
    public long getNumBonFournisseur() {
        return numBonFournisseur;
    }

    public void setNumBonFournisseur(long numBonFournisseur) {
        this.numBonFournisseur = numBonFournisseur;
    }

    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public int getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdFournisseur(int idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumFactureFournisseur() {
        return numFactureFournisseur;
    }

    public void setNumFactureFournisseur(int numFactureFournisseur) {
        this.numFactureFournisseur = numFactureFournisseur;
    }
}
