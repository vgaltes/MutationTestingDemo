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
	
	@Test
	public void testGetAnotherPriceWithAnAmountDifferentThan5Items(){
		Pricing pricing = new Pricing();
		int amount = 10;
		assertEquals(50, pricing.getAnotherPrice(amount));
	}
	
	@Test
	public void testGetAnotherPriceWithAmountOf5(){
		Pricing pricing = new Pricing();
		
		int amount = 5;
		assertEquals(50, pricing.getAnotherPrice(amount));
	}
}
