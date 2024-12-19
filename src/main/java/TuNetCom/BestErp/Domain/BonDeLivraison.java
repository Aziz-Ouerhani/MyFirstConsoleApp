package TuNetCom.BestErp.Domain;

import java.sql.Time;
import java.util.Date;

public final class BonDeLivraison extends Document {
    private String date;
    private double totHTva;
    private double totTva;
    private double netPayer;
    private Time tempBl;
    private int numFacture;
    private int clientId;

    public BonDeLivraison(int num, String date, double totHTva, double totTva, double netPayer, Time tempBl, int numFacture, int clientId) {
        this.num = num;
        this.date = date;
        this.totHTva = totHTva;
        this.totTva = totTva;
        this.netPayer = netPayer;
        this.tempBl = tempBl;
        this.numFacture = numFacture;
        this.clientId = clientId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotHTva() {
        return totHTva;
    }

    public void setTotHTva(double totHTva) {
        this.totHTva = totHTva;
    }

    public double getTotTva() {
        return totTva;
    }

    public void setTotTva(double totTva) {
        this.totTva = totTva;
    }

    public double getNetPayer() {
        return netPayer;
    }

    public void setNetPayer(double netPayer) {
        this.netPayer = netPayer;
    }

    public Time getTempBl() {
        return tempBl;
    }

    public void setTempBl(Time tempBl) {
        this.tempBl = tempBl;
    }

    public int getNumFacture() {
        return numFacture;
    }

    public void setNumFacture(int numFacture) {
        this.numFacture = numFacture;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

}

