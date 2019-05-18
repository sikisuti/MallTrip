package com.siki.malltrip.model;

public class Product {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Product(Builder builder) {
        this.name = builder.name;
    }

    public static class Builder {
        private String name;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
