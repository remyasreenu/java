package encapsulation;
import java.util.Scanner;
public class AtmPrg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your PIN number");	
		int pin=s.nextInt();
		
		AtmPrg1 ob=new AtmPrg1();
		ob.getpin(pin);
		ob.validate();
	}

}
