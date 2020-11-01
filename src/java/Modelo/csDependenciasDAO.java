package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class csDependenciasDAO {
    PreparedStatement ps;
    ResultSet rs;
    csConexion c = new csConexion();
    Connection con;
    
    public List listar(){
        List<csDependencias>lista=new ArrayList<> ();
        String sql = "select dependencia.idDependencia, unidadAdministrativa.nombre, dependencia.nombre, dependencia.descripcion, dependencia.telefono, dependencia.email from unidadAdministrativa join dependencia on unidadAdministrativa.idUnidadAdmin=dependencia.idUnidadAdmin";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()) {
                csDependencias p = new csDependencias();
                p.setId(rs.getString(1));
                p.setUadmin(rs.getString(2));
                p.setNom(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setTel(rs.getString(5));
                p.setEmail(rs.getString(6));
                lista.add(p);
            }
        } catch (Exception e) {
            
        }
        return lista;
    }
    
    public int agregarDependencia(csDependencias p){
        int r=0;
        String sql= "insert into dependencia(idDependencia,idUnidadAdmin,nombre,descripcion,telefono,email) values(?,?,?,?,?,?)";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, p.getId());
            ps.setString(2, p.getUadmin());
            ps.setString(3, p.getNom());
            ps.setString(4, p.getDescripcion());
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
    
    public csDependencias listarId(String id){
        String sql="select * from dependencia where idDependencia="+id;
        csDependencias p=new csDependencias();
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                p.setId(rs.getString(1));
                p.setUadmin(rs.getString(2));
                p.setNom(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setTel(rs.getString(5));
                p.setEmail(rs.getString(6));
            }
        } catch (Exception e) {
            
        }
        return p;
    }
    
    public int actualizar(csDependencias p){
        int r=0;
        String sql="update dependencia set idUnidadAdmin=?, nombre=?, descripcion=?, telefono=?, email=? where idDependencia=?";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, p.getUadmin());
            ps.setString(2, p.getNom());
            ps.setString(3, p.getDescripcion());
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
        String sql="delete from dependencia where idDependencia="+id;
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            
        }
    }
    
}
