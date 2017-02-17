package comparable;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorAndComparable {
	public static void main(String[] args) {
		Student[] student = new Student[5];
		student[0] = new Student("기훈", 20120001, 4.2);
		student[1] = new Student("철구", 20150001, 4.5);
		student[2] = new Student("봉준", 20110001, 3.2);
		student[3] = new Student("흥민", 20130001, 2.2);
		student[4] = new Student("은호", 20140001, 4.2);

		/*
		 * Comparable 인터페이스를 구현하지 않으면
		 * 에러 발생!!
		 */
		Arrays.sort(student);
		// 출력
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
		}
		
		/*
		 * 1. 학점 높은 순으로
		 * 2. 학점이 같아면 학번(id)가 빠른 순으로
		 */
		System.out.println("Comparator 사용");
		Arrays.sort(student, new Comparator<Student>(){
			public int compare(Student s1, Student s2) {
				double s1Score = s1.score;
				double s2Score = s2.score;
				if(s1Score == s2Score){ //학점이 같으면
					return Double.compare(s1.id, s2.id); //학번 오름차순
				}
				return Double.compare(s2Score, s1Score); //내림차순
			}
		});
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
		}

		/*
		 * 이름 순 정렬
		 */
		System.out.println("이름 정렬...(오름차 순)");
		Arrays.sort(student, new Comparator<Student>(){
			@Override
			public int compare(Student stu1, Student stu2) {
				return stu1.name.compareTo(stu2.name);
			}
			
		});
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
		}
	}
}
