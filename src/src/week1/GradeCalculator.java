package week1;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a grade between 0 and 100 (Q TO EXIT): ");
            if (scanner.hasNext("(?i)q")) {
                scanner.next();
                break;
            }
            if (!scanner.hasNextInt()) {
                System.out.println("Please input a whole number or Q.");
                scanner.next();
                continue;
            }
            int grade = scanner.nextInt();
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade.");
            } else if (grade >= 90) {
                System.out.println("A");
            } else if (grade >= 85) {
                System.out.println("B");
            } else if (grade >= 75) {
                System.out.println("C");
            } else if (grade >= 60) {
                System.out.println("D");
            } else  {
                System.out.println("F");
            }

        }
        scanner.close();

    }
}