package com.siki.malltrip.data;

import com.siki.malltrip.model.Category;
import com.siki.malltrip.model.Demand;

import java.util.List;

public interface DataService {
    List<Demand> getDemands();
    List<Category> getCategories();
    void addDemand(String categoryName);
}
