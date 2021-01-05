package com.azhar.biodatasiswa.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.azhar.biodatasiswa.database.Constant;



@Entity(tableName = Constant.nama_table)

public class KelasModel {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = Constant.id_kelas)
    private int id_kelas;

    @ColumnInfo(name = Constant.nama_kelas)
    private String nama_kelas;

    @ColumnInfo(name = Constant.nama_dosen)
    private String nama_dosen;

    public int getId_kelas() {
        return id_kelas;
    }

    public void setId_kelas(int id_kelas) {
        this.id_kelas = id_kelas;
    }

    public String getNama_kelas() {
        return nama_kelas;
    }

    public void setNama_kelas(String nama_kelas) {
        this.nama_kelas = nama_kelas;
    }

    public String getNama_dosen() {
        return nama_dosen;
    }

    public void setNama_dosen(String nama_dosen) {
        this.nama_dosen = nama_dosen;
    }
}
