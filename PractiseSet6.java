/* Q1: Create an array of 5 floats and calculate their sum.
   Q2: Write a program to find out whether a given integer is present in an array or not?
   Q3: Calculate the average marks from an array containing the marks of all students in Physics using for loops.
   Q4: Create a java program to add two matrices of size 3x3.
   Q5: Write a java program to reverse an array.
   Q6: Write a java program to find the max. element in an array.
   Q7: Write a java program to find the min. element in an array.
   Q8: Write a java program to find whether an array is sorted or not?
 */

import java.util.Scanner;

public class PractiseSet6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ans 1:
        float[] ani = new float[5];     // declaration + memory allocation
        float sum = 0.0f;
        for (int a = 0; a < ani.length; a++) {
            System.out.print("Enter your Number: ");
            ani[a] = sc.nextFloat();                       // initialization
            sum += ani[a];                                //  summation of values
        }
        System.out.println("Sum is :" + sum);             // printing the sum

        //Ans 2:
        System.out.println("Enter an integer: ");
        int b = sc.nextInt();
        int[] anu = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int c = 0; c < anu.length; c++) {
            if (b == anu[c]) {
                System.out.printf("Yes %d is present in an array at index '%d'.\n", b, c);
                break;
            }
        }

        //Ans 3:
        float avgMark = sum / ani.length;
        System.out.println("average mark is: " + avgMark);

        //Ans 4:
        /*
        logic :
        arr1 =  [1,2,3
                 4,5,6
                 7,8,9]

        here 5 is  arr1[1][1]

        arr2 =  [11,12,13
                 14,15,16
                 17,18,19]

        here  15 is  arr1[1][1]

        hence arr3[i][j] = arr1[i][j] + arr2 [i][j]
         */
        int[][] arr1 = new int[3][3];                                   // declaration arr1
        int[][] arr2 = new int[3][3];                                  // declaration arr2
        int[][] arr3 = new int[3][3];                                 // declaration arr3

        System.out.println("Enter Numbers for array1: ");
        for (int d = 0; d < arr1.length; d++) {
            for (int e = 0; e < arr1[d].length; e++) {
                System.out.print("Enter your Number: ");
                arr1[d][e] = sc.nextInt();                              // initialization arr1
            }
        }
        System.out.println("Enter Numbers for array2: ");
        for (int f = 0; f < arr2.length; f++) {
            for (int g = 0; g < arr1[f].length; g++) {
                System.out.print("Enter your Number: ");
                arr2[f][g] = sc.nextInt();                              // initialization arr2
            }
        }

        for (int h = 0; h < arr3.length; h++) {
            for (int i = 0; i < arr1[h].length; i++) {
                arr3[h][i] = arr1[h][i] + arr2[h][i];
                System.out.print(arr3[h][i] + " ");
            }
            System.out.println();
        }

        //Ans 5:
        /*
        logic :
        arr4 = {1,2,3,4,5}
        reversedArr4 = {5,4,3,2,1}
          arr[0] = 1 = x and arr4[arr.length-1] = 5 = y
          y = arr[0] and x = arr4[arr.length-1]

         */
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] arr5 = new int[arr4.length];
        for (int j = 0; j < Math.floorDiv(arr4.length, 2); j++) {
            int l = arr4[j];
            int m = arr4[arr4.length - 1 - j];
            arr5[j] = m;
            arr5[arr5.length - 1 - j] = l;
        }
        for (int element : arr5) {
            System.out.print(element);
        }

        //Ans 6,7:
        /*
        logic:
        arr = {12,34,232,21,54,1,5,6}
        maxNum = min value of int
        if element > maxNum
        maxNum = element
        minNum = max value of int
        if element < minNum
        minNum = element
         */
        int[] arr6 = {1, 2, 3, 33, 65, 927, 272, 173, 282};
        int maxNum = Integer.MIN_VALUE;
        for (int n : arr6) {
            if (n > maxNum) {
                maxNum = n;
            }
        }
        int minNum = Integer.MAX_VALUE;
        for (int o : arr6) {
            if (o < minNum) {
                minNum = o;
            }
        }
        System.out.println("Maximum Number is: " + maxNum);
        System.out.println("Minimum Number is: " + minNum);

        //Ans 8:
        /*
        if arr[i] > arr[i+1] then not sorted!
         */
        for (int p = 0; p < arr6.length - 1; p++) {
            if (arr6[p] > arr6[p + 1]) {
                System.out.println("array is not sorted!");
                break;
            }
        }

    }
}
