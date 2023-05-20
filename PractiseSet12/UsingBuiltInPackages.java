public class UsingBuiltInPackages {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter your input: ");
        int a = sc.nextInt();

        System.out.println("Here is your output: " + a * a);
    }
}
