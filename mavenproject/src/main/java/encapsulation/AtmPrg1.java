package encapsulation;

public class AtmPrg1 {

	private int pin;
	
	public void getpin(int pin) {
		
		this.pin=pin;
		
	}
	public void validate() {
		
		if(pin==1001 || pin==1234 || pin==1212) {
			
			System.out.println("Valid Pin Number");
		}else {
			System.out.println("Wrong Pin Number");
		}
		
	}
	
}
