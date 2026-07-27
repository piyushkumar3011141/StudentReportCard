package StudentReportCard;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	char another;
    	Scanner sc = new Scanner(System.in);
    	do {
        Student s = new Student();

        // Student Name
        while (true) {

            System.out.print("Enter Student Name : ");
            s.name = sc.nextLine();

            if (s.name.trim().isEmpty()) {
                System.out.println("Student Name cannot be empty.");
            } else {
                break;
            }
        }

        // Roll Number
        while (true) {

            try {

                System.out.print("Enter Roll Number : ");
                s.rollNumber = sc.nextInt();
                sc.nextLine();
                break;

            } catch (InputMismatchException e) {

                System.out.println("Invalid Roll Number! Enter numbers only.");
                sc.nextLine();
            }
        }

        // Class
        while (true) {

            System.out.print("Enter Class : ");
            s.studentClass = sc.nextLine();

            if (s.studentClass.trim().isEmpty()) {
                System.out.println("Class cannot be empty.");
            } else {
                break;
            }
        }

        // Section
        while (true) {

            System.out.print("Enter Section : ");
            s.section = sc.nextLine();

            if (s.section.trim().isEmpty()) {
                System.out.println("Section cannot be empty.");
            } else {
                break;
            }
        }

        // Number of Subjects
        int n;

        while (true) {

            try {

                System.out.print("Enter Number of Subjects : ");
                n = sc.nextInt();

                if (n <= 0) {
                    System.out.println("Number of subjects must be greater than 0.");
                    continue;
                }

                sc.nextLine();
                break;

            } catch (InputMismatchException e) {

                System.out.println("Invalid Input! Enter numbers only.");
                sc.nextLine();
            }
        }

        String[] subject = new String[n];
        double[] marks = new double[n];

        // Subject Details
        for (int i = 0; i < n; i++) {

            while (true) {

                System.out.print("\nEnter Subject Name : ");
                subject[i] = sc.nextLine();

                if (subject[i].trim().isEmpty()) {
                    System.out.println("Subject Name cannot be empty.");
                } else {
                    break;
                }
            }

            while (true) {

                try {

                    System.out.print("Enter Marks : ");
                    marks[i] = sc.nextDouble();
                    sc.nextLine();

                    if (marks[i] < 0 || marks[i] > 100) {
                        System.out.println("Marks must be between 0 and 100.");
                        continue;
                    }

                    break;

                } catch (InputMismatchException e) {

                    System.out.println("Invalid Input! Enter numeric marks only.");
                    sc.nextLine();
                }
            }
        }

        // Report Card
        System.out.println("\n========== REPORT CARD ==========");

        System.out.println("Name      : " + s.name);
        System.out.println("Roll No   : " + s.rollNumber);
        System.out.println("Class     : " + s.studentClass);
        System.out.println("Section   : " + s.section);

        StudentReportCard.showMarks(subject, marks);
        System.out.print("\nAnother Student Report Card? (Y/N): ");
        another = sc.next().toLowerCase().charAt(0);
        
    }
    	while(another == 'y');
    	sc.close();
    	System.out.println("Thank You!");
    }
}