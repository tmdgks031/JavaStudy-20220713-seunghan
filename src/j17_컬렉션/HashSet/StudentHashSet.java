package j17_컬렉션.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import j15_스태틱.Student;

public class StudentHashSet {

	public static void main(String[] args) {
		
		Student student1 = new Student("조문기");
		Student student2 = new Student("김호영");
		Student student3 = new Student("서재효");
		Student student4 = new Student("신승한");
		Student student5 = new Student("전나경");
		
		HashSet<Student> Studentset = new HashSet<Student>();
		Student[] students = {student1, student2, student3, student4, student5};
//		Studentset.addAll(Arrays.asList(students));
		Studentset.add(student1);
		Studentset.add(student2);
		Studentset.add(student3);
		Studentset.add(student4);
		Studentset.add(student5);
		
		System.out.println(Studentset);
		
		Iterator<Student> ir = Studentset.iterator();
		while(ir.hasNext()) {
			Student student = ir.next();
			if(student.getName().equals("서재효")) {
				Studentset.remove(student);
				break;
			}
		}
		System.out.println(Studentset);
	}

}
