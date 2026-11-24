package com.sakshi_23NovMethods;

public class Perimeter {
	public void periOfCircle(int r) {
		double pc = 2*3.14*r;
		System.out.println("Perimeter of Circle : "+pc);
	}
	
	public void periOfSquare(int side) {
		double ps = 4*side;
		System.out.println("Perimeter Of Square : "+ps);
	}
	
	public void periOfRect(int l,int w) {
		double pr = 2 *(l+w);
		System.out.println("Perimeter of Rectangle : "+pr);
	}
	
	public void periOfTri(int a,int b,int c) {
		double pt = a+b+c;
		System.out.println("Permieter of Triangle : "+pt);
	}

}
