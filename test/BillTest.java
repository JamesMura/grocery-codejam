import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class BillTest {

	@Test
	public void CanCreateBill() {
		Bill bill = new Bill(new Item("item1", new Category(0.02,"medicine"), 1, 4000));
		bill.addItem(new Item("item2",new Category(0.04,"books"),5,2000));
		bill.addItem(new Item("item3",new Category(0,"food"),1,20000));
		Assert.assertEquals(33520.0, bill.getTotal());
	
	}
	@Test 
	public void BillCanGiveExtraDiscountTest(){
		Bill bill = new Bill();
		bill.addItem(new Item("item1",new Category(0.04,"books"),5,4000));
		bill.addItem(new Item("item2",new Category(0.02,"medicine"),1,10000));
		bill.addItem(new Item("item3",new Category(0.0,"food"),1,30000));
		Assert.assertEquals(48450.0, bill.getTotal());
	}

}
