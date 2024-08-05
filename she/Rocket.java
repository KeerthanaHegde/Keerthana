class Rocket{
	String country="India";
	 int  fuelCapacity;
	 double speed;
	 int noOfThrusters;
	 public Rocket(int  fuelCapacity){
		this.fuelCapacity=fuelCapacity; 
	 }
	 public void setSpeed(double speed){
		 this.speed=speed;
	 }
	 public  void display(){
		 System.out.println("country:"+this.country);
		 System.out.println("fuelCapacity:"+this.fuelCapacity);
		 System.out.println("speed:"+this.speed);
	 System.out.println("noOfThrusters:"+this.noOfThrusters);
	 
	 }
	 	 
}