package com.tpulab1;
import java.util.ArrayList;

public class WashingM extends Kitchens {
    public WashingM(Integer power, Integer weight, Double price, String manufacture, String transportation, Boolean integrated, String date) {
        super(power, weight, price, manufacture, transportation, integrated, date);
    }

    private String name;
    private Boolean protection;

    private ArrayList<Kitchens> kitchens = new ArrayList();

    public WashingM(Integer power, Integer weight, Double price, String manufacture, String transportation, Boolean integrated, String date, String name, Boolean protection) {
        super(power, weight, price, manufacture, transportation, integrated, date);
        this.name = name;
        this.protection = protection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getProtection() {
        return protection;
    }

    public void setProtection(Boolean protection) {
        this.protection = protection;
    }

    public ArrayList getKitchens() {
        return this.kitchens;
    }
}
