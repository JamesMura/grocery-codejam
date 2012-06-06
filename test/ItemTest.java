import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class ItemTest {

	@Test
	public void CanGetDiscountedCostTest() {
		Item item1 = new Item("item1",	 new Category(0.02,"medicine")	, 1, 4000);
		Assert.assertEquals(3920.0, item1.getDiscountedCost());
	}

}
