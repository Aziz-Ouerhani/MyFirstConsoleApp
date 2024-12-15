package TuNetCom.BestErp.Domain;

import java.util.Date;

public class FactureAvoirFournisseur {
    private int num;
    private int numFactureAvoirFourSurPage;
    private int idFournisseur;
    private Date date;
    private int numFactureFournisseur;
    public FactureAvoirFournisseur(int num, int numFactureAvoirFourSurPage, int idFournisseur, Date date, int numFactureFournisseur) {
        this.num = num;
        this.numFactureAvoirFourSurPage = numFactureAvoirFourSurPage;
        this.idFournisseur = idFournisseur;
        this.date = date;
        this.numFactureFournisseur = numFactureFournisseur;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNumFactureAvoirFourSurPage() {
        return numFactureAvoirFourSurPage;
    }

    public void setNumFactureAvoirFourSurPage(int numFactureAvoirFourSurPage) {
        this.numFactureAvoirFourSurPage = numFactureAvoirFourSurPage;
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
