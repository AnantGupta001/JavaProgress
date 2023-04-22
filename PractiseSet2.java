/* Q1: What will be the result of the following expression, float a = 7/4*9/2
   Q2: Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
   Q3: Use comparison operators to find out whether a given number is greater than the user entered number or not?
   Q4: Write the following expression in a java program, v^2 - u^2 / 2as
   Q5: find the value of the following expression:
           int x = 7
           int a = 7*49/7+37/7
           value of a?
*/

import java.util.Scanner;

public class PractiseSet2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ans: 2
        // Encrypt
        char grade = 'B';
        grade = (char) (grade + 8);
        // Decrypt
        grade = (char) (grade - 8);
        System.out.println(grade);

        //Ans 3:
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        System.out.println(num > 8);

        //Ans 4:
        int v = 1;
        int u = 2;
        int a = 3;
        int s = 4;
        int num2 = (v * v - u * u) / (2 * a * s);
        System.out.println(num2);

        //Ans 5:
        int e = 7 * 49 / 7 + 37 / 7;
        System.out.println(e);
    }
}
