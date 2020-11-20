package FuramaResort.models;

public class House extends Services {
    private String roomType;
    private String compService;
    private int floor;

    public House() {
    };

    public House(String id, String serviceName, double area, double rate, int maxCapacity, String rentType, String roomType, String compService, int floor) {
        super(id, serviceName, area, rate, maxCapacity, rentType);
        this.roomType = roomType;
        this.compService = compService;
        this.floor = floor;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getCompService() {
        return compService;
    }

    public void setCompService(String compService) {
        this.compService = compService;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String showInfor() {
        return "House{" +
                "id='" + getId() + '\'' +
                ", serviceName='" + getServiceName() + '\'' +
                ", area=" + getArea() +
                ", rate=" + getRate() +
                ", maxCapacity=" + getMaxCapacity() +
                ", rentType='" + getRentType() + '\'' +
                "roomType='" + roomType + '\'' +
                ", compService='" + compService + '\'' +
                ", floor=" + floor +
                "} " + super.toString();
    }
    @Override
    public String getHeader(){
        return "Villa Id,Service Name,Area,Rate,Max Capacity,Rent Type,Room Type,Comp Service,floor";
    }


    public String writeToCSV(){
        return getId() +
                "," + getServiceName() +
                "," + getArea() +
                "," + getRate() +
                "," + getMaxCapacity() +
                "," + getRentType() +
                "," + roomType +
                "," + compService +
                "," + floor ;
    }
}
