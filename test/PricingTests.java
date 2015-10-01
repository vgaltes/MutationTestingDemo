import static org.junit.Assert.*;
import org.junit.Test;


public class PricingTests {

	@Test
	public void testNormalPricing() {
		Pricing pricing = new Pricing();
		//Not enough for discount
		int amount = 1;
		assertEquals(17, pricing.getPrice(amount, false));		
	}
	
	@Test
	public void tetDiscountPricingByAmount() {
		Pricing pricing = new Pricing();
		//Enough for discount		
		int amount = 100;
		assertEquals(1500, pricing.getPrice(amount, false));		
	}

	@Test
	public void tetDiscountWithCoupon() {
		Pricing pricing = new Pricing();
		//Enough for discount		
		int amount = 1;
		assertEquals(15, pricing.getPrice(amount, true));		
	}
}
