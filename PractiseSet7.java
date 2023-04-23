/* Q1: Write a java method to print multiplication table of a number n.

   Q2: Write a program using functions to print the following pattern:

            *
            * *
            * * *
            * * * *

   Q3: Write a recursive function to calculate sum of first n natural numbers.

   Q4: Write a function to print the following pattern:

            * * * *
            * * *
            * *
            *

   Q5: Write a function to print n^th term of fibonacci series using recursion.

   Q6: Write a function to find average of a set of numbers passed as arguments.

   Q7: Repeat 4 using recursion.

   Q8: Repeat 2 using recursion.

   Q9: Write a function to convert Celsius temperature to Fahrenheit.

   Q10: Repeat 3 using iterative approach.
 */

import java.util.Scanner;

public class PractiseSet7 {

    //Ans 1:
    static void table(int a) {
        for (int b = 1; b <= 10; b++) {
            System.out.format("%d\tX\t%d\t=\t%d\n", a, b, (a * b));
        }
    }

    //Ans 2:
    static void upperRightAngledTriangle(int c) {
        for (int d = 0; d <= c; d++) {
            for (int e = 0; e <= d; e++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Ans 3:
    static int naturalSum(int f) {
        if (f == 1) {
            return 1;
        } else {
            return f + naturalSum(f - 1);
        }
    }

    //Ans 4:
    static void lowerRightAngledTriangle(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = h; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Ans 5:
    static int fibonacciSeries(int k) {
        if (k <= 1) {
            return k;
        } else {
            return fibonacciSeries(k - 2) + fibonacciSeries(k - 1);
        }
    }

    //Ans 6:
    static int sumArgs(int... arr) {
        int sum = 0;
        for (int item : arr) {
            sum += item;
        }
        return sum / arr.length;
    }

    //Ans 7:
    static void loweredTriangle(int l) {
        if (l > 0) {
            for (int m = 1; m <= l; m++) {
                System.out.print("* ");
            }
            System.out.println();
            loweredTriangle(l - 1);
        }
    }

    //Ans 8:
    static void upperTriangle(int p) {
        if (p > 0) {
            upperTriangle(p - 1);
            for (int q = 1; q <= p; q++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Ans 9:
    static float celsiusToFahrenheit(float r) {
        return (r * 1.8f) + 32;
    }

    //Ans 10:
    static int naturalSumIterative(int t) {
        int sum = 0;
        for (int v = 1; v <= t; v++) {
            sum += v;
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your value for table: ");
        int tableNum = sc.nextInt();
        table(tableNum);
        System.out.print("Enter your number for URAT: ");
        int uratNum = sc.nextInt();
        upperRightAngledTriangle(uratNum);
        System.out.print("Enter your value for sum: ");
        int sum = sc.nextInt();
        int g = naturalSum(sum);
        System.out.println("sum is: " + g);
        System.out.print("Enter your number for LRAT: ");
        int lratNum = sc.nextInt();
        lowerRightAngledTriangle(lratNum);
        System.out.print("Enter your n^th term: ");
        int fibo = sc.nextInt();
        int fibSum = fibonacciSeries(fibo);
        System.out.println("Sum of fibonacci is: " + fibSum);
        int avg = sumArgs(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("average is: " + avg);
        System.out.print("Enter your value for LoweredTriangle: ");
        int n = sc.nextInt();
        loweredTriangle(n);
        System.out.print("Enter your value for UpperTriangle: ");
        int o = sc.nextInt();
        upperTriangle(o);
        System.out.print("Enter temperature in Celsius: ");
        float s = sc.nextFloat();
        float far = celsiusToFahrenheit(s);
        System.out.println("Fahrenheit temperature is: " + far);
        System.out.print("Enter your value for Sum: ");
        int w = sc.nextInt();
        int sum1 = naturalSumIterative(w);
        System.out.println("Sum is: " + sum1);
    }
}
