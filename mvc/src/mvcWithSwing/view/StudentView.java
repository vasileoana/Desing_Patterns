package mvcWithSwing.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class StudentView extends JFrame {
    private JLabel studentNameLabel = new JLabel("");
    private JLabel yearCollegeLabel = new JLabel(" Year ");
    private JTextField yearCollege = new JTextField(20);
    private JButton updateCollegeButton = new JButton(" Update ");

    private JLabel yearCollegeChangede = new JLabel("");

    JPanel studentPanel = new JPanel();

    public StudentView() {
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,400);


        studentPanel.add(studentNameLabel);
        studentPanel.add(yearCollegeLabel);
        studentPanel.add(yearCollege);
        studentPanel.add(updateCollegeButton);
        this.add(studentPanel);

        JPanel newPanel = new JPanel();
        newPanel.add(yearCollegeChangede);
        newPanel.setPreferredSize(new Dimension(2000,2000));
        studentPanel.add(newPanel);
    }

    public void setStudentName(String name){
        studentNameLabel.setText(name);
        System.out.println(name);
        studentPanel.updateUI();
    }

    public void addCalculationListener(ActionListener listenForCalcButton){
        updateCollegeButton.addActionListener(listenForCalcButton);
    }

    public JLabel getStudentNameLabel() {
        return studentNameLabel;
    }

    public void setStudentNameLabel(JLabel studentNameLabel) {
        this.studentNameLabel = studentNameLabel;
    }

    public JLabel getYearCollegeLabel() {
        return yearCollegeLabel;
    }

    public void setYearCollegeLabel(JLabel yearCollegeLabel) {
        this.yearCollegeLabel = yearCollegeLabel;
    }

    public JTextField getYearCollege() {
        return yearCollege;
    }

    public void setYearCollege(JTextField yearCollege) {
        this.yearCollege = yearCollege;
    }

    public JButton getUpdateCollegeButton() {
        return updateCollegeButton;
    }

    public void setUpdateCollegeButton(JButton updateCollegeButton) {
        this.updateCollegeButton = updateCollegeButton;
    }

    public JPanel getStudentPanel() {
        return studentPanel;
    }

    public void setStudentPanel(JPanel studentPanel) {
        this.studentPanel = studentPanel;
    }

    public JLabel getYearCollegeChangede() {
        return yearCollegeChangede;
    }

    public void setYearCollegeChangede(String yearCollegeChangede) {
        this.yearCollegeChangede.setText("<html>"+yearCollegeChangede+"</br></html>");

    }
}
