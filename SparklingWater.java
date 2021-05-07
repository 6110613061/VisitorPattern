public class SparklingWater implements ItemElements{
	private int price;
	private String brand;
	
	public Fruits(int cost, String brand){
		this.price=cost;
		this.brand=brand;
	}
	
	public int getPrice() {
		return price;
	}

	public String getBrand() {
		return brand;
	}
	
	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}
