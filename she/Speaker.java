class Speaker{
	String brand="Boat";
	 char size;
	 double cost;
	 boolean output;
	 public Speaker(boolean output){
		this.output=output; 
	 }
	 public void setSize(char size){
		 this.size=size;
	 }
	 public  void display(){
		 System.out.println("brand:"+this.brand);
		 System.out.println("size:"+this.size);
		 System.out.println("cost:"+this.cost);
	 System.out.println("output:"+this.output);
	 
	 }
	 	 
}