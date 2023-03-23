package com.example.myapplication.database;

import  android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class Dbhelper extends SQLiteOpenHelper {
    private static final String DB_NAME="ACE";
    private static final int DB_VERSION=1;

    public Dbhelper(@Nullable Context context)   {
        super(context,DB_NAME,null,DB_VERSION);
    }

    static final String CREATE_TABLE_THU_THU =
            "CREATE TABLE ThuThu(" + "maTT text PRIMARY KEY," + "hoTen text NOT NULL," + "matKhau text NOT NULL" + ")";


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_THU_THU);
        db.execSQL(Data_SQLite.INSERT_THUTHU);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String dropTableLoaiThuThu = "drop table if exists ThuThu";
        db.execSQL(dropTableLoaiThuThu);
        //
        onCreate(db);
    }
}
