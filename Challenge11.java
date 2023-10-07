package Num;

import java.util.Scanner;

public class Challenge11 {

	public static void main(String[] args) {
		int a;
		
		Scanner pk =new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		a=pk.nextInt();
		
		if(a % 2 ==1) {
			System.out.println("odd number");
		}
		else {
			System.out.println("even number");
		}
		

	}

}
