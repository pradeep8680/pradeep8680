package Num;

public class Challenge12 {

	public static void main(String[] args) {
		int	i,j;
		
		for(i=1;i<=5;i++)	{
			for(j=1;j<=i;j++) {
			System.out.print("*");
		}
			System.out.println();
	  }	
		
		for(i=1;i<=4;i++) {
			for(j=i;j<=4;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

