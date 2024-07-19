class RingRunner{
	public static void main(String[] args){
    System.out.println("running main method in RingRunner");
	String ref=Ring.medicineName(100.3);
    System.out.println("medicine:"+ref);
	String ref1=Ring.medicineName(50.34);
    System.out.println("medicine:"+ref1);
	String ref2=Ring.medicineName(25.6);
    System.out.println("medicine:"+ref2);
	String ref3=Ring.medicineName(300.4);
	System.out.println("medicine:"+ref3);
	
	String ref4=Ring.symptom("dolo");
    System.out.println("symptom:"+ref4);
	String ref5=Ring.symptom("strepsil");
    System.out.println("symptom:"+ref5);
	String ref6=Ring.symptom("anticeptic");
    System.out.println("symptom:"+ref6);
	String ref7=Ring.symptom("Ativan");
    System.out.println("symptom:"+ref7);
	
	String ref8=Ring.doctorName("morning");
    System.out.println("doctorName:"+ref8);
	String ref9=Ring.doctorName("evening");
    System.out.println("doctorName:"+ref9);
	String ref10=Ring.doctorName("night");
    System.out.println("doctorName:"+ref10);
	String ref11=Ring.doctorName("afternoon");
    System.out.println("doctorName:"+ref11);
	}
}