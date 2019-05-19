package com.siki.malltrip.data;

import android.util.Log;

import com.siki.malltrip.model.Demand;
import com.siki.malltrip.model.DemandStatus;
import com.siki.malltrip.model.Product;

import java.util.ArrayList;
import java.util.List;

public class DataServiceImpl implements DataService {
    DBManager dbManager;

    List<Demand> requiredProducts;
    List<Product> products;

    public DataServiceImpl(DBManager dbManager) {
        this.dbManager = dbManager;
    }

    @Override
    public List<Demand> getRequiredProducts() {
        if (requiredProducts == null) {
            requiredProducts = dbManager.getRequiredProducts();
        }

        return requiredProducts;
    }

    @Override
    public List<Product> getProducts() {
        if (products == null) {
            products = dbManager.getProducts();
        }

        return products;
    }

    @Override
    public void addRequiredProduct(Product product) {
        products.add(product);
        requiredProducts.add(new Demand.Builder()
                .setProduct(product)
                .setDemandStatus(DemandStatus.REQUIRED)
                .build());
    }
}
