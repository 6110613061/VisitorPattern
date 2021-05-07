public class Water implements ItemElements{
    private int price;
	private String brand;
	
	public Books(int cost, String brand){
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
