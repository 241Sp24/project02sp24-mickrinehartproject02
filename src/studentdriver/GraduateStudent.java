/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdriver;

/**
 *
 * <<<<<<< HEAD
 * @a
 *
 * uthor s557217
 */
public class GraduateStudent {

    public class GraduateStudent extends StudentFees {

        private int coursesEnrolled;
        private boolean isGraduateAssistant;
        private String graduateAssistantType;
        private double getPayableAmount;

        //Constructors
        public GraduateStudent(String studentName, int studentID, boolean isEnrolled, boolean isGraduateAssistant, String graduateAssistantType, int coursesEnrolled) {
            super(studentName, studentID, isEnrolled);
            this.coursesEnrolled = coursesEnrolled;
            this.isGraduateAssistant = isGraduateAssistant;
            this.graduateAssistantType = graduateAssistantType;
            this.getPayableAmount = getPayableAmount;
        }
        >>>>>>> 158578dbad56d314a4fc511809c3272ff942a2d5
    }
