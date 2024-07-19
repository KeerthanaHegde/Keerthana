class Paint
{
	public static void brushing(String brand)
	{
		System.out.println("paint is used brush ");
		System.out.println("brand:"+brand);
	}
	public static void picture(String brand ,String color)
	{
		System.out.println("paint is used draw the picture ");
		System.out.println("brand:"+brand);
		System.out.println("color:"+color);
	}
	public static void sketch(String brand, double price)
	{
		System.out.println("paint is used draw the sketch ");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
	}
		
	public static void pattern(String color ,String type ,double price)
	{
		System.out.println("paint is used draw the pattern ");
		System.out.println("color:"+color);
		System.out.println("type:"+type);
		System.out.println("price:"+price);
	}
}