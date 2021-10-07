/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author user
 */
public class modelMapel {

    private int id_mapel;
    private int id_guru;
    private String nama_mapel;

    public modelMapel(int id_mapel, int id_guru, String nama_mapel) {
        this.id_mapel = id_mapel;
        this.id_guru = id_guru;
        this.nama_mapel = nama_mapel;
    }

    public modelMapel() {
        
        
    }

    public int getId_mapel() {
        return id_mapel;
    }

    public void setId_mapel(int id_mapel) {
        this.id_mapel = id_mapel;
    }

    public int getId_guru() {
        return id_guru;
    }

    public void setId_guru(int id_guru) {
        this.id_guru = id_guru;
    }

    public String getNama_mapel() {
        return nama_mapel;
    }

    public void setNama_mapel(String nama_mapel) {
        this.nama_mapel = nama_mapel;
    }
    
}
