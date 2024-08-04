class AeroplaneRunner{
	public static void main(String[] args){
		Aeroplane aeroplane=new Aeroplane();
		System.out.println("cost:"+aeroplane.company);
		System.out.println("size:"+aeroplane.noOfSeats);
		System.out.println("material:"+aeroplane.ticketPrice);
		System.out.println("material:"+aeroplane.source);
		System.out.println("material:"+aeroplane.destination);
		Aeroplane aeroplane1=new Aeroplane("quatar",120,64000.3,"banglore","usa");
		System.out.println("cost:"+aeroplane1.company);
		System.out.println("size:"+aeroplane1.noOfSeats);
		System.out.println("material:"+aeroplane1.ticketPrice);
		System.out.println("material:"+aeroplane1.source);
		System.out.println("material:"+aeroplane1.destination);
		Aeroplane aeroplane2=new Aeroplane("indain airways","manglore","italy");
		System.out.println("cost:"+aeroplane2.company);
		System.out.println("size:"+aeroplane2.noOfSeats);
		System.out.println("material:"+aeroplane2.ticketPrice);
		System.out.println("material:"+aeroplane2.source);
		System.out.println("material:"+aeroplane2.destination);
		Aeroplane aeroplane3=new Aeroplane("jeju",70000.4,"banglore","paris");
		System.out.println("cost:"+aeroplane3.company);
		System.out.println("size:"+aeroplane3.noOfSeats);
		System.out.println("material:"+aeroplane3.ticketPrice);
		System.out.println("material:"+aeroplane3.source);
		System.out.println("material:"+aeroplane3.destination);
		
		
	}
}