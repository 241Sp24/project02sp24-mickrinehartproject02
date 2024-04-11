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

        //loop to display Array information
        for (int i = 0; i < students.length; i++) {
            if (i == 0) {
                System.out.println("\nUndergraduate Students List");
            } else if (i == UGCount) {
                System.out.println("Graduate Students List");
            } else if (i == UGCount + GradCount) {
                System.out.println("Online Students List");
            }
            System.out.println(students[i]);
        }

        //Undergraduate Details
    }
}
