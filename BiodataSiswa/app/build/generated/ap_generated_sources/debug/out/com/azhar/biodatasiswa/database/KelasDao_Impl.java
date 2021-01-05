package com.azhar.biodatasiswa.database;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.azhar.biodatasiswa.model.KelasModel;
import com.azhar.biodatasiswa.model.SiswaModel;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public final class KelasDao_Impl implements KelasDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfKelasModel;

  private final EntityInsertionAdapter __insertionAdapterOfSiswaModel;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfKelasModel;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfSiswaModel;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfKelasModel;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfSiswaModel;

  public KelasDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfKelasModel = new EntityInsertionAdapter<KelasModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `kelas`(`id_kelas`,`nama_kelas`,`nama_dosen`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, KelasModel value) {
        stmt.bindLong(1, value.getId_kelas());
        if (value.getNama_kelas() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNama_kelas());
        }
        if (value.getNama_dosen() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNama_dosen());
        }
      }
    };
    this.__insertionAdapterOfSiswaModel = new EntityInsertionAdapter<SiswaModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `tb_mahasiswa`(`id_mahasiswa`,`id_kelas`,`nama_mahasiswa`,`umBiodataSiswaur`,`NIM`,`jenis_kelamin`,`asal`,`email`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SiswaModel value) {
        stmt.bindLong(1, value.getId_mahasiswa());
        stmt.bindLong(2, value.getId_kelas());
        if (value.getNama_mahasiswa() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNama_mahasiswa());
        }
        if (value.getUmur() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUmur());
        }
        if (value.getNIM() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getNIM());
        }
        if (value.getJenis_kelamin() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getJenis_kelamin());
        }
        if (value.getAsal() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getAsal());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getEmail());
        }
      }
    };
    this.__deletionAdapterOfKelasModel = new EntityDeletionOrUpdateAdapter<KelasModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `kelas` WHERE `id_kelas` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, KelasModel value) {
        stmt.bindLong(1, value.getId_kelas());
      }
    };
    this.__deletionAdapterOfSiswaModel = new EntityDeletionOrUpdateAdapter<SiswaModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `tb_mahasiswa` WHERE `id_mahasiswa` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SiswaModel value) {
        stmt.bindLong(1, value.getId_mahasiswa());
      }
    };
    this.__updateAdapterOfKelasModel = new EntityDeletionOrUpdateAdapter<KelasModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `kelas` SET `id_kelas` = ?,`nama_kelas` = ?,`nama_dosen` = ? WHERE `id_kelas` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, KelasModel value) {
        stmt.bindLong(1, value.getId_kelas());
        if (value.getNama_kelas() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNama_kelas());
        }
        if (value.getNama_dosen() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNama_dosen());
        }
        stmt.bindLong(4, value.getId_kelas());
      }
    };
    this.__updateAdapterOfSiswaModel = new EntityDeletionOrUpdateAdapter<SiswaModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `tb_mahasiswa` SET `id_mahasiswa` = ?,`id_kelas` = ?,`nama_mahasiswa` = ?,`umBiodataSiswaur` = ?,`NIM` = ?,`jenis_kelamin` = ?,`asal` = ?,`email` = ? WHERE `id_mahasiswa` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SiswaModel value) {
        stmt.bindLong(1, value.getId_mahasiswa());
        stmt.bindLong(2, value.getId_kelas());
        if (value.getNama_mahasiswa() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNama_mahasiswa());
        }
        if (value.getUmur() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUmur());
        }
        if (value.getNIM() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getNIM());
        }
        if (value.getJenis_kelamin() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getJenis_kelamin());
        }
        if (value.getAsal() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getAsal());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getEmail());
        }
        stmt.bindLong(9, value.getId_mahasiswa());
      }
    };
  }

  @Override
  public void insert(KelasModel kelasModel) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfKelasModel.insert(kelasModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertMahasiswa(SiswaModel siswaModel) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfSiswaModel.insert(siswaModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(KelasModel kelasModel) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfKelasModel.handle(kelasModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteMahasiswa(SiswaModel siswaModel) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfSiswaModel.handle(siswaModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(KelasModel kelasModel) {
    __db.beginTransaction();
    try {
      __updateAdapterOfKelasModel.handle(kelasModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateMahasiswa(SiswaModel siswaModel) {
    __db.beginTransaction();
    try {
      __updateAdapterOfSiswaModel.handle(siswaModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<KelasModel> select() {
    final String _sql = "SELECT * FROM KELAS ORDER BY nama_kelas ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfIdKelas = _cursor.getColumnIndexOrThrow("id_kelas");
      final int _cursorIndexOfNamaKelas = _cursor.getColumnIndexOrThrow("nama_kelas");
      final int _cursorIndexOfNamaDosen = _cursor.getColumnIndexOrThrow("nama_dosen");
      final List<KelasModel> _result = new ArrayList<KelasModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final KelasModel _item;
        _item = new KelasModel();
        final int _tmpId_kelas;
        _tmpId_kelas = _cursor.getInt(_cursorIndexOfIdKelas);
        _item.setId_kelas(_tmpId_kelas);
        final String _tmpNama_kelas;
        _tmpNama_kelas = _cursor.getString(_cursorIndexOfNamaKelas);
        _item.setNama_kelas(_tmpNama_kelas);
        final String _tmpNama_dosen;
        _tmpNama_dosen = _cursor.getString(_cursorIndexOfNamaDosen);
        _item.setNama_dosen(_tmpNama_dosen);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<SiswaModel> selectMahasiswa(int id_kelas) {
    final String _sql = "SELECT * FROM TB_MAHASISWA WHERE id_kelas = ? ORDER BY nama_mahasiswa ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id_kelas);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfIdMahasiswa = _cursor.getColumnIndexOrThrow("id_mahasiswa");
      final int _cursorIndexOfIdKelas = _cursor.getColumnIndexOrThrow("id_kelas");
      final int _cursorIndexOfNamaMahasiswa = _cursor.getColumnIndexOrThrow("nama_mahasiswa");
      final int _cursorIndexOfUmur = _cursor.getColumnIndexOrThrow("umBiodataSiswaur");
      final int _cursorIndexOfNIM = _cursor.getColumnIndexOrThrow("NIM");
      final int _cursorIndexOfJenisKelamin = _cursor.getColumnIndexOrThrow("jenis_kelamin");
      final int _cursorIndexOfAsal = _cursor.getColumnIndexOrThrow("asal");
      final int _cursorIndexOfEmail = _cursor.getColumnIndexOrThrow("email");
      final List<SiswaModel> _result = new ArrayList<SiswaModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SiswaModel _item;
        _item = new SiswaModel();
        final int _tmpId_mahasiswa;
        _tmpId_mahasiswa = _cursor.getInt(_cursorIndexOfIdMahasiswa);
        _item.setId_mahasiswa(_tmpId_mahasiswa);
        final int _tmpId_kelas;
        _tmpId_kelas = _cursor.getInt(_cursorIndexOfIdKelas);
        _item.setId_kelas(_tmpId_kelas);
        final String _tmpNama_mahasiswa;
        _tmpNama_mahasiswa = _cursor.getString(_cursorIndexOfNamaMahasiswa);
        _item.setNama_mahasiswa(_tmpNama_mahasiswa);
        final String _tmpUmur;
        _tmpUmur = _cursor.getString(_cursorIndexOfUmur);
        _item.setUmur(_tmpUmur);
        final String _tmpNIM;
        _tmpNIM = _cursor.getString(_cursorIndexOfNIM);
        _item.setNIM(_tmpNIM);
        final String _tmpJenis_kelamin;
        _tmpJenis_kelamin = _cursor.getString(_cursorIndexOfJenisKelamin);
        _item.setJenis_kelamin(_tmpJenis_kelamin);
        final String _tmpAsal;
        _tmpAsal = _cursor.getString(_cursorIndexOfAsal);
        _item.setAsal(_tmpAsal);
        final String _tmpEmail;
        _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        _item.setEmail(_tmpEmail);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
