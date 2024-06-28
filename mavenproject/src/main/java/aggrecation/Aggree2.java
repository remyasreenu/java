package aggrecation;

public class Aggree2{
	
	int x,y;
	
	Aggree1 ag;
	
	public Aggree2(int x,int y,Aggree1 ag) {
		
		this.x=x;
		this.y=y;
		this.ag=ag;
	}
	public void print() {
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(ag.a);
		System.out.println(ag.b);
		
	}
	
	public static void main(String args[]) {
		
		Aggree1 obj=new Aggree1(1,2);
		
		Aggree2 obj2=new Aggree2(4,5,obj);
		
		obj2.print();
	}
	
	

}
