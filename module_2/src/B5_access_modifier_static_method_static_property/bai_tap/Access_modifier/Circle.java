package B5_access_modifier_static_method_static_property.bai_tap.Access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = " red ";

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*(getRadius()*getRadius());
    }

}
