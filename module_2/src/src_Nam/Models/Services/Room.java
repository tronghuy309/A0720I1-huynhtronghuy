package Models.Services;

import Models.Services.Services;

public class Room extends Services {
    private String freeService;

    public Room(){
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String nameOfService, double areaUsed, int price, int maxOfPeople, String rentType, String freeService) {
        super(id, nameOfService, areaUsed, price, maxOfPeople, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    @Override
    public String toString() {
        return getId() + "," + getNameOfService() + ","+ getAreaUsed() +","+ getPrice() +","+ getMaxOfPeople() +","+ getRentType() + "," + getFreeService();
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public void showInfo() {
        System.out.println("ID='" + getId() + '\'' +
                "Name of Service='" + getNameOfService() + '\'' +
                "Area Used='" + getAreaUsed() + '\'' +
                "Price='" + getPrice() + '\'' +
                "Max of people='" + getMaxOfPeople() + '\'' +
                "Rent type='" + getRentType() + '\'' +
                "Free Service : " + getFreeService());
    }



}
