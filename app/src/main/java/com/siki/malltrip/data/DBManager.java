package com.siki.malltrip.data;

import com.siki.malltrip.model.Demand;
import com.siki.malltrip.model.Product;

import java.util.List;

public interface DBManager {
    List<Demand> getRequiredProducts();
    List<Product> getProducts();
}
