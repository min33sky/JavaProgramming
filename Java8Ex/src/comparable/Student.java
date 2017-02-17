package comparable;

public class Student implements Comparable<Student>{
	String name;
	int id;
	double score;
	
	public Student(String name, int id, double score) {
		super();
		this.name = name;
		this.id = id;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", score=" + score + "]";
	}

	// id 오름차순 정렬
	@Override
	public int compareTo(Student stu) {
//		return id - stu.id;
		return Integer.compare(id, stu.id);
	}
	
}
