package FuramaResortDon.models;

public class Room extends Services {
    private String compServices;

    public Room() {
    }

    public Room(String id, String serviceName, double area, double rate, int maxCapacity, String rentType, String compServices) {
        super(id, serviceName, area, rate, maxCapacity, rentType);
        this.compServices = compServices;
    }

    @Override
    public String showInfor() {
        return "Room{" +
                "id='" + getId() + '\'' +
                ", serviceName='" + getServiceName() + '\'' +
                ", area=" + getArea() +
                ", rate=" + getRate() +
                ", maxCapacity=" + getMaxCapacity() +
                ", rentType='" + getRentType() + '\'' +
                "compServices='" + compServices + '\'' +
                "} " + super.toString();
    }
    @Override
    public String getHeader(){
        return "Villa Id,Service Name,Area,Rate,Max Capacity,Rent Type";
    }


    public String writeToCSV(){
        return getId() +
                "," + getServiceName() +
                "," + getArea() +
                "," + getRate() +
                "," + getMaxCapacity() +
                "," + getRentType();

    }
}
