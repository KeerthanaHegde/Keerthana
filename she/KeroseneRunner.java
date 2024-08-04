class KeroseneRunner{
	public static void main(String[] args){
		Kerosene kerosene=new Kerosene();
		System.out.println("cost:"+kerosene.price);
		System.out.println("size:"+kerosene.quantity);
		System.out.println("material:"+kerosene.quality);
		Kerosene kerosene1=new Kerosene(120.3,20,true);
		System.out.println("cost:"+kerosene1.price);
		System.out.println("size:"+kerosene1.quantity);
		System.out.println("material:"+kerosene1.quality);
		Kerosene kerosene2=new Kerosene(true);
		System.out.println("cost:"+kerosene2.price);
		System.out.println("size:"+kerosene2.quantity);
		System.out.println("material:"+kerosene2.quality);
		Kerosene kerosene3=new Kerosene(150.4);
		System.out.println("cost:"+kerosene3.price);
		System.out.println("size:"+kerosene3.quantity);
		System.out.println("material:"+kerosene3.quality);
		
		
	}
}