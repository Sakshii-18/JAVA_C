package com.sakshi_23NovMethods;

public class Area {
	public void areaOfCircle(int r) {
		double a = 2*3.14*r*r;
		System.out.println("Area of Circle : "+a);
	}
	
	public void areaOfSqr(int side) {
		double as = side*side;
		System.out.println("Area Of Square : "+as);
	}
	
	public void areaOfRect(int l , int w) {
		double ar = l*w;
		System.out.println("Area Of Rectangle : "+ar);
	}
	
	public void areaOfTri(int b , int h) {
		double at = 0.5 * b * h;
		System.out.println("Area of Triangle : " +at);
	}

}
