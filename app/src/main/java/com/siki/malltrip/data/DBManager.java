package com.siki.malltrip.data;

import com.siki.malltrip.model.Item;

import java.util.List;

public interface DBManager {
    List<Item> getRequiredItems();
}
