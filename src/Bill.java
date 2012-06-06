public class Bill {
	private double total;
	public Bill(Item... items) {
		for (int i = 0; i < items.length; i++) {
			total += items[i].getDiscountedCost();
			 
		}
	}

	public double getTotal() {
		if (total >= 50000) {
			return (1 - 0.05) * total;
		}
		return total;
	}

	public void addItem(Item item) {
		total += item.getDiscountedCost();
	}

}
