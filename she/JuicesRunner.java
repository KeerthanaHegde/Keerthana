class JuicesRunner{
	public static void main(String[] args){
		Juices juice=new Juices();
		String name=juice.name;
		int quantity=juice.quantity;
		double cost=juice.cost;
		System.out.println("name:"+name);
		System.out.println("quantity:"+quantity);
		System.out.println("cost:"+cost);
		juice.name="orange juice";
		juice.quantity=2;
		juice.cost=103.6;
		System.out.println("name:"+juice.name);
		System.out.println("quantity:"+juice.quantity);
		System.out.println("cost:"+juice.cost);
		
		
	}
}