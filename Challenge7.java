package Num;

public class Challenge7 {

	public static void main(String[] args) {
		int a=100;
		
		  if((a <= 100) && (a<=90)){
			System.out.println(" I Rank");
		   }
			else if((a<=90) && (a>80)){
				System.out.println(" II Rank");
		    }
			else if((a<=80) && (a>70)) {
				System.out.println(" III Rank ");	
			}
			else if((a<=70) && (a>60)) {
				System.out.println("IV Rank");	
			}
			else if((a<=60)&&(a>50)) {
				System.out.println("V Rank");	
			}
			else if((a<=50)&&(a>40)) {
				System.out.println("V Rank");	
			}
			else {
				System.out.println("your fail");
			}
	}

}
