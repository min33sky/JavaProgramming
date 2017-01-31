package designpattern.decoratorPattern;

import static org.junit.Assert.*;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import org.junit.Test;

public class DecoratorPatternTest {
	@Test
	public void decoratorPattern() throws IOException{
		File f = new File("target", "out.bin");
		FileOutputStream fos = new FileOutputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeBoolean(true);
		oos.writeInt(42);
		oos.writeObject(new ArrayList<Integer>());
		
		oos.flush();
		oos.close();
		bos.close();
		fos.close();
		
		assertTrue(f.exists());
		
	
		
		
		
		
	}
}
