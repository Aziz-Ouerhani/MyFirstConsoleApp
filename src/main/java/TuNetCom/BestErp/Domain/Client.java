package TuNetCom.BestErp.Domain;

public final class Client extends Tier {
    private String adress ;
    private String matricule ;
    private String code ;
    private String codeCat ;
    private String etbSec ;

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

    @Override
    public String toString() {
        return super.toString() + "** Client **" + this.adress + " " + this.code + " " + this.codeCat + " " + this.etbSec + " " + this.matricule + " " ;
    }
}
