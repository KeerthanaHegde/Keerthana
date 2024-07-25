class MatrimonyRunner{
	public static void main(String[] args){
		Matrimony matrimony=new Matrimony();
		String name=matrimony.name;
		int age=matrimony.age;
		Long phoneNo=matrimony.phoneNo;
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("phoneNo:"+phoneNo);
		
		matrimony.name="shree";
		matrimony.age=23;
		matrimony.phoneNo=788665443367L;
		System.out.println("name:"+matrimony.name);
		System.out.println("age:"+matrimony.age);
		System.out.println("phoneNo:"+matrimony.phoneNo);
		
	}
}