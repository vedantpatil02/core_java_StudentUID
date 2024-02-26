package Online_Shop_App;


class GSPrimeAcc extends PrimeAcc {
	private static final float charges = 10000;

	public GSPrimeAcc(int accNo, String accNm) {
		super(accNo, accNm, charges);
	}

	@Override
	public void bookProduct() {
		System.out.println("Booking product for Prime Account\n");
	}
}
