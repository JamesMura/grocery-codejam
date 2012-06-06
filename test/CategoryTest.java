import junit.framework.Assert;

import org.junit.Test;


public class CategoryTest {

	@Test
	public void testDiscountedValue() {
		Category medicine = new Category(0.05, "medicine");
		Assert.assertEquals(9500.0, medicine.getDiscountedValue(10000));
	}

}
