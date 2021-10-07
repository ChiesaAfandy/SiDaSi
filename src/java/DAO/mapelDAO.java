/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.guruDAO.conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.modelGuru;
import model.modelMapel;

/**
 *
 * @author user
 */
public class mapelDAO {
    static Connection conn;
    static PreparedStatement ps;
    static String sql;
    static ResultSet rs;
    
    
    
      public void insertData(modelMapel data){       
        try{
            conn = (Connection) new DBConnection().setConnection();
            ps = conn.prepareStatement("INSERT INTO `data_mapel`( `id_guru`, `nama_mapel`) VALUES (?,?)");   
            ps.setInt(1, data.getId_guru());
            ps.setString(2, data.getNama_mapel());                   
            ps.executeUpdate();
        } catch (SQLException e) {
            
            System.out.println(e);
        }
    }
      
      public List<modelMapel> showAllData() throws SQLException {

	List<modelMapel> mapel = new ArrayList<>();
	try {
             conn = new DBConnection().setConnection();
             ps = conn.prepareStatement("select * from data_mapel");
             rs = ps.executeQuery();
            while(rs.next()) {
                modelMapel u = new modelMapel();
                u.setId_mapel(rs.getInt("id_mapel"));
                u.setId_guru(rs.getInt("id_guru"));
                u.setNama_mapel(rs.getString("nama_mapel"));
                mapel.add(u);
            } 
           }catch (Exception e) {
                System.out.println(e);
            }
        return mapel;
    }
      
      public static modelMapel getDataById(int id_mapel){
          modelMapel u = null;
          try{
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("select * from data_mapel where id_mapel=?");
            ps.setInt(1, id_mapel);
            rs = ps.executeQuery();
            while (rs.next()) {
                u = new modelMapel();
                u.setId_guru(rs.getInt("id_guru"));
                u.setNama_mapel(rs.getString("nama_mapel"));
            }
        }catch (Exception e) {
            System.out.println(e);
        }
          return u;
    }
      public void editData(modelMapel data){
          try{
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("update data_mapel set id_guru=?, nama_mapel=? where id_mapel=?");
            ps.setInt(1, data.getId_guru());
            ps.setString(2, data.getNama_mapel());    
            ps.setInt(3, data.getId_mapel());
            ps.executeUpdate();
          }catch (Exception e) {
            System.out.println(e);
        }
      }
      public void deleteData(int id_mapel){
          try{
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("delete from data_mapel where id_mapel=?");
            ps.setInt(1, id_mapel);
            ps.executeUpdate();
          } catch (Exception e) {
            System.out.println(e);
        }
      } 
}
