package Modelo;

public class csEmpleado {
    
    String id, nom, puesto, direccion, tel, email;

    public csEmpleado() {
    }

    public csEmpleado(String id, String nom, String puesto, String direccion, String tel, String email) {
        this.id = id;
        this.nom = nom;
        this.puesto = puesto;
        this.direccion = direccion;
        this.tel = tel;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
