package com.example.recyclerview;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


@Database(entities = {Correo.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase{
    private static final String DB_NAME = "correo.db";
    private static AppDatabase INSTANCIA = null;

    public static AppDatabase getInstance(Context context){
        if (INSTANCIA == null){
            synchronized (AppDatabase.class){
                INSTANCIA = Room.databaseBuilder(context.getApplicationContext(),
                        AppDatabase.class,
                        DB_NAME)
                        .allowMainThreadQueries()
                        .build();
            }
        }
        return  INSTANCIA;

    }

    public abstract CorreoDAO correoDAO();

}
