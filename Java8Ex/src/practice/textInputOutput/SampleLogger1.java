package practice.textInputOutput;

import java.io.ByteArrayInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class SampleLogger1 {
	// 프로퍼티 설정 내용
	protected static final String PROPERTIES_STRING = "handlers=java.util.logging.ConsoleHandler\n" +
			".level=INFO\n" + "java.util.logging.ConsoleHandler.level=INFO\n" +
			"java.util.logging.ConsoleHandler.formatter=java.util.logging.SimpleFormatter\n" +
			"java.util.logging.SimpleFormatter.format=%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS.%1$tL %1$tZ %4$s [%3$s] %5$s (%2$s) %6$s%n\n";
	
	
	private static Logger logger = null;
	
	// 스태틱 이니셜라이저로 LogManager에 값을 설정한다.
	static{
		try {
			// LogMannager에 프로퍼티 설정 내용을 가져온다.
			LogManager.getLogManager().readConfiguration(new ByteArrayInputStream(PROPERTIES_STRING.getBytes("UTF-8")));
			logger = Logger.getLogger(SampleLogger1.class.getName());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		SampleLogger1 saLogger = new SampleLogger1();
		saLogger.outLog();
	}

	public void outLog() {
		logger.severe("LOGTEST: SEVERE 레벨");
		logger.warning("LOGTEST: WARNING 레벨");
		logger.info("LOGTEST: INFO 레벨");
		logger.config("LOGTEST: CONFIG 레벨");
		logger.fine("LOGTEST: FINE 레벨");
		logger.finer("LOGTEST: FINER 레벨");
		logger.finest("LOGTEST: FINEST 레벨");
	}
}
