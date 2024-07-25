class PlaceRunner{
	public static void main(String[] args){
		Place place=new Place();
		String name=place.name;
		int pincode=place.pincode;
		double cost=place.cost;
		System.out.println("name:"+name);
		System.out.println("pincode:"+pincode);
		System.out.println("cost:"+cost);
		place.name="udupi";
		place.pincode=5674;
		place.cost=103.6;
		System.out.println("name:"+place.name);
		System.out.println("pincode:"+place.pincode);
		System.out.println("cost:"+place.cost);
		
		
	}
}