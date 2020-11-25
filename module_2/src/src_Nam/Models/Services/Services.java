package Models.Services;

import java.util.Date;

public abstract class Services {
    private String id;
    private String nameOfService;
    private double areaUsed;
    private int price;
    private int maxOfPeople;
    private String rentType;

    public Services(){
    }

    public Services(String id, String nameOfService, double areaUsed, int price, int maxOfPeople, String rentType) {
        this.id = id;
        this.nameOfService = nameOfService;
        this.areaUsed = areaUsed;
        this.price = price;
        this.maxOfPeople = maxOfPeople;
        this.rentType = rentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxOfPeople() {
        return maxOfPeople;
    }

    public void setMaxOfPeople(int maxOfPeople) {
        this.maxOfPeople = maxOfPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public abstract void showInfo();
}
