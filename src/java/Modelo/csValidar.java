
package Modelo;


public class csValidar {
    public String usuario, password;

    public csValidar(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    //metodo personalizado
    public Boolean validarUsuario ()
    {
       Boolean respuesta;
        if(this.usuario.equals("UMG") && this.password.endsWith("2020"))
        {
           respuesta= true;
        }
        else
          {
            respuesta= false;
          }
    return respuesta;
    }
}
