package com;

import java.util.Comparator;

public class SortStudentByMarks implements Comparator<Student>{

	@Override
	public int compare(Student x, Student y) {
		
		return x.marks-y.marks;     //to compare String obj, calling CompareTo() of String clas
	}
	
}



//x ->object to be inserted.
//y->already existing object.