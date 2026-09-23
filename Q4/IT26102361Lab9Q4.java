import java.util.Scanner;

public class IT26102361Lab9Q4 {

    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-10s %-12.1f %-5c%n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalStudents = 5;
        String[] names = new String[totalStudents];
        double[] finalMarks = new double[totalStudents];
        char[] grades = new char[totalStudents];

     
        for (int i = 0; i < totalStudents; i++) {
            System.out.print("Enter Name of Student: ");
            names[i] = scanner.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignmentMark = scanner.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double examMark = scanner.nextDouble();

            finalMarks[i] = calcFinalMark(assignmentMark, examMark);
            grades[i] = findGrades(finalMarks[i]);

            System.out.println();
        }

        System.out.printf("%-10s %-12s %-5s%n", "Name", "Final Mark", "Grade");
        System.out.println("------------------------------------");
        for (int i = 0; i < totalStudents; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

    }
}