package polymorphism;
import java.util.Scanner;
public class Discountcls2 extends Discountcls1{
	
	int ondis;
	int onamo;
	
	public void discount(int amo) {
		
		super.discount(amo);
		
		 ondis=(amo*40)/100;
		 onamo=amo-ondis;
		 
		 System.out.println("Onseason Discount:"+ondis);
		 System.out.println("Amount to be paid Onseason:"+onamo);
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter Total Amount for Shopping");
		int totam=sca.nextInt();
		
		Discountcls2 obj=new Discountcls2();
		obj.discount(totam);
	}

}
