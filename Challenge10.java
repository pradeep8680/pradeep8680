package Num;

public class Challenge10 {

	public static void main(String[] args) {

                int a;
		
		System.out.println("enter A Week anyone day ");
		
		Scanner pk = new Scanner(System.in);
		a=pk.nextInt();
		
		switch (a) {
		case 1:
		{
			System.out.println("Today is sunday ");
		}
			break
		case 2:
		{
			System.out.println("Today is monday");
		}
			break;	
		case 3:
			System.out.println("Today is Tuesday");
			break;
		case 4:
		{
			System.out.println("Today is  wednesday");
		}
			break;
		case 5:
		{
			System.out.println("Today is Thursday");
		}
			break;	
		case 6:
		{
			System.out.println("Today is friday");
	
		}
			break;
		case 7:
		{
			System.out.println("Today is satureday ");
		}
			break;
		default:
			{
				System.out.println(" a week is do not have a morethen day ");
				break;
			}
						
	}

}
