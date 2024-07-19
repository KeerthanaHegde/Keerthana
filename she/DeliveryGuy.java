class DeliveryGuy{
	public static void deliver(String item){
		System.out.println("item:"+item);
		DeliveryVehicle.deliver(item,"RR Nagar");

	}
}