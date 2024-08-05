class ProjectorRunner{
	public static void main(String[] args){
     Projector projector=new Projector("ordinary");
     projector.setColor("black");
	 projector.weight=120;
	 projector.display();
	 
	 Projector projector1=new Projector("high cost");
     projector1.setColor("dark blue");
	 projector1.weight=110;
	 projector1.display();
	 
	 Projector projector2=new Projector("medium");
     projector2.setColor("white");
	 projector2.weight=112;
	 projector2.display();
}
}