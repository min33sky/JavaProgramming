package chapter01;

import java.util.List;

public class Page50 {
	public static void main(String[] args) {
		Student s1 = new Student("양팡");
		Student s2 = new Student("금지");
		Course english = new Course("English");
		Course math = new Course("Math");
		Transcript t1 = new Transcript(s1, english); // 양팡의 영어 점수
		Transcript t2 = new Transcript(s1, math);	 // 양팡의 수학 점수
		Transcript t3 = new Transcript(s2, math);	 // 금지의 수학 점수
		
		// 양팡은 2012년에 영어과목에서 B0, 수학과목에서 D+ 취득
		t1.setDate("2012");
		t1.setGrade("B0");
		t2.setDate("2012");
		t2.setGrade("D+");
		
		// 금지는 2013년 수학에서 C+ 취득
		t3.setDate("2013");
		t3.setGrade("C+");
		
		System.out.println("--- 양팡이 듣는 수업들");
		List<Course> courses = s1.getCourses();
		for(int i=0; i < courses.size(); i++){
			System.out.println(courses.get(i).getName());
		}
		System.out.println();
		System.out.println("--- 수학을 듣는 학생들");
		List<Student> students = math.getStudents(); 
		for(int i=0; i<students.size(); i++){
			System.out.println(students.get(i).getName());
		}
		
	}
}
