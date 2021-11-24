package com.java.day2;

public class BoxingTest {

	public void show(Object ob) {
		//System.out.println(ob.getClass());
		//System.out.println(ob.getClass().getName());
		System.out.println(ob.getClass().getSimpleName());
		String str=ob.getClass().getSimpleName();
	
		if (str.equals("Integer")) {
			int x = (Integer)ob;
			System.out.println("Integer Casting..."+x);
			
		}
		
		if(str.equals("Double")) {
			double x = (Double)ob;
			System.out.println("Double Casting..." +x);
		}
		
		if (str.equals("String")) {
			String x = (String)ob;
			System.out.println("String Casting..." +x);
		}
	}
	public static void main(String[] args) {
		int a=12;
		double b=12.5;
		String str="Sangram";
		
		BoxingTest obj = new BoxingTest();
		obj.show(a);
		obj.show(b);
		obj.show(str);
	}
}
