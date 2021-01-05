package com.azhar.biodatasiswa.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.azhar.biodatasiswa.model.KelasModel;
import com.azhar.biodatasiswa.model.SiswaModel;

import java.util.List;


@Dao
public interface KelasDao {

    // Mengambil data
    @Query("SELECT * FROM KELAS ORDER BY nama_kelas ASC")
    List<KelasModel> select();

    // Memasukkan data
    @Insert
    void insert(KelasModel kelasModel);

    // Menghapus data
    @Delete
    void delete(KelasModel kelasModel);

    // Mengupdate data
    @Update
    void update(KelasModel kelasModel);

    // Mengambil data mahasiswa
    @Query("SELECT * FROM TB_MAHASISWA WHERE id_kelas = :id_kelas ORDER BY nama_mahasiswa ASC")
    List<SiswaModel> selectMahasiswa(int id_kelas);

    // Memasukkan data mahasiswa
    @Insert
    void insertMahasiswa(SiswaModel siswaModel);

    // Menghapus data Mahasiswa
    @Delete
    void deleteMahasiswa(SiswaModel siswaModel);

    // Mengupdate data
    @Update
    void updateMahasiswa(SiswaModel siswaModel);
}
