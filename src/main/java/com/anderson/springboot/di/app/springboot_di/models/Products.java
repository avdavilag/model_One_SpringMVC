package com.anderson.springboot.di.app.springboot_di.models;

public class Products implements Cloneable {

    private Long id;

    private String name;

    private Long price;

    public Products() {
    }

    public Products(Long id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return new Products(this.getId(), this.getName(), this.getPrice());
        }
    }

}
