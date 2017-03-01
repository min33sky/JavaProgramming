package ex18.io;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) {
		try {
			// localHost Address
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("Local IP Address : " + local.getHostAddress());
			
			// naver Address
			InetAddress[] iaArr = InetAddress.getAllByName("www.afreeca.com");
			for(InetAddress remote : iaArr){
				System.out.println("www.naver.com : " + remote.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
}
