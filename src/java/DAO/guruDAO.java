/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.modelGuru;

/**
 *
 * @author user
 */
public class guruDAO {
    static Connection conn;
    static PreparedStatement ps;
    static String sql;
    static ResultSet rs;
    
    public void insertData(modelGuru data){
        
        try{
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("INSERT INTO `data_guru`( `no_peg`, `nama`, `jenis_kelamin`, `agama`, `alamat`, `no_hp`) VALUES (?,?,?,?,?,?)");
            ps.setString(1, data.getNo_peg());
            ps.setString(2, data.getNama());
            ps.setString(3, data.getJenis_kelamin());
            ps.setString(4, data.getAgama());
            ps.setString(5, data.getAlamat());           
            ps.setString(6, data.getNo_hp());                   
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public List<modelGuru> showAllData() throws SQLException {

	List<modelGuru> guru = new ArrayList<>();
	try {
             conn = new DBConnection().setConnection();
             ps = conn.prepareStatement("select * from data_guru");
             rs = ps.executeQuery();
            while(rs.next()) {
                modelGuru u = new modelGuru();
                u.setId_guru(rs.getInt("id_guru"));
                u.setNo_peg(rs.getString("no_peg"));
                u.setNama(rs.getString("nama"));
                u.setJenis_kelamin(rs.getString("jenis_kelamin"));
                u.setAgama(rs.getString("agama"));
                u.setAlamat(rs.getString("alamat"));
                u.setNo_hp(rs.getString("no_hp"));
                guru.add(u);
            } 
           }catch (Exception e) {
                System.out.println(e);
            }
        return guru;
    }
     public static modelGuru getDataById(int id_guru){
          modelGuru u = null;
          try{
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("select * from data_guru where id_guru=?");
            ps.setInt(1, id_guru);
            rs = ps.executeQuery();
            while (rs.next()) {
                u = new modelGuru();
                u.setNo_peg(rs.getString("no_peg"));
                u.setNama(rs.getString("nama"));
                u.setJenis_kelamin(rs.getString("jenis_kelamin"));
                u.setAgama(rs.getString("agama"));
                u.setAlamat(rs.getString("alamat"));
                u.setNo_hp(rs.getString("no_hp"));
            }
        }catch (Exception e) {
            System.out.println(e);
        }
          return u;
     }
     public void editData(modelGuru data){
          try{
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("update data_guru set no_peg=?, nama=?, jenis_kelamin=?, agama=?, alamat=?, no_hp=? where id_guru=?");
            ps.setString(1, data.getNo_peg());
            ps.setString(2, data.getNama());
            ps.setString(3, data.getJenis_kelamin());
            ps.setString(4, data.getAgama());
            ps.setString(5, data.getAlamat());           
            ps.setString(6, data.getNo_hp());                   
            ps.executeUpdate();
          }catch (Exception e) {
            System.out.println(e);
        }
      }
      public void deleteData(int id_guru){
          try{
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("delete from data_guru where id_guru=?");
            ps.setInt(1, id_guru);
            ps.executeUpdate();
          } catch (Exception e) {
            System.out.println(e);
        }
      }
}
    
