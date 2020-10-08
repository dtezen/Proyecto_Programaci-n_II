
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class csConexion {

public String url,driver,user,password;
public Connection cn;

    public csConexion() {
        this.url = "jdbc:oracle:thin:@localhost:1521:XE";
        this.driver = "oracle.jdbc.OracleDriver";
        this.user = "system";
        this.password = "F56electro!";
        this.cn = null;
    }
    
public Connection conectar()
{
    try
    {
    Class.forName(this.driver);
    cn = DriverManager.getConnection(url, user, password);
    return cn;
   
    }
    catch (Exception e)
    {
        return null;
    }
}

public void desconectar() throws SQLException
{
    cn.close();
}
    
}
