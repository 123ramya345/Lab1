

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter a number to find natural numbers: ");
		int n= scn.nextInt();
		System.out.println("Sum of natural numbers is: "+ calculateSum(n));

	}
	
	//Calculate Sum
	static int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 || i%5==0)
				sum=sum+i;
		}
		return sum;
	}

}
