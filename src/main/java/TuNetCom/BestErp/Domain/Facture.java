package TuNetCom.BestErp.Domain;

import java.util.Date;

public class Facture {
    private int num;
    private int idClient;
    private Date date;

    public Facture() {
        this.num = num;
        this.idClient = idClient;
        this.date = date;
    }

    public int getNum() {
        return num;
    }


    public void setNum(int num) {
        this.num = num;
    }
    public int getIdClient() {
        return idClient;
    }

    // Setter pour idClient
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
    public Date getDate() {
        return date;
    }

    // Setter pour date
    public void setDate(Date date) {
        this.date = date;
    }



}
