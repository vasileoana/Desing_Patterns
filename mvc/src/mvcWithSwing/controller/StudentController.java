package mvcWithSwing.controller;

import mvcWithSwing.Repository;
import mvcWithSwing.model.Student;
import mvcWithSwing.view.StudentView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentController {
    private StudentView theView;
    private Student theModel;

    public StudentController(StudentView theView, Student theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.setStudentName(Repository.getName());
        this.theView.addCalculationListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String oldYear = theModel.getYearCollege();
                String iputValue  = theView.getYearCollege().getText();
                theModel.setYearCollege(iputValue);
                System.out.println("button clicked");
                System.out.println(theModel.toString());
                theView.setYearCollegeChangede("The label was changed from " + oldYear + " to " + iputValue);
            }
        });
    }

    public StudentView getTheView() {
        return theView;
    }

    public void setTheView(StudentView theView) {
        this.theView = theView;
    }

    public Student getTheModel() {
        return theModel;
    }

    public void setTheModel(Student theModel) {
        this.theModel = theModel;
    }
}
