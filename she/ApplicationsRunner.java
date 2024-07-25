class ApplicationsRunner{
	public static void main(String[] args){
		Applications application=new Applications();
		String name=application.name;
		int quantity=application.quantity;
		double cost=application.cost;
		System.out.println("name:"+name);
		System.out.println("quantity:"+quantity);
		System.out.println("cost:"+cost);
		application.name="zudio";
		application.quantity=1;
		application.cost=189.6;
		System.out.println("name:"+application.name);
		System.out.println("quantity:"+application.quantity);
		System.out.println("cost:"+application.cost);
		
		
	}
}