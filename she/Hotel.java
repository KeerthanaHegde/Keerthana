class Hotel{
	String name="udupi";
	Owner owner=new Owner("hari",17,"male");
	Hotel()
	{
		
	}
	
	public void display(){
		System.out.println("name:"+name);
		this.owner.display();
	}
}