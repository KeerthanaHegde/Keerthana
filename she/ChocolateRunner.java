class ChocolateRunner{
	public static void main(String[] args){
     Chocolate chocolate=new Chocolate(120);
     chocolate.setFlavour("dark chocolate");
	 chocolate.size='l';
	 chocolate.display();
	 
	 Chocolate chocolate1=new Chocolate(80);
     chocolate1.setFlavour("vanila");
	 chocolate1.size='s';
	 chocolate1.display();
	 
	 Chocolate chocolate2=new Chocolate(50);
     chocolate2.setFlavour("strawberry");
	 chocolate2.size='m';
	 chocolate2.display();
}
}