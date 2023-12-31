package com;

import java.util.Comparator;

public class SortStudentByName implements Comparator<Student> {

	@Override
	public int compare(Student x, Student y) {
		
		return x.name.compareTo(y.name);   //to compare String obj, calling CompareTo() of String class
	}

}



//x ->object to be inserted.
//y->already existing object.