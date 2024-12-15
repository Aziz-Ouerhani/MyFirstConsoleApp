package TuNetCom.BestErp.Domain;

public class Fournisseur {
    private int id;
    private String nom;
    private String tel;
    private String fax;
    private String matricule;
    private String code;
    private String codeCat;
    private String etbSec;
    private String mail;
    private String mailDeux;
    private boolean constructeur;
    private String adresse;

    public Fournisseur(int id, String nom, String tel, String fax, String matricule, String code, String codeCat, String etbSec, String mail, String mailDeux, boolean constructeur, String adresse) {
        this.id = id;
        this.nom = nom;
        this.tel = tel;
        this.fax = fax;
        this.matricule = matricule;
        this.code = code;
        this.codeCat = codeCat;
        this.etbSec = etbSec;
        this.mail = mail;
        this.mailDeux = mailDeux;
        this.constructeur = constructeur;
        this.adresse = adresse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeCat() {
        return codeCat;
    }

    public void setCodeCat(String codeCat) {
        this.codeCat = codeCat;
    }

    public String getEtbSec() {
        return etbSec;
    }

    public void setEtbSec(String etbSec) {
        this.etbSec = etbSec;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMailDeux() {
        return mailDeux;
    }

    public void setMailDeux(String mailDeux) {
        this.mailDeux = mailDeux;
    }

    public boolean getConstructeur() {
        return constructeur;
    }

    public void setConstructeur(boolean constructeur) {
        this.constructeur = constructeur;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

}
