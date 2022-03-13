package com.tpulab1;
import java.util.ArrayList;

public class Kitchens extends HouseholdApps{
    public Kitchens(Integer power, Integer weight, Double price, String manufacture) {
        super(power, weight, price, manufacture);
    }
    private String transportation;
    private Boolean integrated;
    private String date;

    private ArrayList<HouseholdApps> householdapps = new ArrayList();
    private ArrayList<WashingM> washingMS = new ArrayList();

    public Kitchens(Integer power, Integer weight, Double price, String manufacture, String transportation, Boolean integrated, String date) {
        super(power, weight, price, manufacture);
        this.transportation = transportation;
        this.integrated = integrated;
        this.date = date;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public Boolean getIntegrated() {
        return integrated;
    }

    public void setIntegrated(Boolean integrated) {
        this.integrated = integrated;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList getHouseholdApps() {
        return this.householdapps;
    }

    public ArrayList getWashingM() {
        return this.washingMS;
    }

    public void addWashingM(WashingM washingM)
    {
        this.washingMS.add(washingM);
    }

    public void removeWashingM(WashingM washingM) {
        this.washingMS.remove(washingM);
    }
}
