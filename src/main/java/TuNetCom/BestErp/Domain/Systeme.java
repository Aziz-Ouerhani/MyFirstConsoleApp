package TuNetCom.BestErp.Domain;
public class Systeme {
    private int id;
    private String nomSociete;
    private double timbre;
    private String adresse;
    private String tel;
    private String fax;
    private String email;
    private String matriculeFiscale;
    private String codeTVA;
    private String codeCategorie;
    private String etbSecondaire;
    private double pourcentageFodec;
    private String adresseRetenu;
    private double pourcentageRetenu;

    public Systeme(int id, String nomSociete, double timbre, String adresse, String tel, String fax, String email,
                   String matriculeFiscale, String codeTVA, String codeCategorie, String etbSecondaire,
                   double pourcentageFodec, String adresseRetenu, double pourcentageRetenu) {
        this.id = id;
        this.nomSociete = nomSociete;
        this.timbre = timbre;
        this.adresse = adresse;
        this.tel = tel;
        this.fax = fax;
        this.email = email;
        this.matriculeFiscale = matriculeFiscale;
        this.codeTVA = codeTVA;
        this.codeCategorie = codeCategorie;
        this.etbSecondaire = etbSecondaire;
        this.pourcentageFodec = pourcentageFodec;
        this.adresseRetenu = adresseRetenu;
        this.pourcentageRetenu = pourcentageRetenu;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomSociete() {
        return nomSociete;
    }

    public void setNomSociete(String nomSociete) {
        this.nomSociete = nomSociete;
    }

    public double getTimbre() {
        return timbre;
    }

    public void setTimbre(double timbre) {
        this.timbre = timbre;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatriculeFiscale() {
        return matriculeFiscale;
    }

    public void setMatriculeFiscale(String matriculeFiscale) {
        this.matriculeFiscale = matriculeFiscale;
    }

    public String getCodeTVA() {
        return codeTVA;
    }

    public void setCodeTVA(String codeTVA) {
        this.codeTVA = codeTVA;
    }

    public String getCodeCategorie() {
        return codeCategorie;
    }

    public void setCodeCategorie(String codeCategorie) {
        this.codeCategorie = codeCategorie;
    }

    public String getEtbSecondaire() {
        return etbSecondaire;
    }

    public void setEtbSecondaire(String etbSecondaire) {
        this.etbSecondaire = etbSecondaire;
    }

    public double getPourcentageFodec() {
        return pourcentageFodec;
    }

    public void setPourcentageFodec(double pourcentageFodec) {
        this.pourcentageFodec = pourcentageFodec;
    }

    public String getAdresseRetenu() {
        return adresseRetenu;
    }

    public void setAdresseRetenu(String adresseRetenu) {
        this.adresseRetenu = adresseRetenu;
    }

    public double getPourcentageRetenu() {
        return pourcentageRetenu;
    }

    public void setPourcentageRetenu(double pourcentageRetenu) {
        this.pourcentageRetenu = pourcentageRetenu;
    }
}


