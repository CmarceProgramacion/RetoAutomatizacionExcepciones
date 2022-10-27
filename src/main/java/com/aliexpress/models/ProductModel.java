package com.aliexpress.models;

import java.util.List;

public class ProductModel {
    private String product;
    private String country;

    public ProductModel(List<String> data) {
        this.product = data.get(0);
        this.country = data.get(1);
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
