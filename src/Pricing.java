
public class Pricing {
	public int getPrice(int amountOfThings, boolean coupon){
		if ( amountOfThings >= 20 || coupon){
			return amountOfThings * 15;
		}
		
		return amountOfThings * 17;
	}
}
