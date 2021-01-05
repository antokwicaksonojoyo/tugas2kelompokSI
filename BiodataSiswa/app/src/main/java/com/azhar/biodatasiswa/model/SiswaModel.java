package com.azhar.biodatasiswa.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.azhar.biodatasiswa.database.Constant;


@Entity(tableName = "tb_mahasiswa")

public class SiswaModel {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_mahasiswa")
    private int id_mahasiswa;

    @ColumnInfo(name = Constant.id_kelas)
    private int id_kelas;

    @ColumnInfo(name = "nama_mahasiswa")
    private String nama_mahasiswa;

    @ColumnInfo(name = "umBiodataSiswaur")
    private String umur;

    @ColumnInfo(name = "NIM")
    private String NIM;

    @ColumnInfo(name = "jenis_kelamin")
    private String jenis_kelamin;

    @ColumnInfo(name = "asal")
    private String asal;

    @ColumnInfo(name = "email")
    private String email;

    public int getId_mahasiswa() {
        return id_mahasiswa;
    }

    public void setId_mahasiswa(int id_mahasiswa) {
        this.id_mahasiswa = id_mahasiswa;
    }

    public int getId_kelas() {
        return id_kelas;
    }

    public void setId_kelas(int id_kelas) {
        this.id_kelas = id_kelas;
    }

    public String getNama_mahasiswa() {
        return nama_mahasiswa;
    }

    public void setNama_mahasiswa(String nama_mahasiswa) {
        this.nama_mahasiswa = nama_mahasiswa;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.umur = NIM;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
