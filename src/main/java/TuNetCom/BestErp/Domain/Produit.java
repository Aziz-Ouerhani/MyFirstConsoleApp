package TuNetCom.BestErp.Domain;
public final class Produit {
    private String refe;
    private String nom;
    private int qte;
    private int qteLimite;
    private double remise;
    private double remiseAchat;
    private double tva;
    private double prix;
    private double prixAchat;
    private boolean visibilite;

    public Produit(String refe, String nom, int qte, int qteLimite, double remise, double remiseAchat, double tva, double prix, double prixAchat, boolean visibilite) {
        this.refe = refe;
        this.nom = nom;
        this.qte = qte;
        this.qteLimite = qteLimite;
        this.remise = remise;
        this.remiseAchat = remiseAchat;
        this.tva = tva;
        this.prix = prix;
        this.prixAchat = prixAchat;
        this.visibilite = visibilite;
    }


    public String getRefe() {
        return refe;
    }

    public void setRefe(String refe) {
        this.refe = refe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public int getQteLimite() {
        return qteLimite;
    }

    public void setQteLimite(int qteLimite) {
        this.qteLimite = qteLimite;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public double getRemiseAchat() {
        return remiseAchat;
    }

    public void setRemiseAchat(double remiseAchat) {
        this.remiseAchat = remiseAchat;
    }

    public double getTva() {
        return tva;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(double prixAchat) {
        this.prixAchat = prixAchat;
    }

    public boolean isVisibilite() {
        return visibilite;
    }

    public void setVisibilite(boolean visibilite) {
        this.visibilite = visibilite;
    }

    public int getPackagingNumber() {
        int stayek = qte / 6 ;
        return stayek;
    }

    public int getPackagingNumber(int packagingSize) {
        int stayek = qte / packagingSize;
        return stayek;
    }
}

