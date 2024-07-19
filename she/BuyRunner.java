class BuyRunner{
	public static void main(String[] args){
		Buy.product("dior",100.3);
		Buy.product("LV",600.0);
		Buy.product("son",600,3340.4);
		Buy.product("LV",6000,6000.4);
		Buy.bookMovieTicket("kalki","ionex",350,4000.4);
		Buy.bookMovieTicket("surya","PVL",600,7000.5);
		Buy.buyEgg(200,4000.3);
	    Buy.buyEgg(600,7000.5);
		Buy.buyShampoo(400,5000.4,"silk","20");
		Buy.buyShampoo(1100,11000.5,"keratin","23");
		Buy.buyCake('M',"coldcake","chacolate",4000.4,5000);
		Buy.buyCake('L',"hotcake","mint",13000.5,11000);
		Buy.buyLaptop("hp",5000,5000.5,700,800.6,"c drive",700,800);
		Buy.buyLaptop("dell",50000,50000.5,7000,8000.6,"d drive",60060,8000);
		Buy.buySmartWatch("rolex",700.4,7,'S',707);
		Buy.buySmartWatch("titan",1200.4,11,'L',1090);
	}
}