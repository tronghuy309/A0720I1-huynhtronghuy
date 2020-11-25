package B17_IO_TextFile.youtube.models;

public class Student {
    private String id;
    private String name;
    private String grade;
    private String address;

    public Student() {
    }

    public Student(String id, String name, String grade, String address) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.address = address;
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
