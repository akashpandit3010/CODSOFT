import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int roll, mmath, msci, msst, meng, mcomp;
        int total, percentage;
        char grade;

        System.out.println("Welcome to the Marsheet Generator System!!");
        System.out.println("Enter your name: ");
        name = sc.next();
        System.out.println("Enter Roll number: ");
        roll = sc.nextInt();
        System.out.println("Enter marks in Math: ");
        mmath = sc.nextInt();
        if (mmath >= 100 && mmath < 0) {
            System.out.println("Invalid Marks!");
            System.out.println("Enter marks in Math: ");
            mmath = sc.nextInt();
        }
        System.out.println("Enter marks in Science: ");
        msci = sc.nextInt();
        if (msci >= 100 && msci < 0) {
            System.out.println("Invalid Marks!");
            System.out.println("Enter marks in Science: ");
            msci = sc.nextInt();
        }
        System.out.println("Enter marks in Social Science: ");
        msst = sc.nextInt();
        if (msst >= 100 && msst < 0) {
            System.out.println("Invalid Marks!");
            System.out.println("Enter marks in Social Science: ");
            msst = sc.nextInt();
        }
        System.out.println("Enter marks in English: ");
        meng = sc.nextInt();
        if (meng >= 100 && meng < 0) {
            System.out.println("Invalid Marks!");
            System.out.println("Enter marks in English: ");
            meng = sc.nextInt();
        }
        System.out.println("Enter marks in Computer Scince: ");
        mcomp = sc.nextInt();
        if (mcomp >= 100 && mcomp < 0) {
            System.out.println("Invalid Marks!");
            System.out.println("Enter marks in Computer Scince: ");
            mcomp = sc.nextInt();
        }

        total=mmath+msci+msst+meng+mcomp;
        percentage=(total/5);

        if (percentage >= 90) {
            grade = 'O';
        } else if (percentage >= 80) {
            grade = 'A';
        } else if (percentage >= 70) {
            grade = 'B';
        } else if (percentage >= 50) {
            grade = 'C';
        } else if (percentage >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Your Marksheet is here!!");
        System.out.println("Name: "+name);
        System.out.println("Roll No.: "+roll);
        System.out.println("Subject\t\t\t\t |Marks");
        System.out.println("Math\t\t\t\t |"+mmath);
        System.out.println("Science\t\t\t\t |"+msci);
        System.out.println("Social Studies\t\t\t |"+msst);
        System.out.println("English\t\t\t\t |"+meng);
        System.out.println("Computer Science\t\t |"+mcomp);

        System.out.println("Total Marks: "+total);
        System.out.println("Percentage: "+percentage+"%");
        System.out.println("Grade: "+grade);
        
        sc.close();
    }
}
