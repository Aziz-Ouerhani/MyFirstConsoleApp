package TuNetCom.BestErp.Domain;

import java.sql.Date;

public final class AvoirFinancierFournisseurs extends Document {
    private int numSurPage ;
    private Date date ;
    private String description ;
    private double totTtc ;

    public AvoirFinancierFournisseurs(int num, int numSurPage, Date date, String description, double totTtc) {
        this.num = num;
        this.numSurPage = numSurPage;
        this.date = date;
        this.description = description;
        this.totTtc = totTtc;
    }

    // Getters et setters

    public int getNumSurPage() {
        return numSurPage;
    }

    public void setNumSurPage(int numSurPage) {
        this.numSurPage = numSurPage;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTotTtc() {
        return totTtc;
    }

    public void setTotTtc(double totTtc) {
        this.totTtc = totTtc;
    }


}
