class Laptop{
	public static void work()
	{
		System.out.println("running laptop work");
		edit();
	}
	public static void edit()
	{
		System.out.println("running laptop edit");
		keyboard();
	}
	public static void keyboard()
	{
		System.out.println("running laptop keyboard");
		work();
	}
	public static void color()
	{
		System.out.println("running laptop color");
		quick();
	}
	public static void quick(){
		System.out.println("running laptop quick");
		color();
	}
}