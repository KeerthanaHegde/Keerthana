class TrainRunner
{
	public static void main(String[] args){
		System.out.println("running main method in trainrunner");
		Train.book("udupi","banglore");
		Train.book("mysore","rr nagar",123);
		Train.book("mj road","rajajinagar",134,2300.0);
		Train.cancel(37);
		Train.cancel("hubblli","hasana");
		
		
	}
}