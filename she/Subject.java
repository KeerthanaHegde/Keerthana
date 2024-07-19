class Subject{
	public static void read(String name){
		System.out.println("book to read ");
		System.out.println("name:"+name);
	}
	public static void read(double price){
		System.out.println("subject to understand ");
		System.out.println("price:"+price);
	}
	public static void book(double price,String name){
		System.out.println("book to analyze ");
		System.out.println("price:"+price);
		System.out.println("name:"+name);
}
    public static void book(String name,int quantity){
		System.out.println("book to gain knowledge ");
		System.out.println("name:"+name);
		System.out.println("quantity:"+quantity);

}
 public static void book(int orderno){
		System.out.println("book to memorize ");
		System.out.println("orderno:"+orderno);
		
}

}