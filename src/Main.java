
public class Main {

	public static void main(String[] args) {
		
		
		
		Deskphone myPhone=new Deskphone("7012495630");
		
		Deskphone m3=new Deskphone("45555");
		
		myPhone.powerOn();
		myPhone.callPhone("7012495630");
		myPhone.answer();
		
		Mobilephone m1=new Mobilephone("7123258852");
		
		m1.powerOn();
		
		
		m1.callPhone("7123258852");
		
		

	}

}
