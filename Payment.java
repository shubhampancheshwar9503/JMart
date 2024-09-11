import java.util.Scanner;
class Payment 
{
    static Scanner sc = new Scanner(System.in);
    
    public static void paymentPage() 
	{
        System.out.println();
        System.out.println(" *** PAYMENT OPTIONS *** ");
        System.out.println();
		
        System.out.println("1. Credit/Debit Card");
        System.out.println("2. Net Banking");
        System.out.println("3. UPI");
        System.out.println("4. Cash on Delivery");
        System.out.println();
        
        System.out.println("Choose Your Payment Method : ");
        int option = sc.nextInt();
        
        switch(option) 
		{
            case 1 :
			{
                cardPayment();
			}break;
			
            case 2 :
			{
                netBankingPayment();
			}break;
			
            case 3 :
			{
                upiPayment();
			}break;
			
            case 4 :
			{
                cashOnDelivery();
			}break;
			
            default :
			{
                System.out.println("Invalid Option! Please Try Again.");
                paymentPage();
			}break;
        }
    }
    
    private static void cardPayment() 
	{
        System.out.println();
        System.out.println(" *** CREDIT/DEBIT CARD PAYMENT *** ");
        System.out.println();
		
        sc.nextLine();  // Consume newline
        System.out.println("Enter Card Number : ");
        String cardNumber = sc.nextLine();
        System.out.println("Enter Expiry Date (MM/YY) : ");
        String expiryDate = sc.nextLine();
        System.out.println("Enter CVV : ");
        int cvv = sc.nextInt();
        
        System.out.println();
        System.out.println("Processing Payment...");
        confirmPayment();
    }
    
    private static void netBankingPayment() 
	{
        System.out.println();
        System.out.println(" *** NET BANKING PAYMENT *** ");
        System.out.println();
		
        sc.nextLine();  // Consume newline
        System.out.println("Enter Bank Name : ");
        String bankName = sc.nextLine();
        System.out.println("Enter Account Number : ");
        String accountNumber = sc.nextLine();
        System.out.println("Enter IFSC Code : ");
        String ifscCode = sc.nextLine();
        
        System.out.println();
        System.out.println("Processing Payment...");
        confirmPayment();
    }
    
    private static void upiPayment() 
	{
        System.out.println();
        System.out.println(" *** UPI PAYMENT *** ");
        System.out.println();
		
        sc.nextLine();  // Consume newline
        System.out.println("Enter UPI ID : ");
        String upiID = sc.nextLine();
		System.out.println("Enter UPI PIN : "); // Asking for UPI PIN
        String upiPIN = sc.nextLine();
        
        System.out.println();
        System.out.println("Processing Payment...");
        confirmPayment();
    }
    
    private static void cashOnDelivery() 
	{
        System.out.println();
        System.out.println(" *** CASH ON DELIVERY *** ");
        System.out.println();
        System.out.println("Your Order Will Be Paid In Cash Upon Delivery.");
        confirmPayment();
    }
    
    private static void confirmPayment() 
	{
        System.out.println();
        System.out.println("Payment Successful!");
        System.out.println(" *** ORDER CONFIRMED *** ");
        System.out.println();
        System.out.println("Total Amount: " + JMart.totalBill + " /-");
        System.out.println();
        System.out.println("Thank You For Shopping With Us, " + JMart.username + "!");
        System.out.println(" *****     VISIT AGAIN     ***** ");
        System.exit(0);
    }
}