package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class csEmpleadoDAO {
    PreparedStatement ps;
    ResultSet rs;
    csConexion c = new csConexion();
    Connection con;
    
    public List listar(){
        List<csEmpleado>lista=new ArrayList<> ();
        String sql = "select personal.idEmpleado, puesto.nombre, personal.nombre, personal.direccion, personal.telefono, personal.email from personal join puesto on personal.idPuesto = puesto.idPuesto";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()) {
                csEmpleado p = new csEmpleado();
                p.setId(rs.getString(1));
                p.setPuesto(rs.getString(2));
                p.setNom(rs.getString(3));
                p.setDireccion(rs.getString(4));
                p.setTel(rs.getString(5));
                p.setEmail(rs.getString(6));
                lista.add(p);
            }
        } catch (Exception e) {
            
        }
        return lista;
    }
    
    public int agregarPersona(csEmpleado p){
        int r=0;
        String sql= "insert into personal(idEmpleado,idPuesto,nombre,direccion,telefono,email) values(?,?,?,?,?,?)";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, p.getId());
            ps.setString(2, p.getPuesto());
            ps.setString(3, p.getNom());
            ps.setString(4, p.getDireccion());
            ps.setString(5, p.getTel());
            ps.setString(6, p.getEmail());
            r=ps.executeUpdate();
            if(r==1){
                r=1;
            }else{
                r=0;
            }
        } catch (Exception e){
            
        }
        
        return r;
    }
    
    public csEmpleado listarId(String id){
        String sql="select * from personal where idEmpleado="+id;
        csEmpleado p=new csEmpleado();
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                p.setId(rs.getString(1));
                p.setPuesto(rs.getString(2));
                p.setNom(rs.getString(3));
                p.setDireccion(rs.getString(4));
                p.setTel(rs.getString(5));
                p.setEmail(rs.getString(6));
            }
        } catch (Exception e) {
            
        }
        return p;
    }
    
    public int actualizar(csEmpleado p){
        int r=0;
        String sql="update personal set idPuesto=?, nombre=?, direccion=?, telefono=?, email=? where idEmpleado=?";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, p.getPuesto());
            ps.setString(2, p.getNom());
            ps.setString(3, p.getDireccion());
            ps.setString(4, p.getTel());
            ps.setString(5, p.getEmail());
            ps.setString(6, p.getId());
            r=ps.executeUpdate();
            if (r==1){
                r=1;
            }else{
                r=0;
            }
        } catch (Exception e) {
            
        }
        return r;
    }
    
    public void delete(String id){
        String sql="delete from personal where idEmpleado="+id;
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            
        }
    }
    
}
