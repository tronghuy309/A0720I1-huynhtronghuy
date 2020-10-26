package B6_Ke_Thua.bai_tap.lop_circle_va_lop_cylinder;

public class Circle {
    public double radius;
    public String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

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

    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                ", color='" + getColor() + " and Area is: "+ getArea() + '\'' +
                '}';
    }
}
