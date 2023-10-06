package Bai2324;

import java.util.Comparator;

public class sortMark implements Comparator<Student> {

	public int compare(Student a, Student b) {
		return (int)(a.getMark() - b.getMark());
	}

}
