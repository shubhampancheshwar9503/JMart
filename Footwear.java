import java.util.Scanner;
class Footwear 
{
    static Scanner sc = new Scanner(System.in);
    
    public static void footwearPage() 
	{
        for ( ; ; ) 
		{
            System.out.println();
            System.out.println(" **** FOOTWEAR SECTION **** ");
            System.out.println();
			
            System.out.println("1. Shoes(301)");
            System.out.println("2. Crocs(302)");
            System.out.println("3. Slippers(303)");
            System.out.println("4. Flip Flop(304)");
            System.out.println("5. Heels(305)");
            System.out.println("6. Home Page(0)");
            System.out.println();
			
            System.out.println("Enter A Product ID : ");
            int productID = sc.nextInt();
            
            switch(productID) 
			{
                case 301 :
				{
                    JMart.cart.add("Shoes : 4000 /-");
                    JMart.totalBill += 4000;
                    System.out.println("Shoes Have Been Added Into Your Cart");
				}break; 
				
                case 302 :
				{
                    JMart.cart.add("Crocs : 1000 /-");
                    JMart.totalBill += 1000;
                    System.out.println("Crocs Have Been Added Into Your Cart");
				}break;
				
                case 303 :
				{
                    JMart.cart.add("Slippers : 500 /-");
                    JMart.totalBill += 500;
                    System.out.println("Slippers Have Been Added Into Your Cart");
				}break;
				
                case 304 :
				{
                    JMart.cart.add("Flip Flop : 1500 /-");
                    JMart.totalBill += 1500;
                    System.out.println("Flip Flop Has Been Added Into Your Cart");
				}break; 
				
                case 305 :
				{
                    JMart.cart.add("Heels : 2000 /-");
                    JMart.totalBill += 2000;
                    System.out.println("Heels Have Been Added Into Your Cart");
				}break;
				
                case 0 :
				{
                    return;
				}
				
                default :
				{
                    System.out.println("Please Enter A Correct Product ID!!");
				}break;
            }
        }
    }
}