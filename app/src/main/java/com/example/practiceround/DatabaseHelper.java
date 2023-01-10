package com.example.practiceround;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "hearts.db";
    private static final String go = "고릴라";
    private static final String ge = "개릴라";
    private static final String ba = "바닐라";



    public DatabaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //데이터 베이스가 생성될때 호출되는 곳
        db.execSQL("CREATE TABLE IF NOT EXISTS girlList(id Integer PRIMARY KEY AUTOINCREMENT, hart TEXT NOT NULL, scene TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    //select
    public ArrayList<Hart> getGirlsHart(){
        ArrayList<Hart> girlHart = new ArrayList<>();

        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM hart ORDER BY id desc", null);
        if (cursor.getCount() != 0){
            while(cursor.moveToNext()){
                @SuppressLint("Range") int id = cursor.getInt(cursor.getColumnIndex("id"));
                @SuppressLint("Range") String go_hart = cursor.getString(cursor.getColumnIndex("go_hart"));
                @SuppressLint("Range") String ge_hart = cursor.getString(cursor.getColumnIndex("ge_hart"));
                @SuppressLint("Range") String ba_hart = cursor.getString(cursor.getColumnIndex("ba_hart"));

                Hart hart = new Hart();
                hart.setId(id);
                hart.setGo_hart(go_hart);
                hart.setGe_hart(ge_hart);
                hart.setBa_hart(ba_hart);
                girlHart.add(hart);
            }
        }
        cursor.close();
        return girlHart;
    }

    //insert
    public void insertGirl(String _go_hart, String _ge_hart, String _ba_hart){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("INSERT INTO girlList(go_hart, ge_hart, ba_hart) VALUES('" + _go_hart + "', '" + _ge_hart + "', '" + _ba_hart + "'); ");
    }

    //update
    public void updateGirl(String _go_hart, String _ge_hart, String _ba_hart, int _id){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("UPDATE girlList SET go_hart = '"+ _go_hart+"', ge_hart = '"+ _ge_hart+"', ba_hart = '"+ _ba_hart+"', WHERE id = '"+ _id+"' ");
    }

    //delete
    public void delete(int _id){
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM girlList WHERE id = '"+ _id +"' ");
    }
}