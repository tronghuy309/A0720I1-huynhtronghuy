package B5_access_modifier_static_method_static_property.thuc_hanh.Static_Method;

public class TestStaticMethod {
    public  static void main(String[]args){
        Student.change();
        Student s1 = new Student(111,"Hoang");
        Student s2 = new Student(222,"Khanh");
        Student s3 = new Student(333,"nam");

        s1.display();
        s2.display();
        s3.display();
    }
}
