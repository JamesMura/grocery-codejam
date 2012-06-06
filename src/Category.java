
public class Category {
	private double discount;
	private String name;
	public Category(double discount, String name) {
		this.discount = discount;
		this.name = name;
	}
	public double getDiscountedValue(double price){
		double actualDiscount = price*discount;
		return price - (actualDiscount);
	}
}
