/* Q-1 : Write a program to sum 3 number in java.
   Q-2 : Write a program to calculate CGPA using marks of three subjects.
   Q-3 : Write a Java program to calculate which ask the user to enter his/her name and greets then with "Hello <name>, have a good day" text.
   Q-4 : Write a java program to convert kilometer to miles.
   Q-5 : Write a java program to detect whether a number enter by the user is integer or not? */

import java.util.Scanner;

public class PractiseSet1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ANS  1 :
        System.out.print("Enter your first number: ");
        int a = sc.nextInt();
        System.out.print("Enter your second number: ");
        int b = sc.nextInt();
        System.out.print("Enter your third number: ");
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.print("Sum is: ");
        System.out.println(sum);

        // ANS 2:
        System.out.print("Enter your credits: ");
        float credits = sc.nextInt();
        System.out.print("Enter your grades: ");
        float grades = sc.nextInt();
        float cgpa = (grades * credits) / credits;
        System.out.println("CGPA is :" + cgpa);

        // ANS 3:
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.printf("Hello %s, have a good day." + "\n", name);

        // ANS 4:
        System.out.print("Enter number of kilometers: ");
        int kilometers = sc.nextInt();
        double miles = kilometers * 0.62137;
        System.out.printf("%d Kilometers in Miles are: " + miles + "\n", kilometers);

        // ANS 5:
        System.out.print("Enter an integer: ");
        System.out.println(sc.hasNextInt());
    }
}


