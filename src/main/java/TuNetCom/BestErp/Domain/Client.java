package TuNetCom.BestErp.Domain;

public class Client {
    private int id ;
    private String nom ;
    private String tel ;
    private String adress ;
    private String matricule ;
    private String code ;
    private String codeCat ;
    private String etbSec ;
    private String mail ;

    public Client(int id, String nom, String tel, String adress, String matricule, String code, String codeCat, String etbSec, String mail) {
        this.id = id;
        this.nom = nom;
        this.tel = tel;
        this.adress = adress;
        this.matricule = matricule;
        this.code = code;
        this.codeCat = codeCat;
        this.etbSec = etbSec;
        this.mail = mail;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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

}
