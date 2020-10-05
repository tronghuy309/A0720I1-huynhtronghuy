package B5_access_modifier_static_method_static_property.thuc_hanh.Static_Property;

public class Car {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    private String name;
    private String engine;
    public static int numberOfCars;
    public Car(String name, String engine ){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}
