package Models.Services;

import Models.Services.Services;

public class Villa extends Services {
    private String typeOfRoom;
    private String otherConvenient;
    private double poolArea;
    private int floor;

    public Villa(){
    }

    public Villa(String typeOfRoom, String otherConvenient, double poolArea, int floor) {
        this.typeOfRoom = typeOfRoom;
        this.otherConvenient = otherConvenient;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public Villa(String id, String nameOfService, double areaUsed, int price, int maxOfPeople, String rentType, String typeOfRoom, String otherConvenient, double poolArea, int floor) {
        super(id, nameOfService, areaUsed, price, maxOfPeople, rentType);
        this.typeOfRoom = typeOfRoom;
        this.otherConvenient = otherConvenient;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public String getOtherConvenient() {
        return otherConvenient;
    }

    public void setOtherConvenient(String otherConvenient) {
        this.otherConvenient = otherConvenient;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public void showInfo() {
        //super(id, nameOfService, areaUsed, price, maxOfPeople, rentType);
        System.out.println("Villa{" +
                "ID='" + getId() + '\'' +
                "Name of Service='" + getNameOfService() + '\'' +
                "Area Used='" + getAreaUsed() + '\'' +
                "Price='" + getPrice() + '\'' +
                "Max of people='" + getMaxOfPeople() + '\'' +
                "Rent type='" + getRentType() + '\'' +
                "typeOfRoom='" + typeOfRoom + '\'' +
                ", otherConvenient='" + otherConvenient + '\'' +
                ", poolArea=" + poolArea +
                ", floor=" + floor +
                '}');
    }

        @Override

    public String toString() {
        return getId() + "," + getNameOfService() + ","+ getAreaUsed() +","+ getPrice() +","+ getMaxOfPeople() +","+ getRentType() +","+ getTypeOfRoom()
                +","+ getOtherConvenient()
                + ","+getPoolArea() +","+ getFloor();
    }
}
