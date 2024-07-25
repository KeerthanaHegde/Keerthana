class CandyRunner{
	public static void main(String[] args){
		Candy candy=new Candy();
		String name=candy.name;
		int quantity=candy.quantity;
		double cost=candy.cost;
		System.out.println("name:"+name);
		System.out.println("quantity:"+quantity);
		System.out.println("cost:"+cost);
		candy.name="strawberry";
		candy.quantity=2;
		candy.cost=105.6;
		System.out.println("name:"+candy.name);
		System.out.println("quantity:"+candy.quantity);
		System.out.println("cost:"+candy.cost);
		
		
	}
}