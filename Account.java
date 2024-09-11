import java.util.Scanner;
class Account 
{
    static Scanner sc = new Scanner(System.in);
    
    public static void createAccountPage() 
	{
        System.out.println();
        System.out.println(" *** CREATE YOUR ACCOUNT FIRST *** ");
        System.out.println();
		
        System.out.println("Enter Your Username : ");
        JMart.username = sc.nextLine();
		System.out.println();
		
        System.out.println("Enter Your Contact Number : ");
        JMart.contact = sc.next();
		System.out.println();
		
        System.out.println("Enter Your Password : ");
        JMart.password = sc.next();
		System.out.println();
		
        System.out.println("Enter Your Address : ");
        sc.nextLine();
        JMart.address = sc.nextLine();
        System.out.println();
		
        System.out.println("Account Created Successfully");
        System.out.println();
    }
}