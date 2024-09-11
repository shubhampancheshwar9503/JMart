import java.util.Scanner;
class Electronics 
{
    static Scanner sc = new Scanner(System.in);
    
    public static void electronicsPage() 
	{
        for ( ; ; ) 
		{
            System.out.println();
            System.out.println(" **** ELECTRONICS SECTION **** ");
            System.out.println();
			
            System.out.println("1. Mobile(101)");
            System.out.println("2. Laptop(102)");
            System.out.println("3. Smart Watch(103)");
            System.out.println("4. Camera(104)");
            System.out.println("5. Sound Bar(105)");
            System.out.println("6. Home Page(0)");
            System.out.println();
			
            System.out.println("Enter A Product ID : ");
            int productID = sc.nextInt();
            
            switch(productID) 
			{
                case 101 :
				{
                    JMart.cart.add("Mobile : 40000 /-");
                    JMart.totalBill += 40000;
                    System.out.println("Mobile Has Been Added Into Your Cart");
                }break;
				
                case 102 :
				{
                    JMart.cart.add("Laptop : 70000 /-");
                    JMart.totalBill += 70000;
                    System.out.println("Laptop Has Been Added Into Your Cart");
				}break;
				
                case 103 :
				{
                    JMart.cart.add("Smart Watch : 2000 /-");
                    JMart.totalBill += 2000;
                    System.out.println("Smart Watch Has Been Added Into Your Cart");
				}break;
				
                case 104 :
				{
                    JMart.cart.add("Camera : 140000 /-");
                    JMart.totalBill += 140000;
                    System.out.println("Camera Has Been Added Into Your Cart");
				}break; 
				
                case 105 :
				{
                    JMart.cart.add("Sound Bar : 10000 /-");
                    JMart.totalBill += 10000;
                    System.out.println("Sound Bar Has Been Added Into Your Cart");
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