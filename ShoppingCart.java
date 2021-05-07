public class ShoppingCart implements ShoppingCartVisitor{
    public int visit(Water water) {
		int cost = 10;
		//apply 5$ discount if water price is greater than 50
		if(water.getPrice() > 60){
			cost = water.getPrice()-5;
		}
		else {
			cost = water.getPrice();
		}
		return System.out.println("water brand: "+water.getBrand()+" & cost= "+cost);
	}

	@Override
	public int visit(SparklingWater spWater) {
		int cost = 15;
		if(spWater.getPrice() > 70){
			cost = spWater.getPrice()-5;
		}
		else {
			cost = spWater.getPrice();
		}
		return System.out.println("spWater brand: "+spWater.getBrand()+" & cost= "+cost);
	}

}
