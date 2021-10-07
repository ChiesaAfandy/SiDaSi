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
public class modelKelas {
    private int id_kelas;
    private String kelas;
    private String walikelas;

    public modelKelas(int id_kelas, String kelas, String walikelas) {
        this.id_kelas = id_kelas;
        this.kelas = kelas;
        this.walikelas = walikelas;
    }

    public modelKelas() {
       
    }

    public modelKelas(int i, modelKelas kelas, String walikelas) {
        
    }


    public int getId_kelas() {
        return id_kelas;
    }

    public void setId_kelas(int id_kelas) {
        this.id_kelas = id_kelas;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getWalikelas() {
        return walikelas;
    }

    public void setWalikelas(String walikelas) {
        this.walikelas = walikelas;
    }
    
       
}
