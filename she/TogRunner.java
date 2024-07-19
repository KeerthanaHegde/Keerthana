class TogRunner
{
	public static void main(String[] args)
	{
		char gradeofsubject='A';
		char sectionofclass='B';
		char status='C';
		char data='E';
		char alphabet='D';
		char direction='F';
		char depth='G';
		char height='H';
		char power='I';
		char volt='J';
		char light='K';
		char thing='L';
		char heat='M';
		char lemon='N';
		char rain='O';
		char temp='P';
		char percentage='Q';
		char signal='R';
		char red='W';
		char money='Z';
		char[] container={gradeofsubject,sectionofclass,status,data,alphabet,direction,depth,height,power,volt,light,thing,heat,lemon,rain,temp,percentage,signal,red,money};
		int total=container.length;
		System.out.println("total:"+total);
		char ref=container[11];
		System.out.println("elements at 11:"+ref);
	}
}