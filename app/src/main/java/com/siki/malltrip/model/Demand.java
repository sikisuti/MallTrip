package com.siki.malltrip.model;

public class Demand {
    private Category category;
    private DemandStatus demandStatus;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public DemandStatus getDemandStatus() {
        return demandStatus;
    }

    public void setDemandStatus(DemandStatus demandStatus) {
        this.demandStatus = demandStatus;
    }

    private Demand(Builder builder) {
        this.category = builder.category;
        this.demandStatus = builder.demandStatus;
    }

    public static class Builder {
        private Category category;
        private DemandStatus demandStatus;

        public Builder setCategory(Category category) {
            this.category = category;
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
