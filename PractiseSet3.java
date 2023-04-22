/* Q1: Write a java program to convert a string to lowercase.
   Q2: Write a java program to replace spaces with underscores.
   Q3: Write a java program to fill in a letter template which looks like below:
            letter = "Dear <name>, Thanks a lot"
            Replace <name> with a string(some name)
   Q4: Write a java program to detect double and triple spaces in a string.
   Q5: Write a java program to format the following letter using escape sequence characters.
            letter = "Dear Harry, This Java Course is nice. Thanks"
 */

import java.util.Scanner;

public class PractiseSet3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ANS 1:
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.println("Without lowercase: " + sentence);
        sentence = sentence.toLowerCase();
        System.out.println("With lowercase: " + sentence);

        //ANS 2:
        System.out.println("With spaces : " + sentence);
        sentence = sentence.replace(" ", "_");
        System.out.println("Without spaces: " + sentence);

        //ANS 3:
        System.out.print("Enter your name: ");
        String name = sc.next();
        String letter = "Dear <name>,\nThanks a lot.";
        letter = letter.replace("<name>", name);
        System.out.println(letter);

        //ANS 4:
        String spaces = "Hi  My   name is Anant.   ";
        int double_spaces = spaces.indexOf("  ");
        int triple_spaces = spaces.indexOf("   ");
        System.out.println("Double spaces: " + double_spaces);
        System.out.println("Triple spaces: " + triple_spaces);

        //ANS 5:
        System.out.println("Dear Harry,\n \tThis Java Course is nice.\nThanks");

    }
}
