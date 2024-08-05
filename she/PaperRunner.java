class PaperRunner{
	public static void main(String[] args){
     Paper paper=new Paper('m');
     paper.setQuality(true);
	 paper.color="white";
	 paper.display();
	 
	 Paper paper1=new Paper('s');
     paper1.setQuality(false);
	 paper1.color="gray";
	 paper1.display();
	 
	 Paper paper2=new Paper('l');
     paper2.setQuality(true);
	 paper2.color="snow white";
	 paper2.display();
}
}