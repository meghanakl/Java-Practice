package com.inheritance.shape;

public class program {

	
		public static void main(String[] args) { 
			
		shape s =	getShapeWithMaxArea();
	
	    double b=s.calculateArea();
	    System.out.println("The area of biggest shape is "+b);
	
	}
	
	public static  shape getShapeWithMaxArea() {
	//circle c = new circle();
	//c.radius = 0;
	//return c;
	
		
	//rectangle r = new rectangle();
    //r.length = 10;
	//r.width=6;
    //return r;	
		
	//square s = new square();
	//s.length = 5;
	//return s;
		
	triangle t = new triangle();
	t.base=10;
	t.height=0;
	return t;
	}
	
		
	}
	
		
	

