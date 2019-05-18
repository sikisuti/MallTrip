package com.siki.malltrip;

import android.app.Application;

import com.siki.malltrip.data.DBManager;
import com.siki.malltrip.data.DBManagerImpl;
import com.siki.malltrip.data.DataService;
import com.siki.malltrip.data.DataServiceImpl;

public class MallTripApp extends Application {
    private DataService dataService;

    @Override
    public void onCreate() {
        super.onCreate();
        DBManager dbManager = new DBManagerImpl();
        dataService = new DataServiceImpl(dbManager);
    }

    public DataService getDataService() {
        return dataService;
    }
}
