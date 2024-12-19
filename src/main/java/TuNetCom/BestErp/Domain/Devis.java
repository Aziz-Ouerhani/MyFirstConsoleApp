package TuNetCom.BestErp.Domain;
import java.util.Date;
import java.math.BigDecimal;

public final class Devis extends Document {
    private int idClient;
    private Date date;
    private BigDecimal totHTTva;
    private BigDecimal totTva;
    private BigDecimal totTtc;

    public Devis(int num, int idClient, Date date, BigDecimal totHTTva, BigDecimal totTva, BigDecimal totTtc) {
        this.num = num;
        this.idClient = idClient;
        this.date = date;
        this.totHTTva = totHTTva;
        this.totTva = totTva;
        this.totTtc = totTtc;
    }
    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getTotHTTva() {
        return totHTTva;
    }

    public void setTotHTTva(BigDecimal totHTTva) {
        this.totHTTva = totHTTva;
    }

    public BigDecimal getTotTva() {
        return totTva;
    }

    public void setTotTva(BigDecimal totTva) {
        this.totTva = totTva;
    }

    public BigDecimal getTotTtc() {
        return totTtc;
    }

    public void setTotTtc(BigDecimal totTtc) {
        this.totTtc = totTtc;
    }

}



