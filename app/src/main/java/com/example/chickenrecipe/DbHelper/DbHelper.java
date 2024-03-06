package com.example.chickenrecipe.DbHelper;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


import com.example.chickenrecipe.Model.Favorite;

import java.util.ArrayList;

public class DbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Recipes";
    public static int DATABASE_VERSION = 3;

    private static DbHelper instance;

    public static DbHelper getInstance(Context context) {
        if (instance == null) {
            instance = new DbHelper(context);
        }
        return instance;
    }

    public DbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Favorite.CREATE_FAVORITE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion != newVersion) {
            db.execSQL(Favorite.DROP_FAVORITE_TABLE);
            db.execSQL(Favorite.CREATE_FAVORITE_TABLE);
        }
    }

    // ----->>> CRUD OPERATIONS
    public boolean insertRecipe(int position, String title, String listType) {
        SQLiteDatabase database = getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(Favorite.KEY_POSITION, position);
        values.put(Favorite.KEY_TITLE, title);
        values.put(Favorite.KEY_LIST_TYPE, listType);

        long effectRows = -1;
        try {
            effectRows = database.insert(Favorite.FAVORITE_TABLE, null, values);
        } catch (Exception ex) {
            return false;
        }

        return effectRows == 1;
    }

    public boolean deleteRecipe(int id) {
        SQLiteDatabase database = getWritableDatabase();

        long effectRows = -1;
        try {
            effectRows = database.delete(Favorite.FAVORITE_TABLE, Favorite.KEY_ID + "=?", new String[]{String.valueOf(id)});
        } catch (Exception ex) {
            return false;
        }

        return effectRows == 1;
    }

    public boolean deleteRecipe(String title) {
        SQLiteDatabase database = getWritableDatabase();

        long effectRows = -1;
        try {
            effectRows = database.delete(Favorite.FAVORITE_TABLE, Favorite.KEY_TITLE + "=?", new String[]{title});
        } catch (Exception ex) {
            return false;
        }

        return effectRows == 1;
    }

    public boolean deleteAllRecipe() {
        SQLiteDatabase database = getWritableDatabase();

        long effectRows = -1;
        try {
            effectRows = database.delete(Favorite.FAVORITE_TABLE, null, null);
        } catch (Exception ex) {
            return false;
        }

        return effectRows == 1;
    }

    @SuppressLint("Range")
    public ArrayList<Favorite> getAllRecipe() {
        SQLiteDatabase database = getReadableDatabase();
        Cursor cursor = database.rawQuery(Favorite.SELECT_FAVORITE_TABLE, null);

        ArrayList<Favorite> recipeList = new ArrayList<>(cursor.getCount());
        if (cursor.moveToFirst()) {
            do {
                Favorite favorite = new Favorite();
                favorite.setId(cursor.getInt(0));
                favorite.setPosition(cursor.getInt(1));
                favorite.setTitle(cursor.getString(2));
                favorite.setListType(cursor.getString(3));
                recipeList.add(favorite);
            } while (cursor.moveToNext());
        }

        return recipeList;
    }

    public boolean isDataExists(String title) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = null;

        try {
            String query = "SELECT * FROM " + Favorite.FAVORITE_TABLE + " WHERE " + Favorite.KEY_TITLE + " = ?";
            cursor = db.rawQuery(query, new String[]{title});

            // If the cursor has any rows, the data already exists
            return cursor.getCount() > 0;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }


    }
