package B5_access_modifier_static_method_static_property.thuc_hanh.Static_Property;

public class TestStaticProperty {

    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCars);
        System.out.println(car1.getName());
       car1.setName(" honda ");
        System.out.println(car1.getName());
        String str = car1.getEngine();
        System.out.println(str);  //

        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
