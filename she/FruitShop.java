class FruitShop{

public static double price(String item,boolean ice)
// public(access specifier) static(non access specifier) void(return type) main(method name) (String[] args) parameter
	{
		System.out.println("item:"+item);
		if(item=="orange juice"){
			if (ice){
				return 180.2;
			}else{
			return 120.3;
		}
			
		}
		
	
		if(item=="apple juice"){
			return 410.5;
	}
	   if(item=="apple juice"){
			return 170.3;
	}
	   if(item=="mango juice"){
			return 120.3;
	}
	   if(item=="muskmellon juice"){
			return 200.3;
	}
	return 0;
}
}