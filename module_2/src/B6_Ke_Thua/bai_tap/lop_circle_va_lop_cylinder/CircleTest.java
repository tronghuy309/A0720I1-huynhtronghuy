package B6_Ke_Thua.bai_tap.lop_circle_va_lop_cylinder;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(2.5,"red");
        System.out.println(circle);
        System.out.println(circle.getArea());

        System.out.println(circle);
    }
}
