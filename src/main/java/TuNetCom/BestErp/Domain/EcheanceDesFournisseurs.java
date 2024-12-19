package TuNetCom.BestErp.Domain;
import java.util.Date;

public final class EcheanceDesFournisseurs {
    private int id;
    private Date dateEcheance;
    private long numCheque;
    private double montant;
    private int fournisseurId;

    public EcheanceDesFournisseurs(int id, Date dateEcheance, long numCheque, double montant, int fournisseurId) {
        this.id = id;
        this.dateEcheance = dateEcheance;
        this.numCheque = numCheque;
        this.montant = montant;
        this.fournisseurId = fournisseurId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateEcheance() {
        return dateEcheance;
    }

    public void setDateEcheance(Date dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    public long getNumCheque() {
        return numCheque;
    }

    public void setNumCheque(long numCheque) {
        this.numCheque = numCheque;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public int getFournisseurId() {
        return fournisseurId;
    }

    public void setFournisseurId(int fournisseurId) {
        this.fournisseurId = fournisseurId;
    }

}

