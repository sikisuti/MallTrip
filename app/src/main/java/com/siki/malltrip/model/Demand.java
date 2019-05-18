package com.siki.malltrip.model;

public class Demand {
    private Product product;
    private DemandStatus demandStatus;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public DemandStatus getDemandStatus() {
        return demandStatus;
    }

    public void setDemandStatus(DemandStatus demandStatus) {
        this.demandStatus = demandStatus;
    }

    private Demand(Builder builder) {
        this.product = builder.product;
        this.demandStatus = builder.demandStatus;
    }

    public static class Builder {
        private Product product;
        private DemandStatus demandStatus;

        public Builder setProduct(Product product) {
            this.product = product;
            return this;
        }

        public Builder setDemandStatus(DemandStatus demandStatus) {
            this.demandStatus = demandStatus;
            return this;
        }

        public Demand build() {
            return new Demand(this);
        }
    }
}
