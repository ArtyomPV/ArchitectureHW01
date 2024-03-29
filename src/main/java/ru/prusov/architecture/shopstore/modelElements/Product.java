package ru.prusov.architecture.shopstore.modelElements;

public class Product {

    {
        id = ++counter;
    }
    //region Getters & Setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    //endregion

    //region Fields
    private static int counter =0;
    private int id;
    private String name;
    private  double price;
    private String category;
    //endregion
}
