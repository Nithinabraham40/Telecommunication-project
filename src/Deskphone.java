
public class Deskphone implements Telephone{
	
	
	private String myNumber;
	private boolean isringing;
	
	
	public Deskphone(String myNumber) {
		
		this.myNumber=myNumber;
		
	}
	
	@Override
	
	public void powerOn() {
		System.out.println("desk phone is awlays powered");
	}
	
	public void dial(String phoneNO) {
		
		System.out.println("Now ringing"+phoneNO+"on deskphone");
		
	}
	public void answer() {
		if(isringing) {
			System.out.println("Answering the desk phone");
			isringing=false;
		}else {
			System.out.println("Phone is not ringing");
		}
	}
	public boolean callPhone(String phoneNumber) {
		if(phoneNumber==myNumber) {
			isringing=true;
			System.out.println("Phone ringing");
		}else {
			isringing=false;
		}
		return isringing;
		
	}
	public boolean isRinging() {
		return isringing;
	}
	

}
