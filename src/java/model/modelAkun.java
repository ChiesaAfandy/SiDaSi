/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Darell
 */
public class modelAkun {
    private int id_akun;
    private int id_guru;
    private String email;
    private String password;
    
    public modelAkun (int id_akun, int id_guru, String email, String password){
        this.id_akun = id_akun;
        this.id_guru = id_guru;
        this.email = email;
        this.password = password;
    }
    
    public modelAkun(){
        
    }

    /**
     * @return the id_akun
     */
    public int getId_akun() {
        return id_akun;
    }

    /**
     * @param id_akun the id_akun to set
     */
    public void setId_akun(int id_akun) {
        this.id_akun = id_akun;
    }

    /**
     * @return the id_guru
     */
    public int getId_guru() {
        return id_guru;
    }

    /**
     * @param id_guru the id_guru to set
     */
    public void setId_guru(int id_guru) {
        this.id_guru = id_guru;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
