/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package careerhub;

/**
 *
 * @author aisha
 */
public class SDAIA implements Company {

    private Student Student;
    private String getGPA;
    private String getMajor;

    public SDAIA(Student Student, String getGPA, String getMajor) {
        this.Student = Student;
        this.getGPA = getGPA;
        this.getMajor = getMajor;
    }

    public Student getStudent() {
        return Student;
    }

    public String getGPA() {
        return getGPA;
    }

    public String getMajor() {
        return getMajor;
    }
       @Override
    public String toString() {
        return "Coop training\n" + "Student Name:" + Student.getUser() + ", getGPA=" + getGPA + ", getMajor=" + getMajor + '}';
    }
    
}