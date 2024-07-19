class Ring{
	public static String medicineName(double price)
	{
		System.out.println("price:"+price);
		if(price==100.3){
			return "dolo";
		}
		if(price==50.34){
			return "strepsil";
	}
	   if(price==25.6){
			return "anticeptic";
	}
	   
	return "not found";
}
public static String symptom(String medicineName)
	{
		System.out.println("medicineName:"+medicineName);
		if(medicineName=="dolo"){
			return "fever";
		}
		if(medicineName=="strepsil"){
			return "cough";
	}
	   if(medicineName=="anticeptic"){
			return "cold";
	}
	   
	return "not found";
}
public static String doctorName(String availability)
	{
		System.out.println("availability:"+availability);
		if(availability=="morning"){
			return "Dr.Hari";
		}
		if(availability=="evening"){
			return "Dr.Siri";
	}
	   if(availability=="night"){
			return "Dr.Sruthi";
	}
	   
	return "not found";
}
}