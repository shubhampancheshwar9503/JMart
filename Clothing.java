import java.util.Scanner;
class Clothing 
{
    static Scanner sc = new Scanner(System.in);
    
    public static void clothingPage() 
	{
        for ( ; ; ) 
		{
            System.out.println();
            System.out.println(" **** CLOTHING SECTION **** ");
            System.out.println();
			
            System.out.println("1. Shirt(201)");
            System.out.println("2. Tshirt(202)");
            System.out.println("3. Jeans(203)");
            System.out.println("4. Blazer(204)");
            System.out.println("5. Trouser(205)");
            System.out.println("6. Home Page(0)");
            System.out.println();
			
            System.out.println("Enter A Product ID : ");
            int productID = sc.nextInt();
            
            switch(productID) 
			{
                case 201 :
				{
                    JMart.cart.add("Shirt : 1000 /-");
                    JMart.totalBill += 1000;
                    System.out.println("Shirt Has Been Added Into Your Cart");
				}break;
				
                case 202 :
				{
                    JMart.cart.add("Tshirt : 500 /-");
                    JMart.totalBill += 500;
                    System.out.println("Tshirt Has Been Added Into Your Cart");
				}break;
				
                case 203 :
				{
                    JMart.cart.add("Jeans : 2000 /-");
                    JMart.totalBill += 2000;
                    System.out.println("Jeans Has Been Added Into Your Cart");
				}break;
				
                case 204 :
				{
                    JMart.cart.add("Blazer : 5000 /-");
                    JMart.totalBill += 5000;
                    System.out.println("Blazer Has Been Added Into Your Cart");
				}break;
				
                case 205 :
				{
                    JMart.cart.add("Trouser : 1500 /-");
                    JMart.totalBill += 1500;
                    System.out.println("Trouser Has Been Added Into Your Cart");
				}break;
				
                case 0 :
				{
                    return;
				}
				
                default :
				{
                    System.out.println("You Have Entered Wrong Product ID!!");
				}break;
            }
        }
    }
}