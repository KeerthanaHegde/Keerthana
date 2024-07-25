class FoodRunner{
	public static void main(String[] args){
		Food food=new Food();
		String name=food.name;
		int quantity=food.quantity;
		double cost=food.cost;
		System.out.println("name:"+name);
		System.out.println("quantity:"+quantity);
		System.out.println("cost:"+cost);
		food.name="poori";
		food.quantity=2;
		food.cost=100.0;
		System.out.println("name:"+food.name);
		System.out.println("quantity:"+food.quantity);
		System.out.println("cost:"+food.cost);
		
		
	}
}