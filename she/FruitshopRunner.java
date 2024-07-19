class FruitshopRunner{
	public static void main(String[] args){
    System.out.println("running main method in Fruitshoprunner");
    double ref=FruitShop.price("orange juice with ice ");
    System.out.println("item:"+ref);
	double ref1=FruitShop.price("apple juice");
    System.out.println("item:"+ref1);
	double ref2=FruitShop.price("apple juice");
    System.out.println("item:"+ref2);
	double ref3=FruitShop.price("mango juice");
    System.out.println("item:"+ref3);
	double ref4=FruitShop.price("muskmellon juice");
    System.out.println("item:"+ref4);
	double ref5=FruitShop.price("grapes juice");
    System.out.println("item:"+ref5);
	
}
}