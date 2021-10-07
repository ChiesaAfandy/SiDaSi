    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.mapelDAO.rs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.modelKelas;

/**
 *
 * @author user
 */
public class kelasDAO {
    static Connection conn;
    static PreparedStatement ps;
    static String sql;
    static ResultSet rs;
    
    
    
      public void insertData(modelKelas data){
        
        try{
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("INSERT INTO `data_kelas`( `kelas`, `walikelas`) VALUES (?,?)");   
            ps.setString(1, data.getKelas());
            ps.setString(2, data.getWalikelas());                   
            ps.executeUpdate();
        } catch (SQLException e) {
            
            System.out.println(e);
        }
    }
      
      public List<modelKelas> showAllData() throws SQLException {

	List<modelKelas> modelkelas = new ArrayList<>();
	try {
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("select * from data_kelas");
            rs = ps.executeQuery();
            while(rs.next()) {
                modelKelas u = new modelKelas();
                u.setId_kelas(rs.getInt("id_kelas"));
                u.setKelas(rs.getString("kelas"));
                u.setWalikelas(rs.getString("walikelas"));      
                modelkelas.add(u);
            } 
           }catch (Exception e) {
                System.out.println(e);
            }
        return modelkelas;
    }
      
      public static modelKelas getDataById(int id_kelas){
          modelKelas u = null;
          try{
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("select * from data_kelas where id_kelas=?");
            ps.setInt(1, id_kelas);
            rs = ps.executeQuery();
            while (rs.next()) {
                u = new modelKelas();
                u.setKelas(rs.getString("kelas"));
                u.setWalikelas(rs.getString("walikelas"));
            }
        }catch (Exception e) {
            System.out.println(e);
        }
          return u;
    }
      public void editData(modelKelas data){
          try{
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("update data_kelas set kelas=?, walikelas=? where id_kelas=?");
            ps.setString(1, data.getKelas());
            ps.setString(2, data.getWalikelas());    
            ps.setInt(3, data.getId_kelas());
            ps.executeUpdate();
          }catch (Exception e) {
            System.out.println(e);
        }
      }
      public void deleteData(int id_kelas){
          try{
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("delete from data_kelas where id_kelas=?");
            ps.setInt(1, id_kelas);
            ps.executeUpdate();
          } catch (Exception e) {
            System.out.println(e);
        }
      }
}
