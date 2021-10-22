import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String str=sc.next();
		switch(str)
		{    
		case "red": 
		System.out.println("stop");
		break;
		  
		case "green": 
		System.out.println("go");
		break;
		 
		case "yellow": 
		System.out.println("ready");
		break;
		}

	}

}
