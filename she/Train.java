class Train{
	
	public static void book(String source,String destination){
		System.out.println("book to read ");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
	}
	public static void book(String source,String destination,int quantity){
		System.out.println("book to read in train ");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
		System.out.println("quantity:"+quantity);
	}
	public static void book(String source,String destination,int quantity,double price){
		System.out.println("book to understand ");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
	}
	public static void cancel(int ticketno){
		System.out.println("cancel the ticket of a train ");
		System.out.println("ticketno:"+ticketno);
		
	}
	public static void cancel(String source,String destination){
		System.out.println("cancel the ticket in train ");
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
}
}