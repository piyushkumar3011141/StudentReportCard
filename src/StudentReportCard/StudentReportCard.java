package StudentReportCard;

public class StudentReportCard {

    // Grade Method
    public static void percentage(double marks) {

        if (marks <= 100 && marks >= 91) {
            System.out.println("Grade A1");
        } else if (marks <= 90 && marks >= 81) {
            System.out.println("Grade A2");
        } else if (marks <= 80 && marks >= 71) {
            System.out.println("Grade B1");
        } else if (marks <= 70 && marks >= 61) {
            System.out.println("Grade B2");
        } else if (marks <= 60 && marks >= 51) {
            System.out.println("Grade C1");
        } else if (marks <= 50 && marks >= 41) {
            System.out.println("Grade C2");
        } else if (marks <= 40 && marks >= 33) {
            System.out.println("Grade D");
        } else if (marks < 33 && marks >= 0) {
            System.out.println("Need Improvement / Fail!");
        } else {
            System.out.println("Invalid Marks!");
        }
    }

    // Display Marks and Calculate Total
    public static void showMarks(String[] subject, double[] marks) {

        double sum = 0;

        System.out.println("\n------ Subject Marks ------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(subject[i] + " : " + marks[i]);
            sum += marks[i];
        }

        calculation(sum, marks.length);
    }

    // Total, Percentage and Grade
    public static void calculation(double total, int subjects) {

    	double per = (total / (subjects * 100)) * 100;

        System.out.println("\nTotal Marks : " + total);
        System.out.println("Percentage : " + per);

        System.out.print("Overall Grade : ");
        percentage(per);
    }
}

// Student Class
class Student {
    String name;
    int rollNumber;
    String studentClass;
    String section;

}