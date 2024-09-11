import java.util.Scanner;
class Login 
{
    static Scanner sc = new Scanner(System.in);
    
    public static void loginPage() 
	{
        if (JMart.username != null) 
		{
            for (int i = 1; i <= 3; i++) 
			{
                System.out.println();
                System.out.println(" *** LOGIN MODULE *** ");
                System.out.println();
				
                System.out.println("Username/Contact : ");
                String username2 = sc.next();
				
                System.out.println("Password : ");
                String password2 = sc.next();
                
                if (((JMart.username.equals(username2)) || 
                     (JMart.contact.equals(username2))) &&
                     (JMart.password.equals(password2))) 
				{
					System.out.println();
                    System.out.println("LOGIN Successfully");
                    Home.homePage();
                } 
				else 
				{
                    System.out.println();
                    System.out.println("WRONG CREDENTIALS ENTERED!!");
                }
            }
        } 
		else 
		{
            System.out.println();
            System.out.println("CREATE YOUR ACCOUNT FIRST");
            return;
        }
        System.out.println();
        System.out.println("THANK YOU NEVER VISIT AGAIN");
        System.exit(0);
    }
}