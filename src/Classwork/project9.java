package Classwork;

public class project9 {
    public static void main(String[] args) {
        int[] arr = new int[]{14, 23, 45, 67, 66, 78, 31, 43, 68, 40};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[1] / 10;
            int max = integer.Min_Value;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max)
                    max = arr[i];

                System.out.println("The sum of all elements is : " + sum);

            }
        }

   }
