package week1.day1;

public class Mobile {
	static int a= 11;
		public void makeCall()
	{
		short b=12;
		int c=500;
		System.out.println(b);
		System.out.println(c);
	}
	public void sendMessage()
	{
		String s="muthukrishnan";
		long l=784939211112L;
		System.out.println(s);
		System.out.println(l);
	}
	private void payBills()
	{
		int num=36;
		System.out.println("Number:" +num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m=new Mobile();
		m.makeCall();
		m.sendMessage();
		m.payBills();
		System.out.println("static int:"+a);

	}

}

