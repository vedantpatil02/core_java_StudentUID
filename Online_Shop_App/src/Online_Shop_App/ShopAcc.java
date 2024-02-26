package Online_Shop_App;

abstract class ShopAcc { 	
	private int accNo;
	private String accNm;
	private float charges;

	//Constructor
	public ShopAcc(int accNo, String accNm, float charges) {  
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}

	public int getAccNo() { //to retrieve account details
		return accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public float getCharges() {
		return charges;
	}

	public abstract void bookProduct();

	@Override
	public String toString() { 	//string representation of the object
		return "ShopAcc\nAcc No = " + accNo +
     	 "\nAcc Name =" + accNm + "\nProduct Charges = " + charges;
	}
}
