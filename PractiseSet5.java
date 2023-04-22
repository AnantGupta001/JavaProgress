/* Q1: Write a java program to print the following pattern.
        * * * *
        * * *
        * *
        *
   Q2: Write a program to sum first m even numbers using while loop.

   Q3: Write a program to print multiplication table of a given number m.

   Q4: Write a program to print multiplication table of 10 in reverse order.

   Q5: Write a program to find factorial of a given number using for loops.

   Q6: Repeat 5 using while loop.

   Q7: Repeat 1 using for/while loop.

   Q8: What can be done using one type of loop can also be done using other two type of loops . true/false?

   Q9: Write a program to calculate the sum of the numbers occur in the multiplication table of 8.

   Q10: A do-while loop is executed:
            > at least one time
            > at least two time
            > at least three time

   Q11: Repeat 2 using for loop.

 */

import java.util.Scanner;

public class PractiseSet5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ans 1:
        System.out.print("Enter pattern size: ");
        int a = sc.nextInt();
        for (int b = 1; b <= a; b++) {
            for (int c = a; c >= b; c--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Ans 2:
        System.out.print("Enter your number: ");
        int d = sc.nextInt();
        int sum = 0;
        int e = 2;
        while (e < d) {
            sum += e;
            e += 2;
        }
        System.out.println("Sum is: " + sum);

        //Ans 3:
        System.out.println("Table:");
        for (int f = 1; f <= 10; f++) {
            System.out.println(d + " x " + f + " = " + (d * f));
        }

        //Ans 4:
        System.out.println("Table of 10 in reverse order: ");
        for (int g = 10; g >= 1; g--) {
            System.out.println("10 x " + g + " = " + (10 * g));
        }

        //Ans 5:
        int forFact = 1;
        for (int h = 1; h <= d; h++) {
            forFact *= h;
        }
        System.out.println("Factorial using for loop: " + forFact);

        //Ans 6:
        int i = 1;
        int whileFact = 1;
        while (i <= d) {
            whileFact *= i;
            i++;
        }
        System.out.println("Factorial using while loop: " + whileFact);

        //Ans 7:
        int j = 1;
        while (j <= 4) {
            int k = 4;
            while (k >= j) {
                System.out.print("* ");
                k--;
            }
            System.out.println();
            j++;
        }

        //Ans 8: True

        //Ans 9:
        int sum8 = 0;
        for (int l = 1; l <= 10; l++) {
            sum8 += 8 * l;
        }
        System.out.println("sum of the number occur in table 8: " + sum8);

        //Ans 10: at least one time

        //Ans 11:
        int sumFor = 0;
        for (int m = 2; m < d; m += 2) {
            sumFor += m;
        }
        System.out.println("Sum :" + sumFor);
    }
}
