package accessmodifier;

public class SuperAdd2 extends SuperAdd{
	
	public SuperAdd2() {
		
		int x=super.s;
		
		if(x%10==0) {
			
			System.out.println("Divisible");
			
		}else {
			System.out.println("Not Divisible");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperAdd2 obj=new SuperAdd2();

	}

}
