package Classwork;
import java.util.Scanner;
public class project11 {



    public class Numbers {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            int number = scan.nextInt();

            if (number > 0 && number <= 100) {

                System.out.println("Your number is: " + number);



            } else {

                System.out.println("Invalid Number!");

            }

        }

    }
}
