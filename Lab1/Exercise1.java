import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Input the a number: ");
        int num1 = sc.nextInt();
        int sum=0;
        while(num1!=0)
        {
        int digit= num1%10;
        sum=sum+digit*digit*digit;
        num1=num1/10;
        }
        System.out.println("The sum of cubes of digits of the given number is " +sum);
	}
}
