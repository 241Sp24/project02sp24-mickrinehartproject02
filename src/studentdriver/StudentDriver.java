/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdriver;

import java.io.*;
import java.util.*;

/**
 *
 * @author dianar
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Project02");

        //Array
        StudentFees[] students = new StudentFees[12];

        //Open file
        File inputFile = new File("input.csv");

        //Read from file
        Scanner file = new Scanner(new File("input.csv"));

        //User input
        Scanner input = new Scanner(System.in);

        //Undergraduate Students
        System.out.print("Enter number of Undergraduate Students: ");
        int UGCount = input.nextInt();

        //Grad Students
        System.out.print("Enter number of Graduate Students: ");
        int GradCount = input.nextInt();

        //Online Students
        System.out.print("Enter number of online Students: ");
        int OnlineCount = input.nextInt();

        //Undergrad for loop
        int x = 0;
        for (int i = 0; i < UGCount; i++) {
            if (file.hasNext()) {
                String[] undergrad = file.next().split(",");
                students[x] = new UGStudent(undergrad[1], Integer.parseInt(undergrad[0]),
                        Boolean.parseBoolean(undergrad[2]), Double.parseDouble(undergrad[5]),
                        Integer.parseInt(undergrad[3]), Boolean.parseBoolean(undergrad[4]));
                x++;
            }
        }

        //Grad for loop
        for (int i = 0; i < GradCount; i++) {
            if (file.hasNext()) {
                String[] grad = file.next().split(",");
                if (Boolean.parseBoolean(grad[4]) == true) {
                    students[x] = new GraduateStudent(grad[1], Integer.parseInt(grad[0]),
                            Boolean.parseBoolean(grad[2]), Boolean.parseBoolean(grad[4]),
                            grad[5], Integer.parseInt(grad[3]));
                } else {
                    students[x] = new GraduateStudent(grad[1], Integer.parseInt(grad[0]),
                            Boolean.parseBoolean(grad[2]), Boolean.parseBoolean(grad[4]), Integer.parseInt(grad[3]));
                }
                x++;
            }
        }

        //Online for loop
        for (int i = 0; i < OnlineCount; i++) {
            if (file.hasNext()) {
                String[] online = file.next().split(",");
                students[x] = new OnlineStudent(online[1], Integer.parseInt(online[0]),
                        Boolean.parseBoolean(online[2]), Integer.parseInt(online[3]));
                x++;
            }
        }
        //Close input file
        file.close();

        //variables
        double avgUGFee = 0;
        double ugNotEnrolled = 0;
        int ugScholarshipCount = 0;
        int ugCreditHours = 0;

        double avgGradFee = 0;
        double gradEnrolled = 0;
        int gradAssistanceCount = 0;
        int gradCreditHours = 0;

        double avgOnlineFee = 0;
        double onlineEnrolled = 0;

        //loop to display Array information
        for (int i = 0; i < students.length; i++) {
            if (i == 0) {
                System.out.println("\n*********Undergraduate Students List*********");
            } else if (i == UGCount) {
                System.out.println("*********Graduate Students List*********");
            } else if (i == UGCount + GradCount) {
                System.out.println("*********Online Students List*********");
            }
            System.out.println(students[i]);

            //Undergraduate Details
            if (students[i] instanceof UGStudent) {
                if (students[i].isIsEnrolled() == true) {
                    ugNotEnrolled += 1;
                    ugCreditHours += ((UGStudent) students[i]).getCoursesEnrolled();
                }
                if (((UGStudent) students[i]).isHasScholarship() == true) {
                    ugScholarshipCount += 1;
                }
                avgUGFee += students[i].getPayableAmount();
            }

            //Graduate Details
            if (students[i] instanceof GraduateStudent) {
                if (students[i].isIsEnrolled() == true) {
                    gradEnrolled += 1;
                    gradCreditHours += ((GraduateStudent) students[i]).getCoursesEnrolled();
                }
                if (((GraduateStudent) students[i]).isIsGraduateAssistant() == true) {
                    gradAssistanceCount += 1;
                }
                avgGradFee += students[i].getPayableAmount();
            }

            //Online Details
            if (students[i] instanceof OnlineStudent) {
                if (students[i].isIsEnrolled() == true) {
                    onlineEnrolled += 1;
                }
                avgOnlineFee += students[i].getPayableAmount();
            }

        }
        System.out.println("*********Undergraduate Students Details*********" + "\nAverage Students Fee: " + avgUGFee / ugNotEnrolled + "\nScholarship Count: " + ugScholarshipCount + "\nTotal Number of Courses: " + ugCreditHours);

        System.out.println("\n*********Graduate Students Details*********" + "\nAverage Students Fee: " + avgGradFee / gradEnrolled + "\nGraduate Assistanceship Count: " + gradAssistanceCount + "\nTotal Number of Courses: " + gradCreditHours);

        System.out.printf("\n**********Online Students Details**********" + "\nAverage Students Fee: %.2f\n", (avgOnlineFee / onlineEnrolled));

    }
}
