import java.util.Random;
import java.util.Scanner;

//------------------------------------------------------------------
// Garrett McCue 
// 07/18/20
// SU2-CPSC-501-002
// Programming Fundamentals
// Program 1
//
// This encodes each digit in a number that is given by the user.
// To encode each digit they will be added to the key value that is
// randomly generated followed by modulo 10. 
//
// if the number is 57, and the key is 4
// The encoded number will be 91, since (5+4)%10=9 and (7+4)%10=1
//------------------------------------------------------------------

public class Cipher {

	public static void main(String[] args) {

		int key;
		int num_1, num_2, num_3, num_4, num_5;
		int num_sum, num_sumA, num_sumB;
		int encoded_A, encoded_B;
		String encoded_num;

		Scanner scan = new Scanner(System.in);
		Random gen = new Random();

		// Displays assignment information
		// also displays cipher program instructions
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Garrett McCue");
		System.out.println("PROGRAMMING ASSIGNMENT 1");
		System.out.println();
		System.out.println("Welcome to the Cipher program.");
		System.out.println("Please enter 5 numbers between 0 and 19");

		// read in value for num 1, and exit program if outside given bounds
		System.out.print("1st number: ");
		num_1 = scan.nextInt();

		if (num_1 < 0) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}

		if (num_1 > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}

		// read in value for num 2, and exit program if outside of bounds
		System.out.print("2nd number: ");
		num_2 = scan.nextInt();

		if (num_2 < 0) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}

		if (num_2 > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}

		// read in value for num 3, and exit program if outside of bounds
		System.out.print("3rd number: ");
		num_3 = scan.nextInt();

		if (num_3 < 0) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}

		if (num_3 > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}

		// read in value for num 4, and exit program if outside of bounds
		System.out.print("4th number: ");
		num_4 = scan.nextInt();

		if (num_4 < 0) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}

		if (num_4 > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}

		// read in value for num 5, and exit program if outside of bounds
		System.out.print("5th number: ");
		num_5 = scan.nextInt();

		if (num_5 < 0) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}

		if (num_5 > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}

		// sum all 5 numbers from user, and display the value
		num_sum = num_1 + num_2 + num_3 + num_4 + num_5;
		System.out.println();
		System.out.println("Total = " + num_sum);

		// generating random key from range 0-9
		key = gen.nextInt(10);
		System.out.println("Your random key is " + key);

		// splitting the digits in num_sum, into ones & tens place
		if (num_sum >= 10) {
			num_sumA = 1;
			num_sumB = num_sum % 10;
		} else
			num_sumA = 0;
		num_sumB = num_sum % 10;

		// encoded value for the 10s place from num_sumA & key
		encoded_A = (num_sumA + key) % 10;

		// encoded value for the 10s place from num_sumB & key
		encoded_B = (num_sumB + key) % 10;

		// converting A and B integers to strings for string
		// concatenation in order to get the final encoded num.
		encoded_num = (Integer.toString(encoded_A) + Integer.toString(encoded_B));
		System.out.println("Your encoded number is " + encoded_num);

	}

}
