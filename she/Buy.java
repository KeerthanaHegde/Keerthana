class Buy{
	public static void product(String brand,double price){
		System.out.println("brand:"+brand );
		System.out.println("price :"+price );	
		if(price>20.0&&price<555.0)
		{
		System.out.println("product price is vaild");	
		}
		else{
			System.out.println("product price is invaild");	
		}
	}
	public static void product(String name,int quantity,double price){
		System.out.println("name:"+name);
		System.out.println("quantity:"+quantity);
        System.out.println("price:"+price);	
		if(quantity>200&&quantity<5550)
		{
		System.out.println("product  is vaild");	
		}
		else{
			System.out.println("product  is invaild");	
		}
		if(price>2000.3&&price<5234.3)
		{
		System.out.println("product  is vaild");	
		}
		else{
			System.out.println("product  is invaild");	
		}
	}
	public static void bookMovieTicket(String name,String theaterName,int quantity,double price){
		System.out.println("name:"+name);
		System.out.println("theaterName:"+theaterName);
		System.out.println("quantity:"+quantity);
        System.out.println("price:"+price);	
		if(quantity>300&&quantity<500)
		{
		System.out.println(" bookMovieTicket is vaild");	
		}
		else{
			System.out.println("bookMovieTicket  is invaild");	
		}
		if(price>3000.3&&price<6000.3)
		{
		System.out.println("bookMovieTicket is vaild");	
		}
		else{
			System.out.println("bookMovieTicket  is invaild");	
		}
	}
	public static void buyEgg(int total,double pricePerEgg){
		System.out.println("total:"+total);
		System.out.println("pricePerEgg:"+pricePerEgg);
		if(total>=200&&total<600)
		{
		System.out.println(" buyEgg is vaild");	
		}
		else{
			System.out.println("buyEgg  is invaild");	
		}
		if(pricePerEgg>=200.5&&pricePerEgg<700.4)
		{
		System.out.println(" buyEgg is vaild");	
		}
		else{
			System.out.println("buyEgg  is invaild");	
		}
	}
	public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate){
		System.out.println("quantityInMl:"+quantityInMl);
		System.out.println("price:"+price);
		System.out.println("brand:"+brand);
		System.out.println("manfDate:"+manfDate);
		if(quantityInMl>=400&&quantityInMl<1000)
		{
		System.out.println(" buyShampoo is vaild");	
		}
		else{
			System.out.println("buyShampoo is invaild");	
		}
		if(price>=4000.4&&price<10000.3)
		{
		System.out.println(" buyShampoo is vaild");	
		}
		else{
			System.out.println("buyShampoo is invaild");	
		}
	}
	public static void buyCake(char size,String type,String flavour,double cost,int quantity){
		System.out.println("size:"+size);
		System.out.println("type:"+type);
		System.out.println("flavour:"+flavour);
		System.out.println("cost:"+cost);
		System.out.println("quantity:"+quantity);
		if(cost>=4000.4&&cost<10000.5)
		{
		System.out.println(" buyCake is vaild");	
		}
		else{
			System.out.println("buyCake is invaild");	
		}
		if(quantity>=4000&&quantity<10000)
		{
		System.out.println(" buyCake is vaild");	
		}
		else{
			System.out.println("buyCake is invaild");	
		}
	}
	public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize){
		System.out.println("brand:"+brand);
		System.out.println("serialNo:"+serialNo);
		System.out.println("price:"+price);
		System.out.println("batteryCapacity:"+batteryCapacity);
		System.out.println("screenSize:"+screenSize);
		System.out.println("os:"+os);
		System.out.println("harddiskSize:"+harddiskSize);
		System.out.println(" ramSize:"+ ramSize);
		if(serialNo>4000&&serialNo<10000)
		{
		System.out.println(" buyLaptop is vaild");	
		}
		else{
			System.out.println("buyLaptopis invaild");	
		}
		if(price>4000.4&&price<10000.56)
		{
		System.out.println(" buyLaptop is vaild");	
		}
		else{
			System.out.println("buyLaptopis invaild");	
		}
		if(batteryCapacity>600&&batteryCapacity<1006)
		{
		System.out.println(" buyLaptop is vaild");	
		}
		else{
			System.out.println("buyLaptopis invaild");	
		}
		if(screenSize>600.6&&screenSize<1006.87)
		{
		System.out.println(" buyLaptop is vaild");	
		}
		else{
			System.out.println("buyLaptopis invaild");	
		}
		if(harddiskSize>600&&harddiskSize<10087)
		{
		System.out.println(" buyLaptop is vaild");	
		}
		else{
			System.out.println("buyLaptop is invaild");	
		}
		if(ramSize>600&&ramSize<1008)
		{
		System.out.println(" buyLaptop is vaild");	
		}
		else{
			System.out.println("buyLaptopis invaild");	
		}
	}
		public static void buySmartWatch(String brand,double price,int color,char type,int mode){
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("color:"+color);
		System.out.println("type:"+type);
		System.out.println("mode:"+mode);
		if(price>600.6&&price<1008.9)
		{
		System.out.println("buySmartWatch is vaild");	
		}
		else{
			System.out.println("buySmartWatch is invaild");	
		}
		if(color>=7&&color<10)
		{
		System.out.println("buySmartWatch is vaild");	
		}
		else{
			System.out.println("buySmartWatch is invaild");	
		}
	if(mode>606&&mode<1009)
		{
		System.out.println("buySmartWatch is vaild");	
		}
		else{
			System.out.println("buySmartWatch is invaild");	
		}
}
}