import java.util.Scanner;
class Basic1{
	public static void main(String [] args){
		double pri,r,t,mi,amount;
		int opt;
		Scanner sc= new Scanner(System.in);
		System.out.println("option 1 is Term deposit\noption 2 is Recurring Deposit");
		opt=sc.nextInt();
		switch(opt){
			case 1:
			System.out.println("enter principal amount :");
			pri=sc.nextDouble();
			System.out.println("enter rate of interest :");
			r=sc.nextDouble();
			System.out.println("enter time in years :");
			t=sc.nextDouble();
			amount=pri*(1+(r/100))*t;
			System.out.println("Receivable amount is "+amount);
			break;
			
			case 2:
			System.out.println("enter monthly installment :");
			mi=sc.nextDouble();
			System.out.println("enter rate of interest :");
			r=sc.nextDouble();
			System.out.println("enter time in years :");
			t=sc.nextDouble();
			amount=mi*t+((t*t*mi*r+t*mi*r)/2400);
			//amount=(mi*t)+(mi*t)*(t+1)/2*(r/100)*(1/12);
			System.out.println("Receivable amount is "+amount);
			break;
			
			default:
			System.out.println("Incorrect option!!!");
			}
		}
	}
