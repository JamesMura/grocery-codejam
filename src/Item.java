
public class Item {

private String name;
private Category category;
private double quantity;
private double price;
public Item(String name, Category category, double quantity,double price) {
	this.name = name;
	this.category = category;
	this.quantity = quantity;
	this.price=price;
}
 
public double getDiscountedCost(){
	return category.getDiscountedValue(price*quantity);
}
public double getCost(){
	return price*quantity;
}


}
