package com.meghana.BasicPrograms;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Progarm3 {

	public static void main(String[] args) {
      
		//Dictionary test_Dic = new Hashtable(); // cannot create object bcz abstract so icreate child object hashtable is achild of dictionary
		Map<String, Object> Hmap = new HashMap<String, Object>(); 
		Hmap.put("Name", "Inception");
		Hmap.put("age",9);
		Hmap.put("Branch","CS");
		
		
	//	for ( String key : Hmap.keySet() ) {
	//	}

	//	for ( Object value : Hmap.values() ) {
	//	}
		for ( Map.Entry e  :Hmap.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	//	for ( Map.Entry<String, Object> entry : Hmap.entrySet() ) {
		//    String key = entry.getKey();
		//    Object value = entry.getValue();
	//	}
		
		
	//	for(Object k : test_Dic.keys());  
	//	 {
			
			
		//	Object value = test_Dic.get(k);
			
			
		//	System.out.println("The key is"+k);		
		//	System.out.println("The value is"+value);		
					
		}
			 
			 
	//	 }
		
		//for (int i = 0; i <= Enumeration list.; i++)	{
	//	Object key = ((Dictionary) list).get(i);
			
				
		
	
     ///  for(String key :test_Dic) { /////
      
       }

//}//
