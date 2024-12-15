package TuNetCom.BestErp.Domain;
import java.util.Date;

public class Commandes {
    public int num;
    public Date date;
    public int fournisseurId;

    public Commandes(int num, Date date, Integer fournisseurId) {
        this.num = num;
        this.date = date;
        this.fournisseurId = fournisseurId;
    }
    public int getNum() {
        return num;
    }


    public void setNum(int num) {
        this.num = num;
    }


    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }


    public Integer getFournisseurId() {
        return fournisseurId;
    }


    public void setFournisseurId(Integer fournisseurId) {
        this.fournisseurId = fournisseurId;
    }

}



