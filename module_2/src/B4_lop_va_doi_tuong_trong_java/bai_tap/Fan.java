package B4_lop_va_doi_tuong_trong_java.bai_tap;

public class Fan {
    public static int SLOW = 1;
    public static int MEDIUM = 2;
    public static int FAST = 3;


    private int speed = 1;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        if ( isOn()) {
            String show = "Fan{" +
                    "speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' + ",Fan is On"+
                    '}';
            return show;
        } else {
            String show_1 = "Fan{" +
                    " on=" + on +
                    ", radius= " + radius +
                    ", color='" + color + '\'' + ",Fan is OFF"+
                    '}';
            return show_1;
        }
    }

    public static void main(String[] args) {
        Fan fan_1 = new Fan();
        fan_1.setOn(true);
        fan_1.setRadius(10);
        fan_1.setColor("yellow");
        fan_1.setSpeed(3);
        System.out.println(fan_1.toString());;

        Fan fan_2 = new Fan(3,false,10,"yellow");
        System.out.println(fan_2.toString());

    }
}
