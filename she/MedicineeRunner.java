class MedicineeRunner{
	public static void main(String[] args){
		Medicinee medicine=new Medicinee();
		String name=medicine.name;
		int quantity=medicine.quantity;
		double cost=medicine.cost;
		System.out.println("name:"+name);
		System.out.println("quantity:"+quantity);
		System.out.println("cost:"+cost);
		medicine.name="dolo";
		medicine.quantity=2;
		medicine.cost=100.8;
		System.out.println("name:"+medicine.name);
		System.out.println("quantity:"+medicine.quantity);
		System.out.println("cost:"+medicine.cost);
		
		
	}
}