package hasgSetTest;

import java.util.HashMap;
import java.util.HashSet;

public class School {
	public static void main(String[] args) {
		HashSet<Student> studentSet = new HashSet<Student>();
		studentSet.add(new Student(1,"����ǥ"));
		studentSet.add(new Student(1,"����ǥ"));
		studentSet.add(new Student(1,"����ǥ"));
		studentSet.add(new Student(1,"����ǥ"));
		studentSet.add(new Student(1,"����ǥ"));
		
		System.out.println(studentSet);
		
	}
}
