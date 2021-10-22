import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag =false;
		System.out.print("Input the a number: ");
        int n = sc.nextInt();
        
        int currentdigit = n%10;
        n=n/10;
        
        while(n>0)
        {
        	if(currentdigit <= n%10)
        	{
        		flag = true;
        		break;
        	}
        	currentdigit = n%10;
            n=n/10;
        }
		if(flag)
		{
			System.out.println("Digits are not in increasing order");
		}
		else
		{
			
			System.out.println("Digits are in increasing order");
		}

	}

}
