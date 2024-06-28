package polymorphism;

/*Program to calculate discount if customer purchase cloths on offseason , 
 * set discount 15% offseason and  onseason 40% Should use two classes onseason and offseason ,
 * use two methods discount (method name should be same)
 *  */


public class Discountcls1 {
	
	int amo;
	int offdis;
	int offam;
	
	public void discount(int amo) {
		
		 offdis=(amo*15)/100;
		 offam=amo-offdis;
		 System.out.println("Offseason Discount:"+offdis);
		 System.out.println("Amount to be paid Offseason:"+offam);
	}

}
