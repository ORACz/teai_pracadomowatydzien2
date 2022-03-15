package com.oracz.sb2SHOP.model;

import java.math.BigDecimal;
import java.util.Objects;


public class ProductShop {

    private Long id;
    public String nameProduct;
    public double priceProduct;


    public ProductShop(String nameProduct, double priceProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProductShop() {
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public int setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
        return priceProduct;
    }

    @Override
    public String toString() {
        return "ProductShop{" +
                "nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductShop that = (ProductShop) o;
        return priceProduct == that.priceProduct && nameProduct.equals(that.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct, priceProduct);
    }


}
