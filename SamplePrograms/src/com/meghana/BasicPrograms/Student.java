package com.meghana.BasicPrograms;

public abstract class Student implements Talk {
	int	id 	;
	String name;
	String branch;
	
	
	public Student(int id,String name,String branch) {
	  this.id= id;
	     this.name=name;
	    this.branch=branch;

	}
  	
public abstract double calcualteFee();

//	 public Student(int id,String name,String branch) {
	//  this.id= id;
 //     this.name=name;
   //   this.branch=branch;
   


      
      
        
}

