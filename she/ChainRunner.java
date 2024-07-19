class ChainRunner{
	public static void main(String[] args){
		System.out.println("running main method in ChainRunner ");
		double carat = Chain.carat();
		System.out.println("carat:"+carat);
		double costPerGram = Chain.costPerGram();
		System.out.println("costpergram:"+costPerGram);
	    String type = Chain.type();
		System.out.println("type:"+type);
		String quality = Chain.quality ();
		System.out.println("quality :"+quality );
		int quantity = Chain.quantity();
		System.out.println("quantity :"+quantity );
		double wastage = Chain.wastage();
		System.out.println("wastage:"+wastage);
		double serviceCharge = Chain.serviceCharge();
		System.out.println("serviceCharge:"+serviceCharge);
		double gst = Chain.gst();
		System.out.println("GST:"+gst);
}
}
