import java.util.Scanner;
public class IT26102361Lab9Q4 {


    public static double calcFinalMark(double aMark, double eMark){
        double finalMark = (aMark * 30/100) + (eMark * 70/100);
        return finalMark;
    }

    public static char findGrades(double finalMark){

        char grade;

        if(finalMark >= 75){
            grade = 'A';
        }
        else if(finalMark >= 60){
            grade = 'B';
        }
        else if(finalMark >= 50){
            grade = 'C';
        }
        else{
            grade = 'F';
        }
        return grade;
    }

    public static void printDetails(String name, double finalMark, char grad){


        System.out.println(name + "\t\t" + finalMark + "\t\t" + grad);


    }



    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String name[] = new String[5];

        double aMarks[] = new double[5];
        double eMarks[] = new double[5];
        double finalMarks[] = new double[5];
        double finalP[] = new double[5];

        char grads[] = new char[5];


        for(int i=0; i<5; i++){

            System.out.print("Enter name of student" + (i+1)+ ": ");
            name[i] = input.next();

            System.out.print("Enter Assignment mark of student" + (i+1)+ ": ");
            aMarks[i] = input.nextDouble();

            System.out.print("Enter Exam mark of student" + (i+1)+ ": ");
            eMarks[i] = input.nextDouble();

            finalMarks[i] = calcFinalMark(aMarks[i],eMarks[i]);
            grads[i] = findGrades(finalMarks[i]);



        }


        System.out.println("Name\t\tFinal Marks\t\tGrade");

        for (int i = 0; i < 5; i++) {
            printDetails(name[i], finalMarks[i], grads[i]);
        }







    }

}
