class ForestRunner{
	public static void main(String[] forestinfo){
		if(forestinfo.length == 4)
		{
			String name=forestinfo[0];
			String area=forestinfo[1];
			String establishedYear=forestinfo[2];
			String state=forestinfo[3];
			System.out.println("name:"+name);
			System.out.println("area:"+area);
			System.out.println("establishedYear:"+establishedYear);
			System.out.println("state:"+state);
		}
		else{
		System.out.println("least 4 ref are required");	
		}
	}
}