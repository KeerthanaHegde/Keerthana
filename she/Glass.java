class Glass{
	public static int code(String country)
	{
		System.out.println("country:"+country);
		if(country=="india"){
			return 91;
		}
		if(country=="america"){
			return 80;
	}
	   if(country=="balgium"){
			return 71;
	}
	   if(country=="europe"){
			return 93;
	}
	   if(country=="japan"){
			return 95;
	}
	return 0;
}
public static String item(double price)
	{
		System.out.println("price:"+price);
		if(price==180.4){
			return "sweet";
		}
		if(price==190.3){
			return "shampoo";
	}
	   if(price==200.4){
			return "tablets";
	}
	   if(price==323.5){
			return "clip";
	}
	   if(price==678.3){
			return "mouse";
	}
	return "not found";
}
public static String movieName(String producerName)
	{
		System.out.println("producerName:"+producerName);
		if(producerName=="ramesh"){
			return "yajamana";
		}
		if(producerName=="satisha"){
			return "ram";
	}
	   if(producerName=="raj"){
			return "kalki";
	}
	   if(producerName=="good news"){
			return "sai";
	}
	   if(producerName=="bad news"){
			return "kaushal";
	}
	return "not found";
}
}