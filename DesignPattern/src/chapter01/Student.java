package chapter01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 학생
 * @author Heo-MH
 *
 */
public class Student {
	private List<Transcript> transcripts;	// 성적
	private String name;
	
	public Student(String name) {
		this.transcripts = new ArrayList<>();
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void addTranscript(Transcript transcript){
		transcripts.add(transcript);
	}

	// 듣고 있는 수업 리스트를 리턴한다.
	public List<Course> getCourses(){
		List<Course> courses = new ArrayList<>();
		Iterator<Transcript> itr = transcripts.iterator();
		while(itr.hasNext()){
			Transcript tr = itr.next();
			courses.add(tr.getCourse());
		}
		
		return courses;
	}
	
}
