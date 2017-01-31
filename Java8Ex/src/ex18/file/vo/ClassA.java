package ex18.file.vo;

import java.io.Serializable;

public class ClassA implements Serializable{
	public int field1;
	public ClassB field2 = new ClassB();
	public static int field3;
	public transient int field4;
	
}
