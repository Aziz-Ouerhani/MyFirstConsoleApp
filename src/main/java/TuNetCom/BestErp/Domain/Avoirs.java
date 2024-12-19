package TuNetCom.BestErp.Domain;

import java.sql.Date;

public final class Avoirs extends Document {
    private Date date ;
    private int clientId ;

    public Avoirs(int num, Date date, int clientId) {
        this.num = num;
        this.date = date;
        this.clientId = clientId;
    }

    // Getters et setters

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }


}
