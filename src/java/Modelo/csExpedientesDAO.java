package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class csExpedientesDAO {
    PreparedStatement ps;
    ResultSet rs;
    csConexion c = new csConexion();
    Connection con;
    
    public List listar(){
        List<csExpedientes>lista=new ArrayList<> ();
        String sql = "select expediente.idExpediente, tipoExpediente.nombre, flujo.nombre, dependencia.nombre, expediente.fecha, expediente.estadoExpediente from expediente join tipoExpediente on expediente.idTipoExpediente=tipoExpediente.idTipoExpediente join flujo on expediente.idFlujo=flujo.idFlujo join dependencia on expediente.idDependencia=dependencia.idDependencia";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()) {
                csExpedientes p = new csExpedientes();
                p.setId(rs.getString(1));
                p.setTipo(rs.getString(2));
                p.setFlujo(rs.getString(3));
                p.setDependencia(rs.getString(4));
                p.setFecha(rs.getString(5));
                p.setEstado(rs.getString(6));
                lista.add(p);
            }
        } catch (Exception e) {
            
        }
        return lista;
    }
    
    public int agregarExpediente(csExpedientes p){
        int r=0;
        String sql= "insert into expediente(idExpediente,idTipoExpediente,idFlujo,idDependencia,fecha,estadoExpediente) values(?,?,?,?,?,?)";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, p.getId());
            ps.setString(2, p.getTipo());
            ps.setString(3, p.getFlujo());
            ps.setString(4, p.getDependencia());
            ps.setString(5, p.getFecha());
            ps.setString(6, p.getEstado());
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
    
    public csExpedientes listarId(String id){
        String sql="select * from expediente where idExpediente="+id;
        csExpedientes p=new csExpedientes();
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                p.setId(rs.getString(1));
                p.setTipo(rs.getString(2));
                p.setFlujo(rs.getString(3));
                p.setDependencia(rs.getString(4));
                p.setFecha(rs.getString(5));
                p.setEstado(rs.getString(6));
            }
        } catch (Exception e) {
            
        }
        return p;
    }
    
    public int actualizar(csExpedientes p){
        int r=0;
        String sql="update expediente set idTipoExpediente=?, idFlujo=?, idDependencia=?, fecha=?, estadoExpediente=? where idExpediente=?";
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, p.getTipo());
            ps.setString(2, p.getFlujo());
            ps.setString(3, p.getDependencia());
            ps.setString(4, p.getFecha());
            ps.setString(5, p.getEstado());
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
        String sql="delete from expediente where idExpediente="+id;
        try {
            con=c.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            
        }
    }
    
}
