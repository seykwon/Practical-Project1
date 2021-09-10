import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Student implements Comparable<Student>{
	private int no;
	private String name;
	private int age;

	public Student(int i, String string, int j) {
		no = i;
		name = string;
		age = j;
	}

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String args[]) {
		List<Student> al = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1 = new Student(101,"Kim",21);
		al.add(s1);
		Student s2 = new Student(102,"Choi",24);
		al.add(s2);
		Student s3 = new Student(103,"Park",22);
		al.add(s3);
		Student s4 = new Student(104,"Kwon",24);
		al.add(s4);
		Student s5 = new Student(105,"Bae",25);
		al.add(s5);
		Student s6 = new Student(106,"Seo",20);
		al.add(s6);
		Student s7 = new Student(107,"Kang",26);
		al.add(s7);
		Student s8 = new Student(108,"Lee",29);
		al.add(s8);
		Student s9 = new Student(109,"Lim",28);
		al.add(s9);
		Student s10 = new Student(110,"Jung",27);
		al.add(s10);
		
		Collections.sort(al);
		
		for(Student s : al) {
			System.out.println(s.toString());
		}
	}
}
