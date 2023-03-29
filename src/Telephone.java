
public interface Telephone {
	
	//power on
	//dial a number
	//answer phone call
	//call another phone
	//is ringing
	
	void powerOn();
	void dial(String phoneNO);
	void answer();
	boolean callPhone(String phoneNO);
	boolean isRinging();

}
