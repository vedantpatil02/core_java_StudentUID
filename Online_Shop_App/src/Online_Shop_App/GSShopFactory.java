package Online_Shop_App;


class GSShopFactory extends ShopFactory {
	
	@Override
	public PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		return new GSPrimeAcc(accNo, accNm);
	}

	@Override
	public NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		return new GSNormalAcc(accNo, accNm);
	}
}