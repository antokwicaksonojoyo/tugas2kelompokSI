package com.azhar.biodatasiswa.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public final class SiswaDatabase_Impl extends SiswaDatabase {
  private volatile KelasDao _kelasDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `kelas` (`id_kelas` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `nama_kelas` TEXT, `nama_dosen` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `tb_mahasiswa` (`id_mahasiswa` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `id_kelas` INTEGER NOT NULL, `nama_mahasiswa` TEXT, `umBiodataSiswaur` TEXT, `NIM` TEXT, `jenis_kelamin` TEXT, `asal` TEXT, `email` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"42c041757ba51e99a8a09563dfc95735\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `kelas`");
        _db.execSQL("DROP TABLE IF EXISTS `tb_mahasiswa`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsKelas = new HashMap<String, TableInfo.Column>(3);
        _columnsKelas.put("id_kelas", new TableInfo.Column("id_kelas", "INTEGER", true, 1));
        _columnsKelas.put("nama_kelas", new TableInfo.Column("nama_kelas", "TEXT", false, 0));
        _columnsKelas.put("nama_dosen", new TableInfo.Column("nama_dosen", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysKelas = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesKelas = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoKelas = new TableInfo("kelas", _columnsKelas, _foreignKeysKelas, _indicesKelas);
        final TableInfo _existingKelas = TableInfo.read(_db, "kelas");
        if (! _infoKelas.equals(_existingKelas)) {
          throw new IllegalStateException("Migration didn't properly handle kelas(com.azhar.biodatasiswa.model.KelasModel).\n"
                  + " Expected:\n" + _infoKelas + "\n"
                  + " Found:\n" + _existingKelas);
        }
        final HashMap<String, TableInfo.Column> _columnsTbMahasiswa = new HashMap<String, TableInfo.Column>(8);
        _columnsTbMahasiswa.put("id_mahasiswa", new TableInfo.Column("id_mahasiswa", "INTEGER", true, 1));
        _columnsTbMahasiswa.put("id_kelas", new TableInfo.Column("id_kelas", "INTEGER", true, 0));
        _columnsTbMahasiswa.put("nama_mahasiswa", new TableInfo.Column("nama_mahasiswa", "TEXT", false, 0));
        _columnsTbMahasiswa.put("umBiodataSiswaur", new TableInfo.Column("umBiodataSiswaur", "TEXT", false, 0));
        _columnsTbMahasiswa.put("NIM", new TableInfo.Column("NIM", "TEXT", false, 0));
        _columnsTbMahasiswa.put("jenis_kelamin", new TableInfo.Column("jenis_kelamin", "TEXT", false, 0));
        _columnsTbMahasiswa.put("asal", new TableInfo.Column("asal", "TEXT", false, 0));
        _columnsTbMahasiswa.put("email", new TableInfo.Column("email", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTbMahasiswa = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTbMahasiswa = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTbMahasiswa = new TableInfo("tb_mahasiswa", _columnsTbMahasiswa, _foreignKeysTbMahasiswa, _indicesTbMahasiswa);
        final TableInfo _existingTbMahasiswa = TableInfo.read(_db, "tb_mahasiswa");
        if (! _infoTbMahasiswa.equals(_existingTbMahasiswa)) {
          throw new IllegalStateException("Migration didn't properly handle tb_mahasiswa(com.azhar.biodatasiswa.model.SiswaModel).\n"
                  + " Expected:\n" + _infoTbMahasiswa + "\n"
                  + " Found:\n" + _existingTbMahasiswa);
        }
      }
    }, "42c041757ba51e99a8a09563dfc95735", "af0b9e2c87a40327640ae532e460133b");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "kelas","tb_mahasiswa");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `kelas`");
      _db.execSQL("DELETE FROM `tb_mahasiswa`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public KelasDao kelasDao() {
    if (_kelasDao != null) {
      return _kelasDao;
    } else {
      synchronized(this) {
        if(_kelasDao == null) {
          _kelasDao = new KelasDao_Impl(this);
        }
        return _kelasDao;
      }
    }
  }
}
