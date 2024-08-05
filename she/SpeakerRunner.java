class SpeakerRunner{
	public static void main(String[] args){
     Speaker speaker=new Speaker(true);
     speaker.setSize('L');
	 speaker.cost=120;
	 speaker.display();
	 Speaker speaker1=new Speaker(false);
     speaker1.setSize('M');
	 speaker1.cost=170;
	 speaker1.display();
	 Speaker speaker2=new Speaker(true);
     speaker2.setSize('S');
	 speaker2.cost=113;
	 speaker2.display();
}
}