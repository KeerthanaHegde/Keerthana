class Paper{
	String thickness="0.55 mm";
	 char size='m';
	 boolean quality;
	 String color;
	 public Paper(char size){
		this.size=size; 
	 }
	 public void setQuality(boolean quality){
		 this.quality=quality;
	 }
	 public void display(){
		 System.out.println("thickness:"+this.thickness);
		 System.out.println("size:"+this.size);
		 System.out.println("quality:"+this.quality);
	     System.out.println("color:"+this.color);
	 
	 }
	 	 
}