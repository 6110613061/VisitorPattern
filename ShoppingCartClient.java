public class ShoppingCartClient {
    public static void main(String[] args) throws Exception {
        ItemElements[] items = new ItemElements[]{new Water(10, "Singha"),new Water(10, "Crystal"),
				new spWater(15, "Pepsi"), new spWater(5, "Coca-cola")};
		
		int total = calculatePrice(items);
		System.out.println("Total Cost = "+total);
	}

	private static int calculatePrice(ItemElements[] items) {
		ShoppingCartVisitor visitor = new ShoppingCart();
		int sum=0;
		for(ItemElements item : items){
			sum = sum + item.accept(visitor);
		}
		return sum;
	}
}

