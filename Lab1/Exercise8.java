import java.util.Scanner;
public class Exercise8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Input the a number: ");
        int n = sc.nextInt();
        boolean result = isPowerOfTwo(n);
        if(result)
        {
        	System.out.println("this is number is power of two");
        }
        else
        {
        	System.out.println("this is number is not power of two");
        }
        sc.close();
	}

	public static boolean isPowerOfTwo(int n)
	{
		return n !=0 && (((n & ((n-1)))==0));
	}

}
