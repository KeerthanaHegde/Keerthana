class JuiceRunner{
	public static void main(String[] args){
	if(args.length==5){
		String name=args[0];
		String brand=args[1];
		String flavour=args[2];
		String price=args[3];
		String quantity=args[4];
		float covertedprice=Float.parseFloat(price);
		int covertedquantity=Integer.parseInt(quantity);
		Juice.juiceInformation(name,brand,flavour,covertedprice,covertedquantity);
	}
}
}