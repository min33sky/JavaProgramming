package designpattern.strategyPattern;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class Client2Test {
	@Test
	public void useConsoleLoggin(){
		final Client2 c = new Client2(new ConsoleLogging());
		c.doWork(32);
	}
	
	@Test
	public void useFileLogging() throws IOException{
		final File tempFile = File.createTempFile("test", "log");
		final Client2 c = new Client2(new FileLogging(tempFile));
		
		c.doWork(41);
		c.doWork(42);	// 로그 파일에 기록된다.
		c.doWork(43);
		
		BufferedReader reader = new BufferedReader(new FileReader(tempFile));
		assertEquals("Even number: 42", reader.readLine());
		assertEquals(-1, reader.read());
		
		
		
	}
}
