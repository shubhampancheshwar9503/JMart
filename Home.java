import java.util.Scanner;
class Home 
{
    static Scanner sc = new Scanner(System.in);
    
    public static void homePage() 
	{
        for ( ; ; ) 
		{
            System.out.println();
            System.out.println(" *** ** HOME PAGE ** *** ");
            System.out.println();
			
            System.out.println("1. Electronics");
            System.out.println("2. Clothing");
            System.out.println("3. Footwear");
            System.out.println("4. Cart");
            System.out.println("5. Logout");
            System.out.println();
			
            System.out.println("Enter An Option : ");
            int option = sc.nextInt();
            
            switch(option) 
			{
                case 1 :
				{
					Electronics.electronicsPage();
				}break;
                    
                case 2 :
				{
                    Clothing.clothingPage();
				}break;
				
                case 3  :
				{
                    Footwear.footwearPage();
				}break;
				
                case 4:
				{
                    Cart.cartPage();
				}break;
				
                case 5:
				{
                    System.exit(0);
				}break;
			
                default:
				{
                    System.out.println("You Have Entered Wrong Option!!");
				}break;
            }
        }
    }
}