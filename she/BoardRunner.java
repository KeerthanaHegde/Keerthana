class BoardRunner{
	public static void main(String[] args){
		Board board=new Board(9,1000.3,"round");
		System.out.println("quantity:"+board.quantity);
		System.out.println("cost:"+board.cost);
		System.out.println("type:"+board.type);
		Board board1=new Board(80,1077.3,"square");
		System.out.println("quantity:"+board1.quantity);
		System.out.println("cost:"+board1.cost);
		System.out.println("type:"+board1.type);
		Board board2=new Board(9,1079.3,"hexagon");
		System.out.println("quantity:"+board2.quantity);
		System.out.println("cost:"+board2.cost);
		System.out.println("type:"+board2.type);
		Board board3=new Board(11,10778.3,"rectangle");
		System.out.println("quantity:"+board3.quantity);
		System.out.println("cost:"+board3.cost);
		System.out.println("type:"+board3.type);
		Board board4=new Board(15,100567.3,"headend");
		System.out.println("quantity:"+board4.quantity);
		System.out.println("cost:"+board4.cost);
		System.out.println("type:"+board4.type);
		Board board5=new Board(22,100456.3,"hexagon");
		System.out.println("quantity:"+board5.quantity);
		System.out.println("cost:"+board5.cost);
		System.out.println("type:"+board5.type);
		Board board6=new Board(7,1001234.3,"pentagon");
		System.out.println("quantity:"+board6.quantity);
		System.out.println("cost:"+board6.cost);
		System.out.println("type:"+board6.type);
		Board board7=new Board(8,1004563.3,"round");
		System.out.println("quantity:"+board7.quantity);
		System.out.println("cost:"+board7.cost);
		System.out.println("type:"+board7.type);
		Board board8=new Board(2,1002434.3,"swan");
		System.out.println("quantity:"+board8.quantity);
		System.out.println("cost:"+board8.cost);
		System.out.println("type:"+board8.type);
		Board board9=new Board(9,100123.3,"round");
		System.out.println("quantity:"+board9.quantity);
		System.out.println("cost:"+board9.cost);
		System.out.println("type:"+board9.type);
		Board board10=new Board(17,100877.3,"triangle");
		System.out.println("quantity:"+board10.quantity);
		System.out.println("cost:"+board10.cost);
		System.out.println("type:"+board10.type);
		
	}
}