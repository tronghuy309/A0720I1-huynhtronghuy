package B6_Ke_Thua.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
    public double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                " height=" + getHeight() +
                "/ radius is: " + super.getRadius()+
                "/ color is: " + super.getColor()+
                "/ volume is: " + getVolume()+
                 '\'' +
                '}';
    }
}

