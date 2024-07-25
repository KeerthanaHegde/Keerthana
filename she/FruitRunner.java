class FruitRunner{
	public static void main(String[] args){
		Fruit fruit=new Fruit();
		String name=fruit.name;
		int quantity=fruit.quantity;
		double cost=fruit.cost;
		System.out.println("name:"+name);
		System.out.println("quantity:"+quantity);
		System.out.println("cost:"+cost);
		fruit.name="lemon";
		fruit.quantity=3;
		fruit.cost=109.6;
		System.out.println("name:"+fruit.name);
		System.out.println("quantity:"+fruit.quantity);
		System.out.println("cost:"+fruit.cost);
		
		
	}
}