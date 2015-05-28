package com.coolweather.app.db; //�������ݿ���ش���

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	
	/**
	 * Province���������
	 */
	public static final String CREATE_PROVINCE="create table Province ("
			+ "id integer primary key autoincreament,"
			+ "province_name text,"
			+ "province_code text)";
	/**
	 * City���������
	 */
	public static final String CREATE_CITY="create table City ("
			+ "id integer primary key autoincrement,"
			+ "city_name text,"
			+ "city_code text,"
			+ "province_id integer)";
	/**
	 * County���������
	 */
	public static final String CREATE_COUNTY="create table City ("
			+ "id integer primary key autoincrement,"
			+ "county_name text,"
			+ "county_code text,"
			+ "city_id integer)";	
	


	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO �Զ����ɵķ������
		db.execSQL(CREATE_PROVINCE); //����Province��
		db.execSQL(CREATE_CITY);// ����City��
		db.execSQL(CREATE_COUNTY);//����County��
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO �Զ����ɵķ������

	}

}