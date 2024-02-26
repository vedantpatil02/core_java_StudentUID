package Online_Shop_App;


abstract class ShopFactory {
	public abstract PrimeAcc getNewPrimeAcc(int accNo, String accNm,
			float charges, boolean isPrime); //method that create instance of PrimeAcc
	
	public abstract NormalAcc getNewNormalAcc(int accNo, String accNm, 
			float charges, float deliveryCharges);
}
