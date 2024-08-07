class Ananya{
	Long mobile;
	Knife knife;

	Ananya(Long mobile,Knife knife)
	{
		this.mobile=mobile;
		this.knife=knife;
		
	}
	
	public void display(){
		System.out.println("mobile:"+mobile);
		
         knife.details();
		
	}
}