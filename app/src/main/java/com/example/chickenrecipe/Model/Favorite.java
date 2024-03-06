package com.example.chickenrecipe.Model;

public class Favorite {

    private int id;
    private int position;
    private String title;
    private String listType;

    public static final String KEY_ID = "Id";
    public static final String KEY_POSITION = "Position";
    public static final String KEY_TITLE = "Title";
    public static final String KEY_LIST_TYPE = "ListType";

    public static final String FAVORITE_TABLE = "Favorite";
    public static final String CREATE_FAVORITE_TABLE = String.format(
            "CREATE TABLE IF NOT EXISTS %S (%S INTEGER PRIMARY KEY AUTOINCREMENT, %S INTEGER, %S TEXT, %S TEXT)",
            FAVORITE_TABLE, KEY_ID, KEY_POSITION, KEY_TITLE, KEY_LIST_TYPE);
    public static final String DROP_FAVORITE_TABLE = "DROP TABLE IF EXISTS " + FAVORITE_TABLE;
    public static final String SELECT_FAVORITE_TABLE = "SELECT * FROM " + FAVORITE_TABLE;

    public Favorite() {
    }

    public Favorite(int position, String title, String listType) {
        this.position = position;
        this.title = title;
        this.listType = listType;
    }

    public Favorite(int id, int position, String title, String listType) {
        this.id = id;
        this.position = position;
        this.title = title;
        this.listType = listType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getListType() {
        return listType;
    }

    public void setListType(String listType) {
        this.listType = listType;
    }

}
