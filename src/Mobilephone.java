
public class Mobilephone implements Telephone {
	
	private String myNumber;
	private boolean isringing;
	private boolean ispowerOn;
	
	

	public Mobilephone(String myNumber) {
		
		this.myNumber=myNumber;
		
	}
	
	@Override
	
	public void powerOn() {
		ispowerOn=true;
		System.out.println(" phone is powered");
	}
	
	public void dial(String phoneNO) {
		
		System.out.println("Now ringing"+phoneNO+"on deskphone");
		
	}
	public void answer() {
		if(isringing&&ispowerOn) {
			System.out.println("Answering the desk phone");
			isringing=false;
		}else {
			System.out.println("Phone is not ringing");
		}
	}
	public boolean callPhone(String phoneNumber) {
		if(phoneNumber==myNumber&&ispowerOn) {
			isringing=true;
			System.out.println("Phone ringing");
		}else {
			
			System.out.println("wrong number or phone is off");
			isringing=false;
		}
		return isringing;
		
	}
	public boolean isRinging() {
		return isringing;
	}
	
	

}
