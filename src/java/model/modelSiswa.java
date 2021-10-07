/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Aan Furqan
 */
public class modelSiswa {
    private int id_siswa;
    private String nisn;
    private String nama_siswa;
    private String tempat_lahir;
    private String tgl_lahir;
    private String jns_kelamin;
    private String agama;
    private String alamat;
    private String no_hp;

    public modelSiswa(int id_siswa, String nisn, String nama_siswa, String tempat_lahir, String tgl_lahir, String jns_kelamin, String agama, String alamat, String no_hp) {
        this.id_siswa = id_siswa;
        this.nisn = nisn;
        this.nama_siswa = nama_siswa;
        this.tempat_lahir = tempat_lahir;
        this.tgl_lahir = tgl_lahir;
        this.jns_kelamin = jns_kelamin;
        this.agama = agama;
        this.alamat = alamat;
        this.no_hp = no_hp;
    }

    public modelSiswa(){
        
    }

   

    public int getId_siswa() {
        return id_siswa;
    }

    public void setId_siswa(int id_siswa) {
        this.id_siswa = id_siswa;
    }

    public String getNisn() {
        return nisn;
    }

    public void setNisn(String nisn) {
        this.nisn = nisn;
    }

    public String getNama_siswa() {
        return nama_siswa;
    }

    public void setNama_siswa(String nama_siswa) {
        this.nama_siswa = nama_siswa;
    }
    
    public String getTempat_lahir() {
        return tempat_lahir;
    }

    public void setTempat_lahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }
    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public String getJns_kelamin() {
        return jns_kelamin;
    }

    public void setJns_kelamin(String jns_kelamin) {
        this.jns_kelamin = jns_kelamin;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }
    
}
