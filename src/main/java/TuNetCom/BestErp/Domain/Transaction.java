package TuNetCom.BestErp.Domain;

import java.util.Date;

public class Transaction {
    private int numBL;
    private String type;
    private Date dateTr;
    private double montant;

    // Constructeur paramétré
    public Transaction(int numBL, String type, Date dateTr, double montant) {
        this.numBL = numBL;
        this.type = type;
        this.dateTr = dateTr;
        this.montant = montant;
    }

    // Getters et Setters
    public int getNumBL() {
        return numBL;
    }

    public void setNumBL(int numBL) {
        this.numBL = numBL;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateTr() {
        return dateTr;
    }

    public void setDateTr(Date dateTr) {
        this.dateTr = dateTr;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}


