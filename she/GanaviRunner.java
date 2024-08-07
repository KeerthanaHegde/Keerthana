class GanaviRunner{
	public static void main(String[] args)
	{
		Clip clip=new Clip("green","nylon");
		
		Ganavi ganavi=new Ganavi("keerthana@gmail.com",clip);
		ganavi.display();
		
       Clip clip1=new Clip("red","smooth");
		
		Ganavi ganavi1=new Ganavi("swapna@123",clip1);
		ganavi.display();
		
	}
}