/*Copyright (c) 2016. 4. 22. CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: TowersOfHanoiTest.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter02recursionandbacktracking;

public class TowersOfHanoiTest {
	public static void main(String[] args) {
		TowersOfHanoi hanoi = new TowersOfHanoi();
		hanoi.towersOfHanoi(5, 'a', 'b', 'c');
	}
}
