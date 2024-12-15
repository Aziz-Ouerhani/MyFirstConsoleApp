package TuNetCom.BestErp.Domain;

import java.util.Date;

public class FactureFournisseurs {
    private int num;
    private int idFournisseur;
    private boolean paye;
    private int numFactureFournisseur;
    private Date dateFacturationFournisseur;
    private Date date;


    public FactureFournisseurs(int num, int idFournisseur, boolean paye, int numFactureFournisseur, Date dateFacturationFournisseur, Date date) {
        this.num = num;
        this.idFournisseur = idFournisseur;
        this.paye = paye;
        this.numFactureFournisseur = numFactureFournisseur;
        this.dateFacturationFournisseur = dateFacturationFournisseur;
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdFournisseur(int idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    public boolean isPaye() {
        return paye;
    }

    public void setPaye(boolean paye) {
        this.paye = paye;
    }

    public int getNumFactureFournisseur() {
        return numFactureFournisseur;
    }

    public void setNumFactureFournisseur(int numFactureFournisseur) {
        this.numFactureFournisseur = numFactureFournisseur;
    }

    public Date getDateFacturationFournisseur() {
        return dateFacturationFournisseur;
    }

    public void setDateFacturationFournisseur(Date dateFacturationFournisseur) {
        this.dateFacturationFournisseur = dateFacturationFournisseur;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
