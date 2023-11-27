package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentMain {

	public static void main(String[] args) {
		Student s1=new Student(1,"x",12345);
		Student s2=new Student(2,"t",5432);
		Student s3=new Student(3,"z",1654);
		Map<Integer,Student>m=new LinkedHashMap<Integer,Student>();
		m.put(s1.id, s1);
		m.put(s2.id, s2);
		m.put(s3.id, s3);
		
		//converting map into set of keys using keyset()
		Set<Integer> keys=m.keySet();
		
		//creating instance of arraylist and sorting it into list referance
		List<Student> l=new ArrayList();
		
		//traversing keys from set
		for(int key:keys) {
			Student std=m.get(key);           //getting value (student object)
			l.add(std);                       //adding value (student object) into arraylist
			System.out.println(std);          //Printing value(student object
		}
		
		System.out.println("----------------------");
		Scanner scn=new Scanner(System.in);
		System.out.println("1:Sort Student By Id\n2:Sort Student By Name ");
		System.out.println("3:Sort Student By Marks\nEnter Choice");
		int choice=scn.nextInt();
		switch(choice) {
		case 1:{
			Collections.sort(l, new SortStudentById());
			for(Student s:l) {
				System.out.println(s);
			}
		}
		break;
		case 2:{
			Collections.sort(l, new SortStudentByName());
			for(Student s:l) {
				System.out.println(s);
			}
		}
		break;
		case 3:{
			Collections.sort(l, new SortStudentByMarks());
			for(Student s:l) {
				System.out.println(s);
			}
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	

}
