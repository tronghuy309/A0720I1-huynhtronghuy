package Models.Services;

import Models.Services.Services;

public class House extends Services {
    private String typeOfRoom;
    private String otherConvenient;
    private int Floor;

    public House(){
    }


    public House(String typeOfRoom, String otherConvenient, int floor) {
        this.typeOfRoom = typeOfRoom;
        this.otherConvenient = otherConvenient;
        Floor = floor;
    }

    public House(String id, String nameOfService, double areaUsed, int price, int maxOfPeople, String rentType, String typeOfRoom, String otherConvenient, int floor) {
        super(id, nameOfService, areaUsed, price, maxOfPeople, rentType);
        this.typeOfRoom = typeOfRoom;
        this.otherConvenient = otherConvenient;
        Floor = floor;
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

    public int getFloor() {
        return Floor;
    }

    public void setFloor(int floor) {
        Floor = floor;
    }

    @Override
    public void showInfo() {
        //String id, String nameOfService, double areaUsed, int price, int maxOfPeople, String rentType, String typeOfRoom, String otherConvenient,floor
        System.out.println("House{" +
                "ID='" + getId() + '\'' +
                "Name of Service='" + getNameOfService() + '\'' +
                "Area Used='" + getAreaUsed() + '\'' +
                "Price='" + getPrice() + '\'' +
                "Max of people='" + getMaxOfPeople() + '\'' +
                "Rent type='" + getRentType() + '\'' +
                "typeOfRoom='" + typeOfRoom + '\'' +
                ", otherConvenient='" + otherConvenient + '\'' +
                ", Floor=" + Floor +
                '}');
    }

    @Override
    public String toString() {
        return getId() + "," + getNameOfService() + ","+ getAreaUsed() +","+ getPrice() +","+ getMaxOfPeople() +","+ getRentType() + ","
                + getTypeOfRoom() + "," + getOtherConvenient() + "," + getFloor();
    }
}
