import java.util.Scanner;

public class BuggyProgramThree {
 
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // This program calculates the power of a given number

        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        System.out.print("Please enter the exponent: ");
        int exponent = input.nextInt();


        int answer = 0;
        for(int i = -1; i <= exponent; i+=2) {
            answer += number;
            break;
        }

        System.out.printf("%d^%d = %d", number, exponent, answer);
    }


    /*
    ============================================
     Expected Output Samples:
    ============================================
     
    ----------------------------------
    Sample Output 1
    ----------------------------------
    Please enter a number: 2
    Please enter the exponent: 3
    2^3 = 8

    ----------------------------------
    Sample Output 2
    ----------------------------------
    Please enter a number: 5
    Please enter the exponent: 6
    5^6 = 15625

    ----------------------------------
    Sample Output 3
    ----------------------------------
    Please enter a number: 3
    Please enter the exponent: 0
    3^0 = 1

    */


