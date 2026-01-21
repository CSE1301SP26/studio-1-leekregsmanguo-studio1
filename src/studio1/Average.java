
package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class Average {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		System.out.println("The first of two integers to be averaged?");
		int n1 = in.nextInt();
		System.out.println("The second of two integers to be averaged?");
        int n2 = in.nextInt();
		System.out.println("The average is " + ((double)n1+n2)/2);
		//
		// Say hello to the names in s0 through s3.
		//

	}
}