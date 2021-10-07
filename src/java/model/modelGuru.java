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
public class modelGuru {
    private int id_guru;
    private String no_peg;
    private String nama;
    private String jenis_kelamin;
    private String agama;
    private String alamat;
    private String no_hp;    
    
    public modelGuru (int id_guru, String no_peg, String nama, String kelamin, String agama, String alamat, String no_hp){
        this.id_guru = id_guru;
        this.no_peg = no_peg;
        this.nama = nama;
        this.jenis_kelamin = kelamin;
        this.agama = agama;
        this.alamat = alamat;
        this.no_hp = no_hp;
    }
    
    public modelGuru(){
        
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
     * @return the no_peg
     */
    public String getNo_peg() {
        return no_peg;
    }

    /**
     * @param no_peg the no_peg to set
     */
    public void setNo_peg(String no_peg) {
        this.no_peg = no_peg;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the jenis_kelamin
     */
    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    /**
     * @param jenis_kelamin the jenis_kelamin to set
     */
    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    /**
     * @return the agama
     */
    public String getAgama() {
        return agama;
    }

    /**
     * @param agama the agama to set
     */
    public void setAgama(String agama) {
        this.agama = agama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the no_hp
     */
    public String getNo_hp() {
        return no_hp;
    }

    /**
     * @param no_hp the no_hp to set
     */
    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }
    
    
    
}
