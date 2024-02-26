package Online_Shop_App;

//Abstract NormalAcc
abstract class NormalAcc extends ShopAcc {
	private float deliveryCharges;

//	Constructor
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}

	public float getDeliveryCharges() {
		return deliveryCharges;
	}
	
	public float TotalCharges() {
		return getCharges() + deliveryCharges;
	}
	public abstract void bookProduct();

	@Override
	public String toString() {
		return super.toString() + "\ndeliveryCharges=" + deliveryCharges
				+ "\nTotal Charges = "+ TotalCharges();
	}
}
