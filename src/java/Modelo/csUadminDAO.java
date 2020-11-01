package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class csUadminDAO {
    PreparedStatement ps;
    ResultSet rs;
    csConexion c = new csConexion();
    Connection con;
    
    public List listar(){
        List<csUadmin>lista=new ArrayList<> ();
        String sql = "select unidadAdministrativa.idUnidadAdmin, empresa.nombre, unidadAdministrativa.nombre, unidadAdministrativa.descripcion, unidadAdministrativa.telefono, unidadAdministrativa.email from unidadAdministrativa join empresa on unidadAdministrativa.idEmpresa=empresa.idEmpresa";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()) {
                csUadmin p = new csUadmin();
                p.setId(rs.getString(1));
                p.setEmpresa(rs.getString(2));
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
    
    public int agregarUadmin(csUadmin p){
        int r=0;
        String sql= "insert into unidadAdministrativa(idUnidadAdmin,idEmpresa,nombre,descripcion,telefono,email) values(?,?,?,?,?,?)";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, p.getId());
            ps.setString(2, p.getEmpresa());
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
    
    public csUadmin listarId(String id){
        String sql="select * from unidadAdministrativa where idUnidadAdmin="+id;
        csUadmin p=new csUadmin();
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                p.setId(rs.getString(1));
                p.setEmpresa(rs.getString(2));
                p.setNom(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setTel(rs.getString(5));
                p.setEmail(rs.getString(6));
            }
        } catch (Exception e) {
            
        }
        return p;
    }
    
    public int actualizar(csUadmin p){
        int r=0;
        String sql="update unidadAdministrativa set idEmpresa=?, nombre=?, descripcion=?, telefono=?, email=? where idUnidadAdmin=?";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, p.getEmpresa());
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
        String sql="delete from unidadAdministrativa where idUnidadAdmin="+id;
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            
        }
    }
    
}
