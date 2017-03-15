package chapter06.printer;

import java.util.ArrayList;
/**
 * 싱글턴 패턴
 * 3대의 프린터를 관리한다.
 * 이용할 수 있는 프린터를 사용자에게 할당한다.
 * 이용이 가능한지를 확인하려면 프린터 클래스의 isAvailable 메서드 이용
 * 사용자의 출력 명령은 UserThread 클래스를 이용해 받는다.
 *
 */
public class PrinterManager {
	private static PrinterManager instance;
	private ArrayList<Printer> managedPrinters = new ArrayList<Printer>();
	
	
	private PrinterManager(){
		// 3개의 Printer Instance를 미리 생성
		managedPrinters.add(new Printer());
		managedPrinters.add(new Printer());
		managedPrinters.add(new Printer());
	}
	
	public synchronized static PrinterManager getInstance(){
		if(instance == null){
			instance = new PrinterManager();
		}
		return instance;
	}
	
	public synchronized Printer getPrinter(){
		while(true){
			for(Printer printer : managedPrinters){
				if(printer.isAvailable()){	// 프린터를 이용할 수 있는지 검사함
					printer.setAvailable(false); // 다른이의 사용 불가
					return printer;
				}
			}
		}
	}
	
}
