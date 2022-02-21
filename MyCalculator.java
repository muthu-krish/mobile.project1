package week1.day1;

public class MyCalculator {
	public void Add() {
		int a=10; int b=20; int c=a+b;
		System.out.println("Addition:  "+c);
	}
	public void Sub()
	{
		int d=25; int e=11; 
		int diff =d-e;
		System.out.println("Difference:  "+diff);
	}
	public void Mul()
	{
		float g=0.4f; float h=0.66f;
		System.out.println("Multiplication: "+g*h);
	}
	public void Div() {
		long n=3411223433L;
		Long m=1111222L;
		System.out.println("Divison:  "+n/m);
	}
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		MyCalculator m=new MyCalculator();
		m.Add();
		m.Sub();
		m.Mul();
		m.Div();
	}

}
