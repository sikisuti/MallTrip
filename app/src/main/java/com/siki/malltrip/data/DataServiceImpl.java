package com.siki.malltrip.data;

import com.siki.malltrip.model.Item;

import java.util.ArrayList;
import java.util.List;

public class DataServiceImpl implements DataService {
    DBManager dbManager;

    List<Item> requiredItems = new ArrayList<>();

    public DataServiceImpl(DBManager dbManager) {
        this.dbManager = dbManager;
        requiredItems = dbManager.getRequiredItems();

    }

    @Override
    public List<Item> getRequiredItems() {
        return requiredItems;
    }
}
