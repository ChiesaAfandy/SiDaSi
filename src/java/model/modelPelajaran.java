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
public class modelPelajaran {
    private int id_kelas;
    private int id_guru;
    private int id_siswa;
    private int nilai;
    
    public modelPelajaran(int id_kelas, int id_guru, int id_siswa, int nilai){
        this.id_kelas = id_kelas;
        this.id_guru = id_guru;
        this.id_siswa = id_siswa;
        this.nilai = nilai;
    }
    
    public modelPelajaran(){
        
    }

    /**
     * @return the id_kelas
     */
    public int getId_kelas() {
        return id_kelas;
    }

    /**
     * @param id_kelas the id_kelas to set
     */
    public void setId_kelas(int id_kelas) {
        this.id_kelas = id_kelas;
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
     * @return the id_siswa
     */
    public int getId_siswa() {
        return id_siswa;
    }

    /**
     * @param id_siswa the id_siswa to set
     */
    public void setId_siswa(int id_siswa) {
        this.id_siswa = id_siswa;
    }

    /**
     * @return the nilai
     */
    public int getNilai() {
        return nilai;
    }

    /**
     * @param nilai the nilai to set
     */
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    
    
    
}
