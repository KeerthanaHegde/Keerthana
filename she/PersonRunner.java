class PersonRunner{
	public static void main(String[] personinfo){
		if(personinfo.length == 4)
		{
			String name=personinfo[0];
			String email=personinfo[1];
			String age=personinfo[2];
			String password=personinfo[3];
			System.out.println("name:"+name);
			System.out.println("email:"+email);
			System.out.println("age:"+age);
			System.out.println("password:"+password);
		}
		else{
		System.out.println("least 4 ref are required");	
		}
	}
}