package TuNetCom.BestErp.Domain;

public final class Commandes extends Document {
    public String date;
    public int fournisseurId;

    public Commandes(int num, String date, int fournisseurId) {
        this.num = num;
        this.date = date;
        this.fournisseurId = fournisseurId;
    }

    public Commandes(String date, int fournisseurId) {
        super();
    }

    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }


    public int  getFournisseurId() {
        return fournisseurId;
    }


    public void setFournisseurId(int fournisseurId) {
        this.fournisseurId = fournisseurId;
    }

}



