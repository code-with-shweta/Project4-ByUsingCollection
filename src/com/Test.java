package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	

	public static void main(String[] args) {
		Map<Double,String> m=new LinkedHashMap();
		m.put(1.2, "x");
		
		m.put(1.4, "y");
		m.put(2.8, "Tom");
		
		Set<Double>keys=m.keySet();
		for(double key:keys) {
			System.out.println(key+ " Salary of "+m.get(key));
		}
		
		

	}

}
//Set<Integer>keys=l.keySet();