package com.siki.malltrip.model;

public class Item {
    private String name;
    private ItemStatus status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemStatus getStatus() {
        return status;
    }

    public void setStatus(ItemStatus status) {
        this.status = status;
    }

    private Item(Builder builder) {
        this.name = builder.name;
        this.status = builder.status;
    }

    public static class Builder {
        private String name;
        private ItemStatus status;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setStatus(ItemStatus status) {
            this.status = status;
            return this;
        }

        public Item build() {
            return new Item(this);
        }
    }
}
