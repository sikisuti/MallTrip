package com.siki.malltrip.model;

import com.siki.malltrip.data.Category;

public class Product {
    private Category category;
    private String manufacturer;
    private String productName;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    private Product(Builder builder) {

    }

    public static class Builder {
        private Category category;
        private String manufacturer;
        private String productName;

        public Builder setCategory(Category category) {
            this.category = category;
            return this;
        }

        public Builder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Builder setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
