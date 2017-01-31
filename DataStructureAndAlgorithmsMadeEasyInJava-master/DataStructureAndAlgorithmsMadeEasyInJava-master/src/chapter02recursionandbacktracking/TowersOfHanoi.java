/*Copyright (c) 2016. 4. 22. CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: TowerOfHanoi.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter02recursionandbacktracking;

public class TowersOfHanoi {
	void towersOfHanoi(int n, char frompeg, char topeg, char auxpeg){
		// 원반이 하나이면, 옮기고 리턴(기본 경우)
		if(n==1){
			System.out.println("Move disk 1 from peg - + frompeg + - peg " + topeg);
			return;
		}
		// 앞의 n-1개 원반을 C를 보조탑으로 이용해서 A에서 B로 옮긴다.
		towersOfHanoi(n-1, frompeg, auxpeg, topeg);
		// 나머지 원반을 A에서 C로 옮긴다.
		System.out.println("Move disk from peg" + frompeg + " to peg " + topeg);
		
		// n-1개 원반을 A를 보조탑으로 이용해서 B에서 C로 옮긴다.
		towersOfHanoi(n-1, auxpeg, topeg, frompeg);
		
	}
}
