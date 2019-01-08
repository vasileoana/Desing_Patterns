package mvcWithSwing;

import mvcWithSwing.controller.StudentController;
import mvcWithSwing.model.Student;
import mvcWithSwing.view.StudentView;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("ion", "2");
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(studentView, student);
        studentController.getTheView().setVisible(true);
    }
}
