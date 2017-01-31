package test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

public class Tests {
	
	@Test
	public void queueInsertion(){
		Queue<String> queue = new LinkedList<String>();
		queue.add("first");
		queue.add("second");
		queue.add("third");
		
		assertEquals("first", queue.remove());
		assertEquals("second", queue.remove());
//		assertEquals("first", queue.remove());
		assertEquals("third", queue.peek());
		assertEquals("third", queue.remove());
	}
	
	@Test
	public void treeMapTraversal(){
		Map<Integer, String> counts = new TreeMap<>();
		counts.put(4, "four");
		counts.put(1, "one");
		counts.put(3, "three");
		counts.put(2, "two");
		
		Iterator<Integer> keys = counts.keySet().iterator();
		assertEquals(Integer.valueOf(1), keys.next());
		assertEquals(Integer.valueOf(2), keys.next());
		assertEquals(Integer.valueOf(3), keys.next());
		assertEquals(Integer.valueOf(4), keys.next());
		assertFalse(keys.hasNext());
	}
	
	@Test
	public void setExample(){
		Set<String> set = new HashSet<String>();
		set.add("hello");
		set.add("welcome");
		set.add("goodbye");
		set.add("bye");
		set.add("hello");
		
		assertEquals(4, set.size());
	}
}
