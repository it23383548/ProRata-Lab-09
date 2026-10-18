import java.util.Scanner;

public class IT23383548Lab9Q4 {

    public static double calcFinalMark(double assignment, double exam) {
        return (assignment * 30 / 100) + (exam * 70 / 100);
    }

    public static String findGrades(double mark) {
        if (mark >= 75) {
            return "A";
        } else if (mark >= 60) {
            return "B";
        } else if (mark >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    public static void printDetails(String name, double finalMark, String grade) {
        System.out.printf("%-16s%-15.2f%s%n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = sc.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignment = sc.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double exam = sc.nextDouble();

            finalMarks[i] = calcFinalMark(assignment, exam);
        }

        System.out.println();
        System.out.printf("%-16s%-15s%s%n", "Name", "Final Mark", "Grade");

        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], findGrades(finalMarks[i]));
        }
    }
}