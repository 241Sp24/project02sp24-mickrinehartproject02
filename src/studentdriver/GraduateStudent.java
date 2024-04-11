/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * <<<<<<< HEAD @a
 *
 *
 * uthor s557217
 */
public class GraduateStudent extends StudentFees {

    //instance variables
    private int coursesEnrolled;
    private boolean isGraduateAssistant;
    private String graduateAssistantType;
    private final double ADDITIONAL_FEES = 645.45;

    //Constructors
    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, String graduateAssistantType, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled);
        this.coursesEnrolled = coursesEnrolled;
        this.isGraduateAssistant = isGraduateAssistant;
        this.graduateAssistantType = graduateAssistantType;
    }

    public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, int coursesEnrolled) {
        super(studentName, studentID, isEnrolled);
        this.coursesEnrolled = coursesEnrolled;
        graduateAssistantType = " ";
        this.isGraduateAssistant = isGraduateAssistant;
    }

    //getters
    public boolean isIsGraduateAssistant() {
        return isGraduateAssistant;
    }

    public int getCoursesEnrolled() {
        return coursesEnrolled;
    }

    @Override
    public double getPayableAmount() {
        switch (graduateAssistantType) {
            case "full":
                return ADDITIONAL_FEES;
            case "half":
                return (coursesEnrolled * (super.getPayableAmount() / 2)) + ADDITIONAL_FEES;
            default:
                return (coursesEnrolled * super.getPayableAmount()) + ADDITIONAL_FEES;
        }
    }

    //toString
    @Override
    public String toString() {
        return "\n" + super.toString() + "\nGraduate assistant: " + isGraduateAssistant + "\nGraduate assistant type: " + graduateAssistantType + "\nCourses enrolled: " + coursesEnrolled + "\nPayable amount: " + getPayableAmount();
    }

    //>>>>>>> 158578dbad56d314a4fc511809c3272ff942a2d5            <- I don't know what this is so I won't delete it. -Addison
}
