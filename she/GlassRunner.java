class GlassRunner{
	public static void main(String[] args){
    System.out.println("running main method in GlassRunner");
	int ref=Glass.code("india");
    System.out.println("code:"+ref);
	int ref1=Glass.code("america");
    System.out.println("code:"+ref1);
	int ref2=Glass.code("balgium");
    System.out.println("code:"+ref2);
	int ref3=Glass.code("europe");
    System.out.println("code:"+ref3);
	int ref4=Glass.code("japan");
    System.out.println("code:"+ref4);
	int ref5=Glass.code("italy");
    System.out.println("code:"+ref5);
	
	String ref6=Glass.item(180.4);
    System.out.println("item:"+ref6);
	String ref7=Glass.item(190.3);
    System.out.println("item:"+ref7);
	String ref8=Glass.item(200.4);
    System.out.println("item:"+ref8);
	String ref9=Glass.item(323.5);
    System.out.println("item:"+ref9);
	String ref10=Glass.item(678.3);
    System.out.println("item:"+ref10);
	String ref11=Glass.item(1800.4);
    System.out.println("item:"+ref11);
	
	String ref12=Glass.movieName("ramesh");
    System.out.println("moviename:"+ref12);
	String ref13=Glass.movieName("satisha");
    System.out.println("moviename:"+ref13);
	String ref14=Glass.movieName("raj");
    System.out.println("moviename:"+ref14);
	String ref15=Glass.movieName("good news");
    System.out.println("moviename:"+ref15);
	String ref16=Glass.movieName("bad news");
    System.out.println("moviename:"+ref16);
	String ref17=Glass.movieName("naina");
    System.out.println("moviename:"+ref17);

}
}