package TuNetCom.BestErp.Domain;

/**
 *  Class Tier pour encapsuler les champs en commun.
 */
public abstract class Tier {
    protected int id;
    protected String nom;
    protected String tel;
    protected String mail;

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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Tier :" + this.id + " " + this.nom + " " + this.tel + " " + this.mail + " ";
    }
}

