class State{
	String name;
	String language;
	CapitalCity capitalCity=new CapitalCity();
	State(String name,String language)
	{

		this.name=name;
		this.language=language;
		
	}
	
	public void display(){
		System.out.println("name:"+this.name);
		System.out.println("language:"+this.language);
		this.capitalCity.display();
	}
}