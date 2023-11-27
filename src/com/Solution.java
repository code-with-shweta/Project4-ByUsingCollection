package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution {
public static void main(String[] args) {
	Map<Integer, String> l=new LinkedHashMap();
	l.put(1, "abc");
	l.put(2, "pqr");
	l.put(3, "xyz");
	Set<Integer>keys=l.keySet();
	for(int key:keys) {
		System.out.println(key+" "+l.get(key));
	}
	
	
	
	
}
}
