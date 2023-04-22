/* Q1: What will be the output of this program:
        int a = 10;
        if (a = 11){
            System.out.println("I am 11")
            }
        else{
            System.out.println("I am not 11")
            }

    Q2: Write a program to find out whether a student is pass or fail;
        if it requires total 40% and at least 33% in each subject to pass.
        Assume 3 subjects and take marks as an input from the user.

    Q3: Calculate income tax paid by an employee to the government as per the slabs mentioned below:
           income slab                      tax
           2.5L - 5.0L                      5%
           5.0L - 10.0L                     20%
           Above 10.0L                      30%

           Note that there is no tax below 2.5L. Take amount as input from the user.

    Q4: Write a JAva program to find out the day of the week given the number
        [1 for Monday, 2 for Tuesday, 3 for Wednesday, 4 for Thursday, 5 for Friday, 6 for Saturday, 7 for Sunday]

    Q5: Write a java program to find whether a year entered by the user is a leap year or not?

    Q6: Write down the program to find out the type of website form the url:
            .com = commercial website
            .org = organisational website
            .in  = indian website

 */

import java.util.Scanner;

public class PractiseSet4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ans 1:
        // Error

        // Ans 2:
        System.out.print("Enter your Marks of Physics: ");
        float phy = sc.nextFloat();
        System.out.print("Enter your Marks of Chemistry: ");
        float chy = sc.nextFloat();
        System.out.print("Enter your Marks of Maths: ");
        float mat = sc.nextFloat();
        float total = phy + chy + mat;
        if (phy >= 0.33 && chy >= 0.33 && mat >= 0.33 && total >= 0.40) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        //Ans 3:
        System.out.print("Enter your Salary: ");
        double salary = sc.nextDouble();
        double tax;
        if (salary < 250000) {
            tax = 0;
            System.out.println("Tax: " + tax);
            System.out.println("Salary after tax deduction: " + (salary - tax));
        } else if (salary >= 250000 && salary <= 500000) {
            tax = (salary - 250000) * 0.05;
            System.out.println("Tax: " + tax);
            System.out.println("Salary after tax deduction: " + (salary - tax));
        } else if (salary > 500000 && salary <= 1000000) {
            tax = (salary - 250000) * 0.20;
            System.out.println("Tax: " + tax);
            System.out.println("Salary after tax deduction: " + (salary - tax));
        } else {
            tax = (salary - 250000) * 0.30;
            System.out.println("Tax: " + tax);
            System.out.println("Salary after tax deduction: " + (salary - tax));
        }

        //Ans 4:
        System.out.print("Enter day number: ");
        byte day = sc.nextByte();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

        //Ans 5:
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("Yes");
        } else {
            System.out.println("Nope");
        }

        //Ans 6:
        System.out.print("Enter your website: ");
        String website = sc.nextLine();
        if (website.endsWith(".com")) {
            System.out.println("Commercial Website");
        } else if (website.endsWith(".org")) {
            System.out.println("Organisational Website");
        } else if (website.endsWith(".in")) {
            System.out.println("Indian website");
        }
    }
}
