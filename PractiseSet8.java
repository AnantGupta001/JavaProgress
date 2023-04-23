/* Q1: Create a class Employee with following properties and methods:
           Salary(property)(int)
           getSalary(method returning int)
           name (property)(String)
           getName (method returning String)
           setName (method changing name)

   Q2: Create a class Cellphone with methods to print "ringing...", "vibrating..", etc.

   Q3: Create a class Square with a method to initialize its side, calculating area, perimeter, etc.

   Q4: Create a class Rectangle & repeat 3.

   Q5: Create a class TommyVetting for Rockstar Games capable of hitting(print hitting), lemming, firing, etc.

   Q6: Repeat 4 for a Circle.


 */

import java.util.Scanner;

//Ans 1:
class Employee {
    int salary;
    String name;

    public int getSalary(int sal) {
        salary = sal;
        return salary;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }


}

//Ans: 2
class Cellphone {

    static void ringing() {
        System.out.println("Your Phone is ringing.");
    }

    static void vibrating() {
        System.out.println("Your Phone is vibrating.");
    }
}

//Ans: 3
class Square {

    int length;
    int width;
    int area;

    int calculateArea(int l, int w) {
        length = l;
        width = w;
        area = length * width;
        return area;
    }

    double calculatePerimeterSquare(float peri) {
        return 4 * peri;
    }
}

//Ans: 4
class Rectangle {
    int length;
    int width;
    int area;

    int calculateArea(int l, int w) {
        length = l;
        width = w;
        area = length * width;
        return area;
    }

    double calculatePerimeterRectangle() {
        return 2 * (length + width);
    }
}

//Ans: 5
class TommyVetting {
    static void move() {
        System.out.println("Move");
    }

    static void hit() {
        System.out.println("hitting");
    }
}

//Ans: 6
class Circle {
    double radius;
    int area;

    double calculateArea(double r) {
        radius = r;
        double area = (Math.PI) * radius * radius;
        return area;
    }

    double calculatePerimeterCircle() {
        return 2 * (Math.PI) * radius;
    }
}

public class PractiseSet8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.print("Enter your Salary: ");
        int a = sc.nextInt();
        System.out.print("Enter your Name: ");
        int b = emp.getSalary(a);
        String c = sc.next();
        emp.setName(c);
        String d = emp.getName();
        System.out.format("%s's salary is %d.\n", d, b);
        Cellphone.ringing();
        Cellphone.vibrating();
        Square s = new Square();
        int e = s.calculateArea(10, 20);
        double f = s.calculatePerimeterSquare(10f);
        System.out.printf("Area of square: %d\n", e);
        System.out.printf("perimeter of square: %f\n", f);
        Rectangle r = new Rectangle();
        int g = r.calculateArea(10, 20);
        double h = r.calculatePerimeterRectangle();
        System.out.printf("Area of Rectangle: %d\n", g);
        System.out.printf("perimeter of Rectangle: %f\n", h);
        TommyVetting.move();
        TommyVetting.hit();
        Circle cir = new Circle();
        double j = cir.calculateArea(10);
        System.out.printf("Area of Circle: %f\n", j);
        double k = cir.calculatePerimeterCircle();
        System.out.printf("Perimeter of Circle: %f\n", k);
    }
}
