/*  Q: Write a java program to calculate percentage of a given student in CBSE boards exam.
       his marks from 5 subjects must be taken as input from the keyboard. */

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total marks: ");
        int totalMarks = sc.nextInt();
        System.out.println("Enter marks of Subject 1: ");
        int a = sc.nextInt();
        System.out.println("Enter marks of Subject 2: ");
        int b = sc.nextInt();
        System.out.println("Enter marks of Subject 3: ");
        int c = sc.nextInt();
        System.out.println("Enter marks of Subject 4: ");
        int d = sc.nextInt();
        System.out.println("Enter marks of Subject 5: ");
        int e = sc.nextInt();
        float sumOfMarks = (a + b + c + d + e);
//        int meanMarks = sumOfMarks / 5;
        float percentage = (sumOfMarks / (totalMarks * 5)) * 100;
        System.out.println("Percentage is : " + percentage);
    }
}
