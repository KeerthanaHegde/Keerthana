class Laptop2{
	public static void main(String[] args)
	{
	System.out.println("running laptoprunner");
	Laptop2.work();
	Laptop2.edit();
		
	}
	public static void work()
	{
		System.out.println("running laptop work");
		work();
	}
	public static void edit()
	{
		System.out.println("running laptop edit");
	edit();
}
}