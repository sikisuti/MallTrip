package com.siki.malltrip.data;

import com.siki.malltrip.model.Demand;

import java.util.ArrayList;
import java.util.List;

public class DBManagerImpl implements DBManager {
    @Override
    public List<Demand> getDemands() {
        List<Demand> Demands = new ArrayList<>();

        /*Demands.add(new Demand.Builder()
                .setCategory(new Category.Builder()
                    .setName("Joghurt")
                    .build())
                .setDemandStatus(DemandStatus.REQUIRED)
                .build());

        Demands.add(new Demand.Builder()
                .setCategory(new Category.Builder()
                        .setName("Sajt")
                        .build())
                .setDemandStatus(DemandStatus.REQUIRED)
                .build());

        Demands.add(new Demand.Builder()
                .setCategory(new Category.Builder()
                        .setName("Mosópor")
                        .build())
                .setDemandStatus(DemandStatus.REQUIRED)
                .build());

        Demands.add(new Demand.Builder()
                .setCategory(new Category.Builder()
                        .setName("Cipő")
                        .build())
                .setDemandStatus(DemandStatus.REQUIRED)
                .build());

        Demands.add(new Demand.Builder()
                .setCategory(new Category.Builder()
                        .setName("Alma")
                        .build())
                .setDemandStatus(DemandStatus.REQUIRED)
                .build());*/

        return Demands;
    }

    @Override
    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();

        categories.add(new Category.Builder()
                .setName("Joghurt")
                .build());

        categories.add(new Category.Builder()
                .setName("Sajt")
                .build());

        categories.add(new Category.Builder()
                .setName("Mosópor")
                .build());

        categories.add(new Category.Builder()
                .setName("Cipő")
                .build());

        categories.add(new Category.Builder()
                .setName("Alma")
                .build());

        categories.add(new Category.Builder()
                .setName("Asztal")
                .build());

        return categories;
    }
}
