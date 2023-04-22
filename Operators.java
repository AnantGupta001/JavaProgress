import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number one: ");
        int num1 = sc.nextInt();
        System.out.print("Enter your number two: ");
        int num2 = sc.nextInt();

        // Arithmetic operator
        int num3 = num1 + num2;
        int num4 = num3 % num2;
        System.out.println(num4);

        //Assignment operator
        num4 += 5;
        num4 *= num2;
        System.out.println(num4);

        //Comparison operator
        System.out.println(num4 == num2);
        System.out.println(num2 > num1);
        System.out.println(num3 <= num2);

        //Logical operators
        System.out.println(num1 > 0 && num1 > 1);
        System.out.println(num1 > 40 || num1 < 90);
        System.out.println(num1 != 50);

        //Bitwise operators
        System.out.println(2 & 3);
        System.out.println(2 | 3);


    }

}
