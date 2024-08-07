class Companys{
	int id;
	String name;
	String location;
	SoftwareEnginner softwareEnginner=new SoftwareEnginner("hari",4,"backend",45000);
	Companys(int id,String name,String location)
	{
		this.id=id;
		this.name=name;
		this.location=location;
		
	}
	
	public void display(){
		System.out.println("id:"+this.id);
		System.out.println("name:"+this.name);
		System.out.println("location:"+this.location);
		this.softwareEnginner.display();
	}
}