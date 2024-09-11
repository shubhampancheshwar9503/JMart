import java.util.Scanner;
import java.util.ArrayList;
class Cart 
{
    static Scanner sc = new Scanner(System.in);
    
    public static void cartPage() 
	{
        ArrayList<String> cart1 = new ArrayList<>(JMart.cart);
        
        for ( ; ; ) 
		{
            System.out.println();
            System.out.println(" ***** CART ***** ");
			System.out.println();
            System.out.println(" *** YOU PURCHASED *** ");
            
            for (String product : cart1) 
			{
                System.out.println(product);
            }
            
            System.out.println();
            System.out.println(JMart.username + " Your Total Bill is : " + JMart.totalBill);
            System.out.println();
            System.out.println("Do You Want To Remove Some Product (Yes/No) : ");
            String opt1 = sc.next();
            
            if (opt1.equalsIgnoreCase("Yes")) 
			{
                System.out.println("Enter The Product Name : ");
                sc.nextLine();  // Consume the newline character
                String productName = sc.nextLine();
                int index = 0;
                
                for (String product : cart1) 
				{
                    String[] arr = product.split(" ");
                    
                    if (arr[0].equalsIgnoreCase(productName)) 
					{
                        JMart.cart.remove(index);
                        JMart.totalBill -= Double.parseDouble(arr[2]);
                        System.out.println();
                        System.out.println("Removed " + productName + " From The Cart");
                        System.out.println();
                        break;
                    }
                    index++;
                }
            }
            
            System.out.println();
            System.out.println("Do You Want To Check Out (Yes/No) : ");
            String opt = sc.next();
            
            if (opt.equalsIgnoreCase("Yes")) 
			{
                System.out.println();
                Payment.paymentPage();  // Redirect to payment module
            } 
			else 
			{
                return;
            }
        }
    }
}