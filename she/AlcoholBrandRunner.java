class AlcoholBrandRunner{
	public static void main(String[] args){
		AlcoholBrand alcoholBrand=new AlcoholBrand();
		String name=alcoholBrand.name;
		int quantity=alcoholBrand.quantity;
		double cost=alcoholBrand.cost;
		System.out.println("name:"+name);
		System.out.println("quantity:"+quantity);
		System.out.println("cost:"+cost);
		alcoholBrand.name="Blacklabel";
		alcoholBrand.quantity=2;
		alcoholBrand.cost=1038.6;
		System.out.println("name:"+alcoholBrand.name);
		System.out.println("quantity:"+alcoholBrand.quantity);
		System.out.println("cost:"+alcoholBrand.cost);
		
		
	}
}