package com.siki.malltrip.model;

public class Category {
    private String type;
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String category) {
        this.type = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Category(Builder builder) {
        this.type = builder.type;
        this.name = builder.name;
    }

    public static class Builder {
        private String type;
        private String name;

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Category build() {
            return new Category(this);
        }
    }
}
