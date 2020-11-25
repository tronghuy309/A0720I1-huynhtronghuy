package furama_resort.models;

public abstract class Services {
    private String id;
    private String name;
    private String area;
    private String price;
    private String amount;
    private String typeRents;

    public Services() {
    }

    public Services(String id, String name, String area, String price, String amount, String typeRents) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.price = price;
        this.amount = amount;
        this.typeRents = typeRents;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTypeRents() {
        return typeRents;
    }

    public void setTypeRents(String typeRents) {
        this.typeRents = typeRents;
    }

    public abstract String showInfo();
}
