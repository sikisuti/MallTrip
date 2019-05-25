package com.siki.malltrip;

import android.app.Application;

import androidx.room.Room;

import com.siki.malltrip.data.DBManager;
import com.siki.malltrip.data.DBManagerImpl;
import com.siki.malltrip.data.DataService;
import com.siki.malltrip.data.DataServiceImpl;
import com.siki.malltrip.data.MallTripRoomDatabase;

public class MallTripApp extends Application {
    private DataService dataService;
    private MallTripRoomDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        DBManager dbManager = new DBManagerImpl();
        dataService = new DataServiceImpl(dbManager);

        database = Room.databaseBuilder(getApplicationContext(), MallTripRoomDatabase.class, "mall_trip_database").build();
    }

    public DataService getDataService() {
        return dataService;
    }
}
