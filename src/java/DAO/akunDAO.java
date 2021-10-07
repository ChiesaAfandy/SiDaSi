/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.modelAkun;

/**
 *
 * @author user
 */
public class akunDAO {
  public void insertData(modelAkun data){
        
        try{
            Connection conn = new DBConnection().setConnection();
            PreparedStatement ps = conn.prepareStatement("insert into data_akun(id_guru, email, password) values(?,?,?)");
            ps.setInt(1, data.getId_guru());
            ps.setString(2, data.getEmail());
            ps.setString(3, data.getPassword());
        } catch (SQLException e) {
            System.out.println(e);
            }
        }       
  
  public void editData(modelAkun data){
        try{
            Connection conn = new DBConnection().setConnection();
            PreparedStatement ps = conn.prepareStatement("update data_akun set id_guru=?, email=?, password=? where id_akun=?");
            ps.setInt(1, data.getId_guru());
            ps.setString(2, data.getEmail());
            ps.setString(3, data.getPassword());
        } catch (SQLException e) {
            System.out.println(e);
            }
        }       
}
