// 600(602)+ Lines Of Code
import java.util.Scanner;
import java.util.ArrayList;
class JMart 
{
    static Scanner sc = new Scanner(System.in);
    static String username;
    static String contact;
    static String password;
    static String address;
    static ArrayList<String> cart = new ArrayList<>();
    static double totalBill = 0.0;
    
    public static void main(String[] args) 
	{
        for ( ; ; ) 
		{
            System.out.println();
            System.out.println(" *** *** WELCOME TO JMART *** *** ");
            System.out.println();
			
            System.out.println("1. Existing User");
            System.out.println("2. Create Account");
            System.out.println();
			
            System.out.println("Enter An Option : ");
            int option = sc.nextInt();
            System.out.println();
            
            switch(option) 
			{
                case 1 :
				{
					Login.loginPage();
				}break;
                    
                case 2 :
				{
					Account.createAccountPage();
				}break;
                    
                default:
				{
					System.out.println("You Have Entered Wrong Option!!");
				}break;  
            }
        }
    }
}