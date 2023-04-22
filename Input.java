import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1: ");
        int a = sc.nextInt();
        boolean b = sc.hasNextInt();
        System.out.println(a);
        System.out.println(b);
    }
}
