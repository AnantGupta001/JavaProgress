// fibonacci series : 0 1 1 2 3 5 8 13 21 34 ...

import java.util.Scanner;

public class FibonacciSeries {
    static int fibonacciSeries(int x) {
        if (x <= 1) {
            return x;
        } else {
            return fibonacciSeries(x - 1) + fibonacciSeries(x - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.println(fibonacciSeries(a));

    }
}
