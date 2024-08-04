class MaskRunner{
	public static void main(String[] args){
		Mask mask=new Mask();
		System.out.println("cost:"+mask.cost);
		System.out.println("size:"+mask.size);
		System.out.println("material:"+mask.material);
		Mask mask1=new Mask(1077.3);
		System.out.println("cost:"+mask1.cost);
		System.out.println("size:"+mask1.size);
		System.out.println("material:"+mask1.material);
		Mask mask2=new Mask('s');
		System.out.println("cost:"+mask2.cost);
		System.out.println("size:"+mask2.size);
		System.out.println("material:"+mask2.material);
		Mask mask3=new Mask("cotton");
		System.out.println("cost:"+mask3.cost);
		System.out.println("size:"+mask3.size);
		System.out.println("material:"+mask3.material);
		Mask mask4=new Mask(100567.3,'L',"naylon");
		System.out.println("cost:"+mask4.cost);
		System.out.println("size:"+mask4.size);
		System.out.println("material:"+mask4.material);
		
	}
}