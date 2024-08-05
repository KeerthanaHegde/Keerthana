class RocketRunner{
	public static void main(String[] args){
     Rocket rocket=new Rocket(70);
     rocket.setSpeed(120);
	 rocket.noOfThrusters=12;
	 rocket.display();
	 
	 Rocket rocket1=new Rocket(80);
     rocket1.setSpeed(170);
	 rocket1.noOfThrusters=17;
	 rocket1.display();
	 
	 Rocket rocket2=new Rocket(50);
     rocket2.setSpeed(185);
	 rocket2.noOfThrusters=11;
	 rocket2.display();
}
}