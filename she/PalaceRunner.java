class PalaceRunner{
	public static void main(String[] palaceinfo){
		if(palaceinfo.length == 4)
		{
			String name=palaceinfo[0];
			String location=palaceinfo[1];
			String builtBy=palaceinfo[2];
			String buildYear=palaceinfo[3];
			System.out.println("name:"+name);
			System.out.println("location:"+location);
			System.out.println("builtBy:"+builtBy);
			System.out.println("buildYear:"+buildYear);
		}
		else{
		System.out.println("least 4 ref are required");	
		}
	}
}