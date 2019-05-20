package com.siki.malltrip.data;

import com.siki.malltrip.model.Demand;
import com.siki.malltrip.model.DemandStatus;
import com.siki.malltrip.model.Category;

import java.util.List;
import java.util.Optional;

public class DataServiceImpl implements DataService {
    DBManager dbManager;

    List<Demand> demands;
    List<Category> categories;

    public DataServiceImpl(DBManager dbManager) {
        this.dbManager = dbManager;
    }

    @Override
    public List<Demand> getDemands() {
        if (demands == null) {
            demands = dbManager.getDemands();
        }

        return demands;
    }

    @Override
    public List<Category> getCategories() {
        if (categories == null) {
            categories = dbManager.getCategories();
        }

        return categories;
    }

    @Override
    public void addDemand(String categoryName) {
        Optional<Category> foundCategory = categories.stream().filter(c -> c.getName().equalsIgnoreCase(categoryName)).findFirst();
        Category category = foundCategory.orElseGet(() -> new Category.Builder()
                .setName(categoryName)
                .build());

        demands.add(new Demand.Builder()
                .setCategory(category)
                .setDemandStatus(DemandStatus.REQUIRED)
                .build());
    }
}
