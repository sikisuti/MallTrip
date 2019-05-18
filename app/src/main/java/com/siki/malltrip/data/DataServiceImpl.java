package com.siki.malltrip.data;

import android.util.Log;

import com.siki.malltrip.model.Demand;
import com.siki.malltrip.model.Product;

import java.util.ArrayList;
import java.util.List;

public class DataServiceImpl implements DataService {
    DBManager dbManager;

    List<Demand> requiredProducts = new ArrayList<>();
    List<Product> products = new ArrayList<>();

    public DataServiceImpl(DBManager dbManager) {
        this.dbManager = dbManager;
        requiredProducts = dbManager.getRequiredProducts();
        products = dbManager.getProducts();
    }

    @Override
    public List<Demand> getRequiredProducts() {
        return requiredProducts;
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }
}
