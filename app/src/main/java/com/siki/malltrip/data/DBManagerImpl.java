package com.siki.malltrip.data;

import com.siki.malltrip.model.Demand;
import com.siki.malltrip.model.Product;
import com.siki.malltrip.model.DemandStatus;

import java.util.ArrayList;
import java.util.List;

public class DBManagerImpl implements DBManager {
    @Override
    public List<Demand> getRequiredProducts() {
        List<Demand> Demands = new ArrayList<>();

        Demands.add(new Demand.Builder()
                .setProduct(new Product.Builder()
                    .setName("Joghurt")
                    .build())
                .setDemandStatus(DemandStatus.REQUIRED)
                .build());

        Demands.add(new Demand.Builder()
                .setProduct(new Product.Builder()
                        .setName("Sajt")
                        .build())
                .setDemandStatus(DemandStatus.REQUIRED)
                .build());

        Demands.add(new Demand.Builder()
                .setProduct(new Product.Builder()
                        .setName("Mosópor")
                        .build())
                .setDemandStatus(DemandStatus.REQUIRED)
                .build());

        Demands.add(new Demand.Builder()
                .setProduct(new Product.Builder()
                        .setName("Cipő")
                        .build())
                .setDemandStatus(DemandStatus.REQUIRED)
                .build());

        Demands.add(new Demand.Builder()
                .setProduct(new Product.Builder()
                        .setName("Alma")
                        .build())
                .setDemandStatus(DemandStatus.REQUIRED)
                .build());

        return Demands;
    }

    @Override
    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();

        products.add(new Product.Builder()
                .setName("Joghurt")
                .build());

        products.add(new Product.Builder()
                .setName("Sajt")
                .build());

        products.add(new Product.Builder()
                .setName("Mosópor")
                .build());

        products.add(new Product.Builder()
                .setName("Cipő")
                .build());

        products.add(new Product.Builder()
                .setName("Alma")
                .build());

        products.add(new Product.Builder()
                .setName("Asztal")
                .build());

        return products;
    }
}
