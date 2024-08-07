class KeybunchRunner{
	public static void main(String[] args)
	{
		Key key=new Key(18,"softie");
		
		Keybunch keybunch=new Keybunch("cotton",key);
		keybunch.display();
		
		Key key1=new Key(20,"horizo");
		
		Keybunch keybunch1=new Keybunch("nylon",key1);
		keybunch1.display();
		
	}
}