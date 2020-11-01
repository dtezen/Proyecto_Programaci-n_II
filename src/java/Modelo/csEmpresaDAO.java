package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class csEmpresaDAO {
    PreparedStatement ps;
    ResultSet rs;
    csConexion c = new csConexion();
    Connection con;
    
    public List listar(){
        List<csEmpresa>lista=new ArrayList<> ();
        String sql = "select * from empresa";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()) {
                csEmpresa p = new csEmpresa();
                p.setId(rs.getString(1));
                p.setNom(rs.getString(2));
                p.setDireccion(rs.getString(3));
                p.setTel(rs.getString(4));
                p.setEmail(rs.getString(5));
                lista.add(p);
            }
        } catch (Exception e) {
            
        }
        return lista;
    }
    
    public int agregarEmpresa(csEmpresa p){
        int r=0;
        String sql= "insert into empresa(idEmpresa,nombre,direccion,telefono,email) values(?,?,?,?,?)";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, p.getId());
            ps.setString(2, p.getNom());
            ps.setString(3, p.getDireccion());
            ps.setString(4, p.getTel());
            ps.setString(5, p.getEmail());
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
    
    public csEmpresa listarId(String id){
        String sql="select * from empresa where idEmpresa="+id;
        csEmpresa p=new csEmpresa();
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                p.setId(rs.getString(1));
                p.setNom(rs.getString(2));
                p.setDireccion(rs.getString(3));
                p.setTel(rs.getString(4));
                p.setEmail(rs.getString(5));
            }
        } catch (Exception e) {
            
        }
        return p;
    }
    
    public int actualizar(csEmpresa p){
        int r=0;
        String sql="update empresa set nombre=?, direccion=?, telefono=?, email=? where idEmpresa=?";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, p.getNom());
            ps.setString(2, p.getDireccion());
            ps.setString(3, p.getTel());
            ps.setString(4, p.getEmail());
            ps.setString(5, p.getId());
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
        String sql="delete from empresa where idEmpresa="+id;
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            
        }
    }
    
}
