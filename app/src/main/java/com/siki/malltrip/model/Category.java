package com.siki.malltrip.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Categories")
public class Category {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "type")
    private String type;

    @ColumnInfo(name = "name")
    @NonNull
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public Category() {}

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
