package com.siki.malltrip.data;

import com.siki.malltrip.model.Demand;

import java.util.List;

public interface DBManager {
    List<Demand> getDemands();
    List<Category> getCategories();
}
