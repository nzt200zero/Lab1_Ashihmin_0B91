package com.tpulab1;
import java.util.ArrayList;

public class HouseholdApps {

    private Integer power;
    private Integer weight;
    private Double price;
    private String manufacture;

    private ArrayList<Kitchens> kitchens = new ArrayList();

    public HouseholdApps(Integer power, Integer weight, Double price, String manufacture) {
        this.power = power;
        this.weight = weight;
        this.price = price;
        this.manufacture = manufacture;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public ArrayList getKitchens() {
        return this.kitchens;
    }

    public void addKitchens(Kitchens kitchens) {
        this.kitchens.add(kitchens);
    }

    public void removeKKitchens(Kitchens kitchens) {
        this.kitchens.remove(kitchens);
    }
}

