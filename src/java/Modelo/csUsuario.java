
package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class csUsuario {

   public Connection cn;
   public Statement stm;
   public ResultSet rs;
   public ResultSet rsp;
   
   public csUsuario()
   {
       this.cn=null;
       this.stm=null;
       //this.rs=null;
   }
   
   public String buscarUsuario(String usuario, String password)
   {
       String perfil="";
       
       csConexion con = new csConexion();
       cn = con.conectar();
       
     try
       {
       stm = cn.createStatement();
       rs=stm.executeQuery("select * from system.usuario where usuario= '" + usuario + "' and password='" + password + "' ");
       rsp = stm.executeQuery("select perfil.nombre from system.usuario join perfil on usuario.idPerfil = perfil.idPerfil where usuario.usuario = '" + usuario + "' and password='" + password + "' ");
       
       
       while (rsp.next())
       {
          perfil = rsp.getString("nombre");          
       }
       con.desconectar();
       cn.close();
       }
       catch (Exception e)
       {
            perfil=e.toString();
       }
       return perfil;
   }
    
}
