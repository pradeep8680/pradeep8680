package Num;
import java.util.Scanner;	

public class Challenge6 {

	public static void main(String[] args) {
		int	a=18;
		
		int	b;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the your age");
		
		b=sc.nextInt();
		
		if(a <=b )
		{
			System.out.println("your eligible for vote");
		}
		else {
			System.out.println("your not	eligible for vote");
		}

	}

}
