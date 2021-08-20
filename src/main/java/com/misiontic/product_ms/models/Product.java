package com.misiontic.product_ms.models;

import org.springframework.data.annotation.Id;

public class Product {
    @Id
    private String productId;
    private String storeId;
    private String productName;
    private String description;
    private Integer price;
    private String img;

    public Product(String productId, String storeId, String productName, String description, Integer price, String img) {
        this.productId = productId;
        this.storeId = storeId;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.img = img;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getStoreId() {
        return storeId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}