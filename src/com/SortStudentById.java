package com;

import java.util.Comparator;

public class SortStudentById implements Comparator<Student> {

	@Override
	public int compare(Student x, Student y) {
		
		return x.id-y.id;     ////to compare String obj, calling CompareTo() of String class
	}

}

//x ->object to be inserted.
//y->already existing object.