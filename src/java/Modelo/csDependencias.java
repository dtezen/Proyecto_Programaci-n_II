package Modelo;

public class csDependencias {
    
    String id, uadmin, nom, descripcion, tel, email;

    public csDependencias() {
    }

    public csDependencias(String id, String uadmin, String nom, String descripcion, String tel, String email) {
        this.id = id;
        this.uadmin = uadmin;
        this.nom = nom;
        this.descripcion = descripcion;
        this.tel = tel;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUadmin() {
        return uadmin;
    }

    public void setUadmin(String uadmin) {
        this.uadmin = uadmin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
