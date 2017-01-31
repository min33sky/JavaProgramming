package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatEx {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd aa hh시 mm분 ss초");
		String str = sdf.format(cal.getTime());
		System.out.println(str);
	}
}
