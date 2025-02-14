import java.util.Scanner;
class Basic{
	public static void main(String [] args){
		String s;
		int uni,roll;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name : ");
		s=sc.nextLine();
		System.out.println("enter university roll no. : ");
		uni=sc.nextInt();
		System.out.println("enter roll no. : ");
		roll=sc.nextInt();
		
		System.out.println("name is "+s);
		System.out.println("university roll no. is "+uni);
		System.out.println("roll no. is "+roll);
		}
	}
