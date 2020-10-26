package B10_DSA_Danh_sach.thuc_hanh;

import java.sql.SQLOutput;

public class TestMyArrayList {
    public static void main(String[] args) {
        Student a = new  Student(1,"Huy");
        Student b = new  Student(2,"Ngo");
        Student c = new  Student(3,"Hoang");
        Student d = new  Student(4,"Truc");
        Student e = new  Student(5,"My");
        Student f = new  Student(6,"My2");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
        studentMyArrayList.add(f,2);
        System.out.println(studentMyArrayList.size());

        for(int i = 0; i< studentMyArrayList.size(); i++){
            Student student = (Student) studentMyArrayList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());

        }
    }
}

