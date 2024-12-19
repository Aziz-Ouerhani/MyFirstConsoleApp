package TuNetCom.BestErp.Domain;
public final class LigneCommande {
    private int idLigne;
    private int numCommande;
    private String refProduit;
    private String designationLi;
    private int qteLi;
    private double prixHT;
    private double remise;
    private double totHT;
    private double tva;
    private double totTTC;

    public LigneCommande(int idLigne, int numCommande, String refProduit, String designationLi, int qteLi, double prixHT, double remise, double totHT, double tva, double totTTC) {
        this.idLigne = idLigne;
        this.numCommande = numCommande;
        this.refProduit = refProduit;
        this.designationLi = designationLi;
        this.qteLi = qteLi;
        this.prixHT = prixHT;
        this.remise = remise;
        this.totHT = totHT;
        this.tva = tva;
        this.totTTC = totTTC;
    }

    public int getIdLigne() {
        return idLigne;
    }

    public void setIdLigne(int idLigne) {
        this.idLigne = idLigne;
    }

    public int getNumCommande() {
        return numCommande;
    }

    public void setNumCommande(int numCommande) {
        this.numCommande = numCommande;
    }

    public String getRefProduit() {
        return refProduit;
    }

    public void setRefProduit(String refProduit) {
        this.refProduit = refProduit;
    }

    public String getDesignationLi() {
        return designationLi;
    }

    public void setDesignationLi(String designationLi) {
        this.designationLi = designationLi;
    }

    public int getQteLi() {
        return qteLi;
    }

    public void setQteLi(int qteLi) {
        this.qteLi = qteLi;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public double getTotHT() {
        return totHT;
    }

    public void setTotHT(double totHT) {
        this.totHT = totHT;
    }

    public double getTva() {
        return tva;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }

    public double getTotTTC() {
        return totTTC;
    }

    public void setTotTTC(double totTTC) {
        this.totTTC = totTTC;
    }

}



