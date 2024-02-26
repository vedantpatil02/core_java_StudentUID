package Online_Shop_App;

import java.util.Scanner;

public class ShoppingApp {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the account type: 1.Prime Account or 2.Normal Account ");
	int AccType = sc.nextInt();

	ShopFactory shopFactory = new GSShopFactory();																																						

   PrimeAcc primeAcc = shopFactory.getNewPrimeAcc(1, " Vedant ", 10000, true);

   NormalAcc normalAcc = shopFactory.getNewNormalAcc(2, " Shantanu ", 700, 70);

   switch (AccType) {
   case 1:
       primeAcc.bookProduct();
       System.out.println("Prime Account Details: " + primeAcc.toString());
       break;
   case 2:
       normalAcc.bookProduct();
       System.out.println("Normal Account Details: " + normalAcc.toString());
       break;
   default:
       System.out.println("Enter valid AccType");
       break;
}

     
}
}