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
import model.modelSiswa;

/**
 *
 * @author Aan Furqan
 */
public class siswaDAO {
    static Connection conn;
    static PreparedStatement ps;
    static String sql;
    static ResultSet rs;
    
    
    
      public void insertData(modelSiswa data){
        
        try{
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("INSERT INTO `data_siswa`( `nisn`, `nama_siswa`, `tempat_lahir`, `tgl_lahir`, `jns_kelamin`, `agama`, `alamat`, `no_hp`) VALUES (?,?,?,?,?,?,?,?)");   
            ps.setString(1, data.getNisn());
            ps.setString(2, data.getNama_siswa());
            ps.setString(3, data.getTempat_lahir());
            ps.setString(4, data.getTgl_lahir());
            ps.setString(5, data.getJns_kelamin());           
            ps.setString(6, data.getAgama());           
            ps.setString(7, data.getAlamat());           
            ps.setString(8, data.getNo_hp());           
            ps.executeUpdate();
        } catch (SQLException e) {
            
            System.out.println(e);
        }
    }
      
      public List<modelSiswa> showAllData() throws SQLException {

	List<modelSiswa> siswa = new ArrayList<>();
	try {
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("select * from data_siswa");
            rs = ps.executeQuery();
            while(rs.next()) {
                modelSiswa u = new modelSiswa();
                u.setId_siswa(rs.getInt("id_siswa"));
                u.setNisn(rs.getString("nisn"));
                u.setNama_siswa(rs.getString("nama_siswa"));
                u.setTempat_lahir(rs.getString("tempat_lahir"));
                u.setTgl_lahir(rs.getString("tgl_lahir"));
                u.setJns_kelamin(rs.getString("jns_kelamin"));
                u.setAgama(rs.getString("agama"));
                u.setAlamat(rs.getString("alamat"));
                u.setNo_hp(rs.getString("no_hp"));
                siswa.add(u);
            } 
           }catch (Exception e) {
                System.out.println(e);
            }
        return siswa;
    }
      
      public static modelSiswa getDataById(int id_siswa){
          modelSiswa u = null;
          try{
            conn = new DBConnection().setConnection();
            ps = conn.prepareStatement("select * from data_siswa where id_siswa=?");
            ps.setInt(1, id_siswa);
            rs = ps.executeQuery();
            while (rs.next()) {
                u = new modelSiswa();
                u.setNisn(rs.getString("nisn"));
                u.setNama_siswa(rs.getString("nama_siswa"));
                u.setTempat_lahir(rs.getString("tempat_lahir"));
                u.setTgl_lahir(rs.getString("tgl_lahir"));
                u.setJns_kelamin(rs.getString("jns_kelamin"));
                u.setAgama(rs.getString("agama"));
                u.setAlamat(rs.getString("alamat"));
                u.setNo_hp(rs.getString("no_hp"));
            }
        }catch (Exception e) {
            System.out.println(e);
        }
          return u;
    }
      public void editData(modelSiswa data){
          try{
             conn = new DBConnection().setConnection();
             ps = conn.prepareStatement("update data_siswa set nisn=?, nama_siswa=?, tempat_lahir=?, tgl_lahir=?, jns_kelamin=?, agama=?, alamat=?, no_hp=? where id_siswa=?");
            ps.setString(1, data.getNisn());
            ps.setString(2, data.getNama_siswa());
            ps.setString(3, data.getTempat_lahir());
            ps.setString(4, data.getTgl_lahir());
            ps.setString(5, data.getJns_kelamin());           
            ps.setString(6, data.getAgama());           
            ps.setString(7, data.getAlamat());           
            ps.setString(8, data.getNo_hp());    
            ps.setInt(9, data.getId_siswa());
            ps.executeUpdate();
          }catch (Exception e) {
            System.out.println(e);
        }
      }
      public void deleteData(int id_siswa){
          try{
            conn = new DBConnection().setConnection();
             ps = conn.prepareStatement("delete from data_siswa where id_siswa=?");
            ps.setInt(1, id_siswa);
            ps.executeUpdate();
          } catch (Exception e) {
            System.out.println(e);
        }
      }
}
