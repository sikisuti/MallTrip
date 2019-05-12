package com.siki.malltrip.data;

import com.siki.malltrip.model.Item;
import com.siki.malltrip.model.ItemStatus;

import java.util.ArrayList;
import java.util.List;

public class DBManagerImpl implements DBManager {
    @Override
    public List<Item> getRequiredItems() {
        List<Item> items = new ArrayList<>();

        items.add(new Item.Builder()
                .setName("Joghurt")
                .setStatus(ItemStatus.REQUIRED)
                .build());

        items.add(new Item.Builder()
                .setName("Sajt")
                .setStatus(ItemStatus.REQUIRED)
                .build());

        items.add(new Item.Builder()
                .setName("Mosópor")
                .setStatus(ItemStatus.REQUIRED)
                .build());

        items.add(new Item.Builder()
                .setName("Cipő")
                .setStatus(ItemStatus.REQUIRED)
                .build());

        items.add(new Item.Builder()
                .setName("Alma")
                .setStatus(ItemStatus.REQUIRED)
                .build());

        return items;
    }
}
