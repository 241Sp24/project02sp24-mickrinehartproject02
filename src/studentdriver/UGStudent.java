/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * @author s557217
 */
public class UGStudent extends StudentFees {

    private double scholarshipAmount;
    private int coursesEnrolled;
    private boolean hasScholarship;
    private final double ADDITIONAL_FEE = 820.70;

    //constuctor
    public UGStudent(String studentName, int studentID, boolean isEnrolled, double ScholarshipAmount, int coursesEnrolled, boolean hasScholarship) {
        super(studentName, studentID, isEnrolled);
        this.scholarshipAmount = scholarshipAmount;
        this.coursesEnrolled = coursesEnrolled;
        this.hasScholarship = hasScholarship;
    }

    //getters
    public boolean isHasScholarship() {
        return hasScholarship;
    }

    public double getScholarshipAmount() {
        return scholarshipAmount;
    }

    public int getCoursesEnrolled() {
        return coursesEnrolled;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "\nScholarship: " + hasScholarship + "\nScholarship Amount: " + scholarshipAmount + "\nCourses enrolled: " + coursesEnrolled + "Payable Amount: " + super.getPayableAmount(); //Don't think that's how the payable amount is supposed to go, but I'm trying
    }
}
