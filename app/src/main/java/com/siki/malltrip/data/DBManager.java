package com.siki.malltrip.data;

import com.siki.malltrip.model.Demand;
import com.siki.malltrip.model.Category;

import java.util.List;

public interface DBManager {
    List<Demand> getDemands();
    List<Category> getCategories();
}
