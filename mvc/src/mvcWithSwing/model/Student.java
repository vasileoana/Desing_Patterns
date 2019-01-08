package mvcWithSwing.model;

public class Student {
    private String name;
    private String yearCollege;

    public Student(String name, String yearCollege) {
        this.name = name;
        this.yearCollege = yearCollege;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearCollege() {
        return yearCollege;
    }

    public void setYearCollege(String yearCollege) {
        this.yearCollege = yearCollege;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", yearCollege='" + yearCollege + '\'' +
                '}';
    }
}
