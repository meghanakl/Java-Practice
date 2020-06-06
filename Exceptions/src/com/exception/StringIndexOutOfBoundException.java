package com.exception;

public class StringIndexOutOfBoundException {
	 public static void main(String args[]) 
	    { 
	        try { 
	            String a = "Meghana is good girl "; 
	            char c = a.charAt(28);  
	            System.out.println(c); 
	        } 
	        catch(StringIndexOutOfBoundsException e) { 
	            System.out.println("StringIndexOutOfBoundsException"); 
	        } 
	    } 
	}  	        