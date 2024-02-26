package Online_Shop_App;

//Abstract PrimeAcc
abstract class PrimeAcc extends ShopAcc {
	
	private static final boolean isPrime = true;
	private static final float deliveryCharges = 0;

//	Constructor
	public PrimeAcc(int accNo, String accNm, float charges) {
		super(accNo, accNm, charges); //calling the constructor of the superclass 
	}

	public float TotalCharges() {
		return getCharges() + deliveryCharges;
	}
	
	public abstract void bookProduct();

	@Override
	public String toString() {
		return super.toString() + "\nisPrime = " + isPrime +
				"\ndeliveryCharges = " + deliveryCharges +
				"\nTotal Charge = "+ TotalCharges();
	}
}