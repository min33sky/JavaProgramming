package practice.textInputOutput;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class SampleLogger2 {
	// 로그 설정 프로퍼티 파일명
	private static final String PROPERTIES = "practice/textInputOutput/properties/Logger.properties";
	
	private static Logger logger = null;
	
	static{
		try {
			logger = Logger.getLogger(SampleLogger2.class.getName());
			
			// 클래스 패스 안에서 프로퍼티 파일 취득
			logger.fine("로그 설정 프로퍼티 파일: " + PROPERTIES + "를 바탕으로 로그 설정");
			
			final InputStream inputStream = SampleLogger2.class.getClassLoader().getResourceAsStream(PROPERTIES);
			
			// 프로퍼티 파일을 찾지 못하면 오류를 던진다.
			if(inputStream == null){
				logger.info("로그 설정: " + PROPERTIES + "는 클래스 패스 상에서 찾을 수 없습니다.");
			}else{
				try {
					//프로퍼티 파일의 내용을 로그 매니저에 설정한다.
					LogManager.getLogManager().readConfiguration(inputStream);
					
					logger.info("로그 설정 완료 : LogManager를 설정했습니다.");
				} catch (IOException e) {
					logger.warning("로그 설정 실패: LogManager 설정 시  예외가 발생했습니다 : " + e.toString() );
				} finally {
					try {
						if(inputStream != null){
							inputStream.close();
						}
					} catch (IOException e) {
						logger.warning("로그 설정 실패: 로그 설정 프로퍼티 파일 닫기 시 예외가 발생했습니다: " + e.toString());
					}
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		SampleLogger2 saLogger = new SampleLogger2();
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
