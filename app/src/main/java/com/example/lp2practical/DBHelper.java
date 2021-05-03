package com.example.lp2practical;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {

	private static final String DATABASE_NAME = "cars.db";
	private static final int DATABASE_VERSION = 1;
	private static final String TABLE_CAR = "Car";
	private static final String COLUMN_ID = "_id";
	private static final String COLUMN_BRAND = "brand";
	private static final String COLUMN_LITRE = "litre";

	public DBHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_CAR);
		onCreate(db);
	}

	public long insertCar(String brand, double litre) {

	}

	public ArrayList<Car> getAllCars() {

	}

    public int updateCar(Car data){

    }

    public int deleteCar(int id){

    }

}
