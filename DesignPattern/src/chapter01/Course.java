package chapter01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 강의
 * @author Heo-MH
 *
 */
public class Course {
	private List<Transcript> transcripts;
	private String name;
	
	public Course(String name) {
		this.transcripts = new ArrayList<>();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void addTranscript(Transcript transcript){
		transcripts.add(transcript);
	}
	
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		Iterator<Transcript> itr = transcripts.iterator();
		while(itr.hasNext()){
			Transcript tr = itr.next();
			students.add(tr.getStudent());
		}
		return students;
	}
	
}
