class MedicinesRunner{
	public static void main(String[] args){
	if(args.length==4){
		String name=args[0];
		String manfdate=args[1];
		String price=args[2];
		String quantity=args[3];
		float covertedprice=Float.parseFloat(price);
		int covertedquantity=Integer.parseInt(quantity);
		Medicines.medicinesInformation(name,manfdate,covertedprice,covertedquantity);
	}
}
}