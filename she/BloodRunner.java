class BloodRunner{
	public static void main(String[] args){
		System.out.println("running main method in BloodRunner");
		String group = Blood.group();
		System.out.println("group:"+group);
		String personName = Blood.personName();
		System.out.println("personName:"+personName);
		double cost = Blood.cost();
		System.out.println("cost:"+cost);
		boolean hospitalTested = Blood.hospitalTested();
		System.out.println("hospitalTested:"+hospitalTested);
		boolean sicknessOrNot = Blood.sicknessOrNot();
		System.out.println("sickness:"+sicknessOrNot);
		boolean donateOrNot = Blood.donateOrNot();
		System.out.println("donate:"+donateOrNot);
		
		
}
}